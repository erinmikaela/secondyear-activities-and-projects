/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package package1;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Statement;
import javax.swing.JTextField;
import java.util.regex.*;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Insert extends javax.swing.JFrame {

    static Connection connection;
    static String url;
    static Statement st;
    static ResultSet rs;

    public int search(String id, String name)
            throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        url = "jdbc:mysql://localhost:3306/bsisdb";
        connection = DriverManager.getConnection(url, "root", "MySQL_Database3306");
        st = connection.createStatement();
        rs = st.executeQuery("Select * From reg_tbl Where id= '" + id + "'  "
                + "and fname = '" + name + "'");
        if (rs != null) {
            return 1;
        } else {
            return 0;
        }

    }

    public Insert() {
        initComponents();
        //Insert.this.setLocation(400, 180);
        this.jLabel3.setVisible(false);
        jPanel2.hide();
        this.icon2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        textUserId = new javax.swing.JTextField();
        textUserName = new javax.swing.JTextField();
        textLastName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        labelA = new javax.swing.JLabel();
        labelB = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textUserAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textContactNumber = new javax.swing.JTextField();
        textEmailAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        labelPass = new javax.swing.JLabel();
        textPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelPass1 = new javax.swing.JLabel();
        textBirthday = new com.toedter.calendar.JDateChooser();
        textError = new javax.swing.JTextField();
        textError1 = new javax.swing.JTextField();
        textConPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transtech University-Insert");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Insert Student Record");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package1/hide.png"))); // NOI18N
        icon2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon2MousePressed(evt);
            }
        });
        jPanel1.add(icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package1/eye.png"))); // NOI18N
        icon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon1MousePressed(evt);
            }
        });
        jPanel1.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        textUserId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textUserIdMouseClicked(evt);
            }
        });
        jPanel1.add(textUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 90, -1));

        textUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textUserNameMouseClicked(evt);
            }
        });
        jPanel1.add(textUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 180, -1));
        jPanel1.add(textLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 180, -1));

        jButton1.setBackground(new java.awt.Color(166, 64, 64));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 80, 40));

        labelA.setText("ID");
        jPanel1.add(labelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        labelB.setText("First Name");
        jPanel1.add(labelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        jLabel4.setText("Last Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));
        jPanel1.add(textUserAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 240, 30));

        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        textContactNumber.setText("09");
        jPanel1.add(textContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 239, -1));
        jPanel1.add(textEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 240, -1));

        jLabel7.setText("Email");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        labelPass.setText("Confirm Password");
        jPanel1.add(labelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        textPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textPasswordMouseClicked(evt);
            }
        });
        jPanel1.add(textPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 240, -1));

        jLabel8.setText("Mobile No.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 196, -1, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package1/menu.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package1/menu.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package1/banner.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jPanel2.setBackground(new java.awt.Color(166, 64, 64));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package1/Tech2.png"))); // NOI18N
        jButton2.setBorder(null);
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 61));

        jPanel3.setBackground(new java.awt.Color(166, 64, 64));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel3MouseMoved(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Home");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 190, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("©2024 - TU - Manila");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jPanel4.setBackground(new java.awt.Color(166, 64, 64));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel4MouseMoved(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Database");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 190, -1));

        jPanel7.setBackground(new java.awt.Color(166, 64, 64));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.setPreferredSize(new java.awt.Dimension(190, 54));
        jPanel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel7MouseMoved(evt);
            }
        });
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Logout");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 190, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 190, 440));

        jLabel15.setText("Birthday");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        labelPass1.setText("Password");
        jPanel1.add(labelPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        textBirthday.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(textBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 240, -1));

        textError.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textError.setBorder(null);
        jPanel1.add(textError, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 360, -1));

        textError1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textError1.setBorder(null);
        jPanel1.add(textError1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 240, -1));

        textConPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textConPasswordMouseClicked(evt);
            }
        });
        jPanel1.add(textConPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        labelA.setForeground(Color.black);
        labelB.setForeground(Color.black);
        labelPass.setForeground(Color.black);
        labelPass1.setForeground(Color.black);

        int check = 0;
        try {
            check = search(textUserId.getText(),
                    textUserName.getText());
        } catch (SQLException ex) {
            // Logger.getLogger(frameRegister.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(frameRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (check == 1) {
            try {
                if (textPassword.getText() == null || textConPassword.getText() == null ? "" == null : textPassword.getText().equals("") && textConPassword.getText().equals("")) {
                    textError.setText("Password must contain value");
                    textError.setForeground(Color.red);
                    textUserAddress.setText(null);
                    textUserId.setText(null);
                    textUserName.setText(null);
                    textContactNumber.setText(null);
                    ((JTextField) textBirthday.getDateEditor().getUiComponent()).setText(null);
                    textLastName.setText(null);
                    textPassword.setText(null);
                    textEmailAddress.setText(null);
                    labelPass.setForeground(Color.red);
                    labelPass1.setForeground(Color.red);
                } else if (!textPassword.getText().equals(textConPassword.getText())) {
                    textError.setText("Passwords do not match");
                    textError.setForeground(Color.red);
                    textUserAddress.setText(null);
                    textUserId.setText(null);
                    textUserName.setText(null);
                    textContactNumber.setText(null);
                    ((JTextField) textBirthday.getDateEditor().getUiComponent()).setText(null);
                    textLastName.setText(null);
                    textPassword.setText(null);
                    textEmailAddress.setText(null);
                    labelPass.setForeground(Color.red);
                    labelPass1.setForeground(Color.red);
                } else if (textPassword.getText().length() < 8 || textPassword.getText().length() > 20) {
                    textError.setText("Password must be between 8 to 20 characters");
                    textError.setForeground(Color.red);
                    textUserAddress.setText(null);
                    textUserId.setText(null);
                    textUserName.setText(null);
                    textContactNumber.setText(null);
                    ((JTextField) textBirthday.getDateEditor().getUiComponent()).setText(null);
                    textLastName.setText(null);
                    textPassword.setText(null);
                    textEmailAddress.setText(null);
                    labelPass.setForeground(Color.red);
                    labelPass1.setForeground(Color.red);
                } else if (!Pattern.compile("[a-z]").matcher(textPassword.getText()).find()) {
                    textError.setText("Password must contain at least one lower case");
                    textError.setForeground(Color.red);
                    textUserAddress.setText(null);
                    textUserId.setText(null);
                    textUserName.setText(null);
                    textContactNumber.setText(null);
                    ((JTextField) textBirthday.getDateEditor().getUiComponent()).setText(null);
                    textLastName.setText(null);
                    textPassword.setText(null);
                    textEmailAddress.setText(null);
                    labelPass.setForeground(Color.red);
                    labelPass1.setForeground(Color.red);
                } else if (!Pattern.compile("[A-Z]").matcher(textPassword.getText()).find()) {
                    textError.setText("Password must contain at least one upper case");
                    textError.setForeground(Color.red);
                    textUserAddress.setText(null);
                    textUserId.setText(null);
                    textUserName.setText(null);
                    textContactNumber.setText(null);
                    ((JTextField) textBirthday.getDateEditor().getUiComponent()).setText(null);
                    textLastName.setText(null);
                    textPassword.setText(null);
                    textEmailAddress.setText(null);
                    labelPass.setForeground(Color.red);
                    labelPass1.setForeground(Color.red);
                } else if (!Pattern.compile("[0-9]").matcher(textPassword.getText()).find()) {
                    textError.setText("Password must contain at least one digit");
                    textError.setForeground(Color.red);
                    textUserAddress.setText(null);
                    textUserId.setText(null);
                    textUserName.setText(null);
                    textContactNumber.setText(null);
                    ((JTextField) textBirthday.getDateEditor().getUiComponent()).setText(null);
                    textLastName.setText(null);
                    textPassword.setText(null);
                    textEmailAddress.setText(null);
                    labelPass.setForeground(Color.red);
                    labelPass1.setForeground(Color.red);
                } else if (!Pattern.compile("[~!@#$%^&*()-+=|?.]").matcher(textPassword.getText()).find()) {
                    textError.setText("Password must contain at least one symbol");
                    textError.setForeground(Color.red);
                    textUserAddress.setText(null);
                    textUserId.setText(null);
                    textUserName.setText(null);
                    textContactNumber.setText(null);
                    ((JTextField) textBirthday.getDateEditor().getUiComponent()).setText(null);
                    textLastName.setText(null);
                    textPassword.setText(null);
                    textEmailAddress.setText(null);
                    labelPass.setForeground(Color.red);
                    labelPass1.setForeground(Color.red);
                }

                if ((textUserId.getText() == null ? "" == null
                        : textUserId.getText().equals(""))
                        || (textUserName.getText() == null ? "" == null
                        : textUserName.getText().equals(""))) {
                    textError1.setText("ID and Name is Required");
                    textError1.setForeground(Color.red);
                    labelB.setForeground(Color.red);
                    labelA.setForeground(Color.red);
                }else {
                    textError.setText(null);
                    st.executeUpdate("Insert into reg_tbl("
                            + "Id,fname,lname,address,mobileno,birthday,email,"
                            + "password" + ") VALUES ('"
                            + textUserId.getText() + "','"
                            + textUserName.getText() + "','"
                            + textLastName.getText() + "','"
                            + textUserAddress.getText() + "','"
                            + textContactNumber.getText() + "','"
                            + ((JTextField) textBirthday.getDateEditor().getUiComponent()).getText() + "','"
                            + textEmailAddress.getText() + "','"
                            + textPassword.getText() + "')");
                    JOptionPane.showMessageDialog(null, "Record Created",
                            "System Message", JOptionPane.INFORMATION_MESSAGE);
                    textUserId.setText("");
                    textUserAddress.setText(null);
                    textUserName.setText(null);
                    textLastName.setText(null);
                    textContactNumber.setText(null);
                    ((JTextField) textBirthday.getDateEditor().getUiComponent()).setText(null);
                    textEmailAddress.setText(null);
                    textPassword.setText(null);
                    textConPassword.setText(null);
                }
            } catch (SQLException ex) {
                // Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,
                        "Record Already Exist", "System Message",
                        JOptionPane.ERROR_MESSAGE);
                textUserAddress.setText(null);
                textUserId.setText(null);
                textUserName.setText(null);
                textContactNumber.setText(null);
                ((JTextField) textBirthday.getDateEditor().getUiComponent()).setText(null);
                textBirthday.setDateFormatString(null);
                textLastName.setText(null);
                textEmailAddress.setText(null);
                textPassword.setText(null);
                textConPassword.setText(null);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed
    int x = 0;
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        jLabel5.setVisible(true);
        jLabel3.setVisible(false);
        if (x == 190) {
            //jPanel2.setSize(190, 440);
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 190; i >= 0; i--) {
                            Thread.sleep(3);
                            jPanel2.setSize(i, 440);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };
            th.start();
            x = 0;
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        jLabel3.setVisible(true);
        jLabel5.setVisible(false);
        if (x == 0) {
            jPanel2.show();
            jPanel2.setSize(x, 440);
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 0; i <= x; i++) {
                            Thread.sleep(3);
                            jPanel2.setSize(i, 440);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };
            th.start();
            x = 190;
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jPanel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseMoved
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
    }//GEN-LAST:event_jPanel3MouseMoved

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(166, 64, 64)));
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseMoved
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
    }//GEN-LAST:event_jPanel7MouseMoved

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(166, 64, 64)));
    }//GEN-LAST:event_jPanel7MouseExited

    private void textUserIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textUserIdMouseClicked
        textError1.setText(null);
        labelA.setForeground(Color.black);
    }//GEN-LAST:event_textUserIdMouseClicked

    private void textUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textUserNameMouseClicked
        textError1.setText(null);
        labelB.setForeground(Color.black);
    }//GEN-LAST:event_textUserNameMouseClicked

    private void textPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textPasswordMouseClicked
        textError.setText(null);
        labelPass1.setForeground(Color.black);
    }//GEN-LAST:event_textPasswordMouseClicked

    private void textConPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textConPasswordMouseClicked
        textError.setText(null);
        labelPass.setForeground(Color.black);
    }//GEN-LAST:event_textConPasswordMouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        FrameMain page = new FrameMain();
        page.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        Login page = new Login();
        page.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseMoved
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(242, 242, 242)));
    }//GEN-LAST:event_jPanel4MouseMoved

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        Database page = new Database();
        page.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(166, 64, 64)));
    }//GEN-LAST:event_jPanel4MouseExited

    private void icon2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MousePressed
        icon1.setVisible(true);
        icon2.setVisible(false);
        textPassword.setEchoChar((char) '*');
        textConPassword.setEchoChar((char) '*');
    }//GEN-LAST:event_icon2MousePressed

    private void icon1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MousePressed
        icon2.setVisible(true);
        icon1.setVisible(false);
        textPassword.setEchoChar((char) 0);
        textConPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_icon1MousePressed

    public static void main(String args[]) throws UnsupportedLookAndFeelException{
        UIManager.setLookAndFeel(new FlatIntelliJLaf());
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel labelA;
    private javax.swing.JLabel labelB;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelPass1;
    private com.toedter.calendar.JDateChooser textBirthday;
    private javax.swing.JPasswordField textConPassword;
    private javax.swing.JTextField textContactNumber;
    private javax.swing.JTextField textEmailAddress;
    private javax.swing.JTextField textError;
    private javax.swing.JTextField textError1;
    private javax.swing.JTextField textLastName;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textUserAddress;
    private javax.swing.JTextField textUserId;
    private javax.swing.JTextField textUserName;
    // End of variables declaration//GEN-END:variables
}
