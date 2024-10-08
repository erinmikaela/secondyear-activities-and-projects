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

public class Update extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;

    public Update() {
        initComponents();
        Connect();
        this.jLabel3.setVisible(false);
        jPanel2.hide();
        textId.setText("");
        textId.setEnabled(false);
        textName.setText("");
        textName.setEnabled(false);
        textLast.setText("");
        textLast.setEnabled(false);
        textAddress.setText("");
        textAddress.setEnabled(false);
        textMobileNo.setText("");
        textMobileNo.setEnabled(false);
        ((JTextField) textBirthday.getDateEditor().getUiComponent()).setText("");
        textBirthday.setEnabled(false);
        textEmail.setText("");
        textEmail.setEnabled(false);
        textPass.setText("");
        textPass.setEnabled(false);
        textConPass.setText("");
        textConPass.setEnabled(false);

        editButton.setEnabled(false);
        enableEditButton.setEnabled(false);
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
        icon2 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        textName = new javax.swing.JTextField();
        textLast = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        labelA = new javax.swing.JLabel();
        labelB = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textMobileNo = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        labelPass = new javax.swing.JLabel();
        textPass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelPass1 = new javax.swing.JLabel();
        textBirthday = new com.toedter.calendar.JDateChooser();
        textError = new javax.swing.JTextField();
        textConPass = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        searchId = new javax.swing.JTextField();
        SearchButton = new javax.swing.JLabel();
        enableEditButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transtech University-Update");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package1/hide.png"))); // NOI18N
        icon2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon2MousePressed(evt);
            }
        });
        jPanel1.add(icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package1/eye.png"))); // NOI18N
        icon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon1MousePressed(evt);
            }
        });
        jPanel1.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Update Student Record");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));
        jPanel1.add(textId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 90, -1));
        jPanel1.add(textName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 180, -1));
        jPanel1.add(textLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 180, -1));

        editButton.setBackground(new java.awt.Color(166, 64, 64));
        editButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Save");
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        jPanel1.add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 70, 40));

        labelA.setText("ID");
        jPanel1.add(labelA, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        labelB.setText("First Name");
        jPanel1.add(labelB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        jLabel4.setText("Last Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, -1, -1));
        jPanel1.add(textAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 240, 30));

        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        textMobileNo.setText("09");
        jPanel1.add(textMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 239, -1));
        jPanel1.add(textEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 240, -1));

        jLabel7.setText("Email");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        labelPass.setText("Confirm Password");
        jPanel1.add(labelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, -1));

        textPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textPassMouseClicked(evt);
            }
        });
        jPanel1.add(textPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 240, -1));

        jLabel8.setText("Mobile No.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 246, -1, 20));

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

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Database");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel11)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 190, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("©2024 - TU - Manila");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 190, 450));

        jLabel15.setText("Birthday");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        labelPass1.setText("Password");
        jPanel1.add(labelPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        textBirthday.setDateFormatString("dd-MM-yyyy");
        jPanel1.add(textBirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 240, -1));

        textError.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textError.setBorder(null);
        jPanel1.add(textError, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 310, -1));

        textConPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textConPassMouseClicked(evt);
            }
        });
        jPanel1.add(textConPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 240, -1));

        jLabel9.setText("Search");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 50, 20));
        jPanel1.add(searchId, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 280, -1));

        SearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package1/search.png"))); // NOI18N
        SearchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchButtonMouseClicked(evt);
            }
        });
        jPanel1.add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 20, -1));

        enableEditButton.setBackground(new java.awt.Color(166, 64, 64));
        enableEditButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        enableEditButton.setForeground(new java.awt.Color(255, 255, 255));
        enableEditButton.setText("Update");
        enableEditButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enableEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enableEditButtonActionPerformed(evt);
            }
        });
        jPanel1.add(enableEditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 100, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, -1, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        labelA.setForeground(Color.black);
        labelB.setForeground(Color.black);
        labelPass.setForeground(Color.black);
        labelPass1.setForeground(Color.black);

        if (textPass.getText() == null || textConPass.getText() == null ? "" == null : textPass.getText().equals("") && textConPass.getText().equals("")) {
            textError.setText("Password must contain value");
            textError.setForeground(Color.red);
            labelPass.setForeground(Color.red);
            labelPass1.setForeground(Color.red);
        } else if (!textPass.getText().equals(textConPass.getText())) {
            textError.setText("Passwords do not match");
            textError.setForeground(Color.red);
            textPass.setText(null);
            textConPass.setText(null);
            labelPass.setForeground(Color.red);
            labelPass1.setForeground(Color.red);
        } else if (textPass.getText().length() < 8 || textPass.getText().length() > 20) {
            textError.setText("Password must be between 8 to 20 characters");
            textError.setForeground(Color.red);
            textPass.setText(null);
            textConPass.setText(null);
            labelPass.setForeground(Color.red);
            labelPass1.setForeground(Color.red);
        } else if (!Pattern.compile("[a-z]").matcher(textPass.getText()).find()) {
            textError.setText("Password must contain at least one lower case");
            textError.setForeground(Color.red);
            textPass.setText(null);
            textConPass.setText(null);
            labelPass.setForeground(Color.red);
            labelPass1.setForeground(Color.red);
        } else if (!Pattern.compile("[A-Z]").matcher(textPass.getText()).find()) {
            textError.setText("Password must contain at least one upper case");
            textError.setForeground(Color.red);
            textPass.setText(null);
            textConPass.setText(null);
            labelPass.setForeground(Color.red);
            labelPass1.setForeground(Color.red);
        } else if (!Pattern.compile("[0-9]").matcher(textPass.getText()).find()) {
            textError.setText("Password must contain at least one digit");
            textError.setForeground(Color.red);
            textPass.setText(null);
            textConPass.setText(null);
            labelPass.setForeground(Color.red);
            labelPass1.setForeground(Color.red);
        } else if (!Pattern.compile("[~!@#$%^&*()-+=|?.]").matcher(textPass.getText()).find()) {
            textError.setText("Password must contain at least one symbol");
            textError.setForeground(Color.red);
            textPass.setText(null);
            textConPass.setText(null);
            labelPass.setForeground(Color.red);
            labelPass1.setForeground(Color.red);
        } else {
            int answer;
            answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to update this record?", "System Message", JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) {
                try {
                    //deleteButton.setEnabled(false);
                    Connection cn;
                    Statement st;
                    String url;
                    url = "jdbc:mysql://localhost:3306/bsisdb";
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    cn = (Connection) DriverManager.getConnection(url, "root", "MySQL_Database3306");
                    st = (Statement) cn.createStatement();
                    st.executeUpdate("UPDATE reg_tbl SET  fname= '"
                            + textName.getText() + "',lname= '"
                            + textLast.getText() + "', address= '"
                            + textAddress.getText() + "',mobileno= '"
                            + textMobileNo.getText() + "',birthday= '"
                            + ((JTextField) textBirthday.getDateEditor().getUiComponent()).getText() + "',email= '"
                            + textEmail.getText() + "',password='"
                            + textPass.getText() + "'Where Id = '"
                            + searchId.getText() + "' ");
                    JOptionPane.showMessageDialog(null, "Record Updated", "System Message", JOptionPane.INFORMATION_MESSAGE);

                    textId.setText("");
                    searchId.setText("");
                    textName.setText("");
                    textLast.setText("");
                    textAddress.setText("");
                    textMobileNo.setText("");
                    ((JTextField) textBirthday.getDateEditor().getUiComponent()).setText("");
                    textEmail.setText("");
                    textPass.setText("");
                    textConPass.setText("");

                } catch (ClassNotFoundException ex) {
                    //Logger.getLogger(frameTerminateEdit.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    //Logger.getLogger(frameTerminateEdit.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_editButtonActionPerformed

    public void Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/bsisdb", "root", "MySQL_Database3306");

        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {

        }
    }

    private void textPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textPassMouseClicked
        textError.setText(null);
        labelPass1.setForeground(Color.black);
    }//GEN-LAST:event_textPassMouseClicked
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

    private void textConPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textConPassMouseClicked
        textError.setText(null);
        labelPass.setForeground(Color.black);
    }//GEN-LAST:event_textConPassMouseClicked

    private void SearchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchButtonMouseClicked
        textId.setEnabled(false);
        textName.setEnabled(false);
        textLast.setEnabled(false);
        textAddress.setEnabled(false);
        textMobileNo.setEnabled(false);
        textBirthday.setEnabled(false);
        textEmail.setEnabled(false);
        textPass.setEnabled(false);
        textConPass.setEnabled(false);

        editButton.setEnabled(false);
        try {
            pst = con.prepareStatement("select Id,fname,lname,address,mobileno,birthday,email,password from reg_tbl where Id=? ");
            int id = Integer.parseInt(searchId.getText());
            pst.setInt(1, id);
            ResultSet rs1 = pst.executeQuery();
            if (rs1.next() == false) {
                JOptionPane.showMessageDialog(this, "Sorry Record Not Found");
                textId.setText("");
                textName.setText("");
                textLast.setText("");
                textAddress.setText("");
                textMobileNo.setText("");
                ((JTextField) textBirthday.getDateEditor().getUiComponent()).setText("");
                textEmail.setText("");
                textPass.setText("");
                textConPass.setText("");

                searchId.requestFocus();
            } else {

                textId.setText(rs1.getString("id"));
                textName.setText(rs1.getString("fname"));
                textLast.setText(rs1.getString("lname"));
                textAddress.setText(rs1.getString("address"));
                textMobileNo.setText(rs1.getString("mobileno"));
                ((JTextField) textBirthday.getDateEditor().getUiComponent()).setText(rs1.getString("birthday"));
                textEmail.setText(rs1.getString("email"));
                textPass.setText(rs1.getString("password"));
                textConPass.setText(rs1.getString("password"));
                enableEditButton.setEnabled(true);
            }

        } catch (SQLException ex) {
            //Logger.getLogger(SearchJdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SearchButtonMouseClicked

    private void enableEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enableEditButtonActionPerformed
        textId.setEnabled(true);
        textName.setEnabled(true);
        textLast.setEnabled(true);
        textAddress.setEnabled(true);
        textMobileNo.setEnabled(true);
        textBirthday.setEnabled(true);
        textEmail.setEnabled(true);
        textPass.setEnabled(true);
        textConPass.setEnabled(true);

        editButton.setEnabled(true);
    }//GEN-LAST:event_enableEditButtonActionPerformed

    private void icon2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MousePressed
        icon1.setVisible(true);
        icon2.setVisible(false);
        textPass.setEchoChar((char) '*');
        textConPass.setEchoChar((char) '*');
    }//GEN-LAST:event_icon2MousePressed

    private void icon1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MousePressed
        icon2.setVisible(true);
        icon1.setVisible(false);
        textPass.setEchoChar((char) 0);
        textConPass.setEchoChar((char) 0);
    }//GEN-LAST:event_icon1MousePressed

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException{
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        UIManager.setLookAndFeel(new FlatIntelliJLaf());
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SearchButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton enableEditButton;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField searchId;
    private javax.swing.JTextField textAddress;
    private com.toedter.calendar.JDateChooser textBirthday;
    private javax.swing.JPasswordField textConPass;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textError;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textLast;
    private javax.swing.JTextField textMobileNo;
    private javax.swing.JTextField textName;
    private javax.swing.JPasswordField textPass;
    // End of variables declaration//GEN-END:variables
}
