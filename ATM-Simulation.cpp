#include <iostream>
#include <fstream>
#include <iomanip>
#include <string>
#include <conio.h>
#include <windows.h>
#include <thread>
#define MAX 10
#define RED "\x1b[31m"
#define GREEN "\x1b[32m"
#define NORMAL "\x1b[30m"
#define BLUE "\x1b[34m"
#define GRAY "\x1b[38;5;8m"

using namespace std;

typedef struct account
{
    int accountnum;
    string name;
    char birthday[10];
    long long contactnum;
    double balance;
    int pincode;
} ACC;

typedef struct adtList
{
    ACC bp[MAX];
    int last;
} LIST;

class BankAccount
{
private:
    void BalInquiry(int accountNum);
    void withdraw(int accountNum);
    void deposit(int accountNum);
    void fundTransfer(int accountNum);
    void changePin(int accountNum);
    void display(int accountNum);
    void submenu();

public:
    LIST L;
    void loginToTransact();
    void registerAcc();
    void saveRegAcc();
    void save();
    void retrieve();
    void ATM();
};

int menu();
void loading();
void loading2();

void BankAccount::loginToTransact()
{
    system("cls");
    int accountnum;
    string pincode;
    char inputPincode;
    cout << "\n\n" << setw(78) << "[LOG IN TO YOUR BANK ACCOUNT]\n\n\n";
    cout << setw(71) << "ENTER YOUR ACCOUNT NUMBER: ";
    cin >> accountnum;
    cout << "\n" <<  setw(67) << "ENTER YOUR PIN NUMBER: ";


    for (inputPincode = _getch(); inputPincode != '\r'; inputPincode = _getch())
    {
        if (inputPincode == '\b')
        {
            if (!pincode.empty())
            {
                cout << "\b \b";
                pincode.pop_back();
            }
        }
        else
        {
            cout << '*';
            pincode += inputPincode;
        }
    }

    for (int i = 0; i < L.last; i++)
    {
        if (L.bp[i].accountnum == accountnum && to_string(L.bp[i].pincode) == pincode)
        {
            display(i);
            return;
        }
    }
    cout << RED << "\n\n" << setw(91) << "LOG IN ERROR. PLEASE CHECK YOUR ACCOUNT NUMBER AND PIN NUMBER" << NORMAL << endl;
    cout << "\n\t\t\t\t\t    ";
    system("pause");
}

void BankAccount::submenu()
{
    int accountNum;
    int choice;
    do
    {
        system("cls");
        cout << "\n\n" << setw(70) << "[CONFIRMATION OPTIONS]\n\n";
        cout << GREEN << "\n" << setw(60) << "[1] Continue" << endl;
        cout << RED << "\n" << setw(69) << "[2] Back to Main Menu" << endl;
        cout << NORMAL << "\n\n" << setw(65) << "ENTER YOUR CHOICE: ";
        cin >> choice;
        switch (choice)
        {
        case 1:
            return;
        case 2:
            display(accountNum);
            break;
        default:
            cout << RED << "\n\n" << setw(83) << "Invalid choice. Please try again. (1 to 2 only)" << NORMAL << endl;
            cout << "\t\t\t\t    ";
            system("pause");
        }
    }
    while (true);
}

void BankAccount::display(int accountNum)
{
    system("cls");
    int choice;
    while (true)
    {
        system("cls");
        cout << "\n\n" << setw(69) << "[ATM SIMULATION]\n\n\n";
        cout << setw(66) << "[1] BALANCE INQUIRY\n\n";
        cout << setw(59) << "[2] WITHDRAW\n\n";
        cout << setw(58) << "[3] DEPOSIT\n\n";
        cout << setw(64) << "[4] FUND TRANSFER\n\n";
        cout << setw(61) << "[5] CHANGE PIN\n\n";
        cout << setw(66) << "[6] LOGOUT ACCOUNT\n\n\n";
        cout << setw(64) << "ENTER YOUR CHOICE: ";
        cin >> choice;
        switch (choice)
        {
        case 1:
            submenu();
            BalInquiry(accountNum);
            break;
        case 2:
            submenu();
            withdraw(accountNum);
            break;

        case 3:
            submenu();
            deposit(accountNum);
            break;
        case 4:
            submenu();
            fundTransfer(accountNum);
            break;
        case 5:
            submenu();
            changePin(accountNum);
            break;
        case 6:
            loading2();
            return;
        default:
            cout << RED << "\n\n" << setw(83) << "Invalid choice. Please try again. (1 to 6 only)" << NORMAL << endl;
            cout << "\t\t\t\t    ";
            system("pause");
        }
    }
}

void BankAccount::saveRegAcc()
{
    ofstream output("BankRecords.txt", ios::out);
    if (output.is_open())
    {
        for (int i = 0; i < L.last; i++)
        {
            output << L.bp[i].name << " " << L.bp[i].accountnum << " " << L.bp[i].pincode << " " << L.bp[i].birthday << " " << L.bp[i].contactnum << " " << L.bp[i].balance << endl;
        }
        output.close();
        save();
    }
    else
    {
        cout << "Unable to open the file for writing." << endl;
    }
}

void BankAccount::save()
{
    ofstream output("D:/ATM Machine/Pincode.txt", ios::out);
    if (output.is_open())
    {
        for (int i = 0; i < L.last; i++)
        {
            output << L.bp[i].accountnum << " " << L.bp[i].pincode << endl;
        }
        output.close();
    }
    else
    {
        cout << "Unable to open the file for writing." << endl;
    }
}

void BankAccount::registerAcc()
{
    system("cls");
    cout << "\n\n" << setw(70) << "[REGISTER ACCOUNT]" << endl << endl;
    cout << BLUE << setw(109) <<  "[IMPORTANT: PLEASE TAKE NOTE OF YOUR ACCOUNT NUMBER AND PIN CODE TO AVOID PROBLEMS WHEN LOGGING IN.]"  << NORMAL << endl;
    if (L.last < MAX)
    {
        int accountNum;
        srand(time(0));
        accountNum = rand() % 900000 + 100000;
        cout << "\n" << setw(42) << char(16) << " Your generated account number is: " << accountNum << endl;
        L.bp[L.last].accountnum = accountNum;

        cout << "\n" << setw(42) << char(16) << " Enter your name (First Name, Surname): ";
        cin.ignore();
        getline(cin, L.bp[L.last].name);

        cout << "\n" << setw(42) << char(16) << " Enter your birthday (MM/DD/YYYY): ";
        cin >> L.bp[L.last].birthday;

        string contactnumStr;
        while(contactnumStr.length() != 9)
        {
            cout <<  "\n" << setw(42) << char(16) << " Enter your contact number: " << GRAY << "09" << NORMAL;
            cin >> L.bp[L.last].contactnum;

            contactnumStr = to_string(L.bp[L.last].contactnum);
            if (contactnumStr.length() != 9)
            {
                cout << RED << "\n\n" << setw(99) << "ERROR: Contact number must be 11 digits long. Please try again." << NORMAL << endl;
                cout << "\t\t\t\t    ";
                system("pause");
            }
            else if (contactnumStr[0] == '0')
            {
                cout << RED << "\n\n" << setw(95) << "ERROR: Contact number not start with 0. Please try again." << NORMAL << endl;
                cout << "\t\t\t\t    ";
                system("pause");
            }
            else break;
        }


        while (L.bp[L.last].balance < 5000)
        {
            cout << "\n" << setw(42) << char(16) << " Enter your initial deposit amount (minimum $5,000): ";
            cin >> L.bp[L.last].balance;

            if (L.bp[L.last].balance < 5000)
            {
                cout << RED << "\n\n" << setw(100) << "ERROR: Minimum initial deposit must be $5,000. Please try again." << NORMAL << endl;
                cout << "\t\t\t\t    ";
                system("pause");
            }
            else break;
        }

        string pincodeStr;
        bool validPin = false;

        while (!validPin)
        {
            cout << "\n" << setw(42) << char(16) << " Enter your 6-digit PIN code: ";
            cin >> pincodeStr;

            if (pincodeStr.length() != 6 || pincodeStr.find_first_not_of("0123456789") != string::npos || pincodeStr[0] == '0')
            {
                cout << RED << "\n\n" << setw(100) << "ERROR: PIN code should be a 6-digit number without symbols and not starting with 0." << NORMAL << endl;
                cout << "\t\t\t\t       ";
                system("pause");
            }
            else
            {
                L.bp[L.last].pincode = stoi(pincodeStr);
                validPin = true;
            }
        }

        L.last++;

        cout << GREEN << "\n\n" << setw(73) << "[ACCOUNT SUCCESSFULLY MADE]" << NORMAL <<  endl;
        cout << "\t\t\t\t\t      ";
        system("pause");
    }
    else
    {
        cout << RED << "\n\n" << setw(80) << "[MAXIMUM NUMBER OF ACCOUNTS REACHED]" << NORMAL << endl;
        cout << "\t\t\t\t\t    ";
        system("pause");
    }
    saveRegAcc();
    save();
}

void BankAccount::BalInquiry(int accountNum)
{
    system("cls");
    cout << "\n\n" << setw(71) << "[BALANCE INQUIRY]\n\n\n";
    cout << setw(65) << "Your balance is: $" << L.bp[accountNum].balance << endl;
    cout << "\n\t\t\t\t\t  ";
    system("pause");

}

void BankAccount::withdraw(int accountNum)
{
    system("cls");
    double amount;
    cout << "\n\n" << setw(66) << "[WITHDRAW]\n\n\n";
    cout << setw(73) << "Enter the amount to withdraw: $";
    cin >> amount;
    if (amount <= L.bp[accountNum].balance)
    {
        L.bp[accountNum].balance -= amount;
        cout << GREEN << "\n" << setw (70) << "Withdrawal successful!" << NORMAL << endl;
        cout << "\n" << setw(62) << "Remaining balance: $" << L.bp[accountNum].balance << endl;
    }
    else
    {
        cout << RED << "\n" << setw(70) << "Insufficient balance!" << NORMAL << endl;
    }
    cout << "\n\t\t\t\t\t  ";
    system("pause");
    saveRegAcc();
    save();
}

void BankAccount::deposit(int accountNum)
{
    system("cls");
    double amount;
    cout << "\n\n" << setw(66) << "[DEPOSIT]\n\n\n";
    cout << setw(73) << "Enter the amount to deposit: $";
    cin >> amount;
    L.bp[accountNum].balance += amount;
    cout << GREEN << "\n" << setw (70) << "Deposit successful!" << NORMAL << endl;
    cout << "\n" << setw(61) << "Updated balance: $" << L.bp[accountNum].balance << endl;
    cout << "\n\t\t\t\t\t   ";
    system("pause");
    saveRegAcc();
    save();
}

void BankAccount::fundTransfer(int accountNum)
{
    system("cls");
    int targetAccountNum;
    double amount;
    cout << "\n\n" << setw(70) << "[FUND TRANSFER]\n\n\n";
    cout << setw(84) << "Enter the target account number to transfer funds: ";
    cin >> targetAccountNum;
    if (targetAccountNum == L.bp[accountNum].accountnum)
    {
        cout << RED << "\n" << setw(84) << "Cannot transfer funds to your own account!" << NORMAL << endl;
        cout << "\n\t\t\t\t\t   ";
        system("pause");
        system("cls");
        return;
    }
    bool targetFound = false;
    int targetIndex = -1;
    for (int i = 0; i < L.last; i++)
    {
        if (L.bp[i].accountnum == targetAccountNum)
        {
            targetFound = true;
            targetIndex = i;
            break;
        }
    }

    if (targetFound)
    {
        system("cls");
        cout << "\n\n" << setw(80) << "[FUND TRANSFER]\n\n\n";
        cout << setw(73) << "Enter the amount to transfer: $";
        cin >> amount;
        if (amount <= L.bp[accountNum].balance)
        {
            L.bp[accountNum].balance -= amount;
            L.bp[targetIndex].balance += amount;
            cout << GREEN << "\n" << setw (70) << "Fund transfer successful!" << NORMAL << endl;
            cout << setw(63) << "Updated balance: $" << L.bp[accountNum].balance << endl;
        }
        else
        {
            cout << RED << "\n" << setw (69) << "Insufficient funds!" << NORMAL << endl;
        }
    }
    else
    {
        cout << RED << "\n" << setw (70) << "Target account not found!" << NORMAL << endl;
    }
    cout << "\n\t\t\t\t\t   ";
    system("pause");
    saveRegAcc();
    save();
}

void BankAccount::changePin(int accountNum)
{
    system("cls");
    string newPin;
    bool validPin = false;

    cout << "\n\n" << setw(71) << "[CHANGE PIN CODE]\n\n\n";

    while (!validPin)
    {
        cout << setw(73) << "Enter your new 6-digit PIN code: ";
        cin >> newPin;

        if (newPin.length() != 6 || newPin.find_first_not_of("0123456789") != string::npos || newPin[0] == '0')
        {
            cout << RED << "\n\n" << setw(100) << "ERROR: PIN code should be a 6-digit number without symbols and not starting with 0." << NORMAL << endl;
            cout << "\t\t\t\t       ";
            system("pause");
        }
        else
        {
            L.bp[accountNum].pincode = stoi(newPin); // Convert string to integer for storage
            validPin = true;
        }
    }

    cout << GREEN << "\n" << setw(75) << "PIN code changed successfully!" << NORMAL << endl;
    cout << "\n\t\t\t\t\t   ";
    system("pause");

    saveRegAcc();
    save();
}

void BankAccount::retrieve()
{
    ifstream input2("BankRecords.txt", ios::in);
    if (input2.is_open())
    {
        L.last = 0;
        while (input2 >> L.bp[L.last].name >> L.bp[L.last].accountnum >> L.bp[L.last].pincode >> L.bp[L.last].birthday >> L.bp[L.last].contactnum >> L.bp[L.last].balance)
        {
            L.last++;
        }
    }
    else
    {
        cout << "Unable to open the file for reading." << endl;
    }
    input2.close();

    while(true)
    {
        ifstream input("D:/ATM Machine/Pincode.txt", ios::in);
        system("cls");

        if (input.is_open())
        {
            loading();
            L.last = 0;
            while (input >> L.bp[L.last].accountnum >> L.bp[L.last].pincode)
            {
                L.last++;
            }
            input.close();
            break;
        }

        system("cls");
        cout << "\n\n\n\n" << setw(68) << "[ATM SIMULATION]";
        cout << "\n\n\n\n\n\n" << setw(69) << "PLEASE INSERT CARD";
        this_thread::sleep_for(chrono::seconds(3));
    }
}

int main()
{
    BankAccount atm;
    atm.L.last = 0;
    system("color F0");
    atm.retrieve();
    while (true)
    {
        int choice = menu();
        switch (choice)
        {
        case 1:
            atm.loginToTransact();
            break;
        case 2:
            atm.registerAcc();
            break;
        case 3:
            cout << GREEN << "\n\n" << setw(81) << "Thank you for using ATM Simulation Program!" << NORMAL << endl;
            system("pause");
            return 0;
        default:
            cout << RED << "\n\n" << setw(83) << "Invalid choice. Please try again. (1 to 3 only)" << NORMAL << endl;
            cout << "\t\t\t\t    ";
            system("pause");
        }
    }
    return 0;
}

int menu()
{
    system("cls");
    int choice;
    cout << "\n\n" << setw(71) << "[ATM SIMULATION]\n\n\n";
    cout << setw(79) << "[1] LOG IN REGISTERED BANK ACCOUNT\n\n";
    cout << setw(74) << "[2] REGISTER NEW BANK ACCOUNT\n\n";
    cout << setw(77) << "[3] EXIT ATM SIMULATION PROGRAM\n\n\n";
    cout << setw(62) << "ENTER YOUR CHOICE: ";
    cin >> choice;
    return choice;
}

void loading()
{
    system("color F9");

    char a = 177, b = 219;

    printf("\n\n\n\n\n\n\n\n");
    cout << setw(77) << ".......... |LOADING| ...........\n\n";

    setw(44);
    for (int i = 0; i < 32; i++)
        cout << a;

    cout << "\r" << setw(44);

    for (int i = 0; i < 32; i++)
    {
        cout << b;
        Sleep(50);
    }

    Sleep(500);
    system("color F0");
}

void loading2()
{
    system("cls");
    cout << "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
    cout << "\t\t\t\t\t\t\t\t\t\t\t\tLoading";
    for(int i =0; i<= 7; i++)
    {
        Sleep(200);
        printf(".");
    }
}
