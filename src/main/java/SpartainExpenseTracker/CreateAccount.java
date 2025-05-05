
package SpartainExpenseTracker;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
/**
 *
 * @author royperlman
 */
public class CreateAccount extends javax.swing.JFrame
{

    public CreateAccount() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        Border StudentID = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jPanelID.setBorder(StudentID);
      
        Border FirstName = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jPanelFirstName.setBorder(FirstName) ;
        
        Border LastName = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jPanelLastName.setBorder(LastName) ;
        
        Border CreatePassword = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jPanelCreatePassword.setBorder(CreatePassword) ;
        
        Border ConfirmPassword = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jPanelCreatePassword.setBorder(ConfirmPassword);
        
        Border EnterConfirmPassword = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jPanelConfirmPassword.setBorder(EnterConfirmPassword);
        
        Border jLabelMiddleName = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jPanelMiddleName.setBorder(jLabelMiddleName);
       
        Border jTextPanelEnterStudentID = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        EnterStudentID.setBorder(jTextPanelEnterStudentID);
        
        Border jTextPanelEnterLastName = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jEnterLastName.setBorder(jTextPanelEnterLastName);
        
        Border jCreatPasswordField1 =  BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jEnterCreatePassword.setBorder(jCreatPasswordField1);
        
        Border jPConfirmPasswordfield1 = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jEnterConfirmPassword.setBorder(jPConfirmPasswordfield1);  
        
        Border jTextPaneEnterFirstName = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jEnterFirstName.setBorder(jTextPaneEnterFirstName);
        
        Border jTextFieldMiddleName = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jPanel3.setBorder(jTextFieldMiddleName);
    }
    
    Connection connection = null;
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelLastName = new javax.swing.JPanel();
        LastName = new javax.swing.JLabel();
        jEnterCreatePassword = new javax.swing.JPanel();
        jCreatePasswordField1 = new javax.swing.JPasswordField();
        jPanelID = new javax.swing.JPanel();
        StudentID = new javax.swing.JLabel();
        EnterStudentID = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneEnterStudentID = new javax.swing.JTextPane();
        jPanelFirstName = new javax.swing.JPanel();
        FirstName = new javax.swing.JLabel();
        jEnterFirstName = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneEnterFirstName = new javax.swing.JTextPane();
        jPanelConfirmPassword = new javax.swing.JPanel();
        ConfirmPassword = new javax.swing.JLabel();
        jEnterLastName = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPaneEnterLastName = new javax.swing.JTextPane();
        jPanelCreatePassword = new javax.swing.JPanel();
        CreatePassword = new javax.swing.JLabel();
        jEnterConfirmPassword = new javax.swing.JPanel();
        jPConfirmPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        jPanelMiddleName = new javax.swing.JPanel();
        jLabelMiddleName = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldMIddleName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        LastName.setText("Enter Last Name:");

        javax.swing.GroupLayout jPanelLastNameLayout = new javax.swing.GroupLayout(jPanelLastName);
        jPanelLastName.setLayout(jPanelLastNameLayout);
        jPanelLastNameLayout.setHorizontalGroup(
            jPanelLastNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLastNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LastName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLastNameLayout.setVerticalGroup(
            jPanelLastNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLastNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LastName)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jCreatePasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCreatePasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jEnterCreatePasswordLayout = new javax.swing.GroupLayout(jEnterCreatePassword);
        jEnterCreatePassword.setLayout(jEnterCreatePasswordLayout);
        jEnterCreatePasswordLayout.setHorizontalGroup(
            jEnterCreatePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCreatePasswordField1)
        );
        jEnterCreatePasswordLayout.setVerticalGroup(
            jEnterCreatePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEnterCreatePasswordLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jCreatePasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        StudentID.setText("Enter Student ID");

        javax.swing.GroupLayout jPanelIDLayout = new javax.swing.GroupLayout(jPanelID);
        jPanelID.setLayout(jPanelIDLayout);
        jPanelIDLayout.setHorizontalGroup(
            jPanelIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StudentID)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelIDLayout.setVerticalGroup(
            jPanelIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIDLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(StudentID)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jTextPaneEnterStudentID);

        javax.swing.GroupLayout EnterStudentIDLayout = new javax.swing.GroupLayout(EnterStudentID);
        EnterStudentID.setLayout(EnterStudentIDLayout);
        EnterStudentIDLayout.setHorizontalGroup(
            EnterStudentIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnterStudentIDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        EnterStudentIDLayout.setVerticalGroup(
            EnterStudentIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnterStudentIDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FirstName.setText("Enter First Name:");

        javax.swing.GroupLayout jPanelFirstNameLayout = new javax.swing.GroupLayout(jPanelFirstName);
        jPanelFirstName.setLayout(jPanelFirstNameLayout);
        jPanelFirstNameLayout.setHorizontalGroup(
            jPanelFirstNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFirstNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanelFirstNameLayout.setVerticalGroup(
            jPanelFirstNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFirstNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jTextPaneEnterFirstName.setContentType("John"); // NOI18N
        jScrollPane2.setViewportView(jTextPaneEnterFirstName);

        javax.swing.GroupLayout jEnterFirstNameLayout = new javax.swing.GroupLayout(jEnterFirstName);
        jEnterFirstName.setLayout(jEnterFirstNameLayout);
        jEnterFirstNameLayout.setHorizontalGroup(
            jEnterFirstNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEnterFirstNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jEnterFirstNameLayout.setVerticalGroup(
            jEnterFirstNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEnterFirstNameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ConfirmPassword.setText("Confirm Password");

        javax.swing.GroupLayout jPanelConfirmPasswordLayout = new javax.swing.GroupLayout(jPanelConfirmPassword);
        jPanelConfirmPassword.setLayout(jPanelConfirmPasswordLayout);
        jPanelConfirmPasswordLayout.setHorizontalGroup(
            jPanelConfirmPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConfirmPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConfirmPassword)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelConfirmPasswordLayout.setVerticalGroup(
            jPanelConfirmPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConfirmPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConfirmPassword)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jTextPaneEnterLastName);

        javax.swing.GroupLayout jEnterLastNameLayout = new javax.swing.GroupLayout(jEnterLastName);
        jEnterLastName.setLayout(jEnterLastNameLayout);
        jEnterLastNameLayout.setHorizontalGroup(
            jEnterLastNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEnterLastNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jEnterLastNameLayout.setVerticalGroup(
            jEnterLastNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEnterLastNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CreatePassword.setText("Create Password");

        javax.swing.GroupLayout jPanelCreatePasswordLayout = new javax.swing.GroupLayout(jPanelCreatePassword);
        jPanelCreatePassword.setLayout(jPanelCreatePasswordLayout);
        jPanelCreatePasswordLayout.setHorizontalGroup(
            jPanelCreatePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCreatePasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CreatePassword)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCreatePasswordLayout.setVerticalGroup(
            jPanelCreatePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCreatePasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CreatePassword)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPConfirmPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPConfirmPasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jEnterConfirmPasswordLayout = new javax.swing.GroupLayout(jEnterConfirmPassword);
        jEnterConfirmPassword.setLayout(jEnterConfirmPasswordLayout);
        jEnterConfirmPasswordLayout.setHorizontalGroup(
            jEnterConfirmPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEnterConfirmPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPConfirmPasswordField1)
                .addContainerGap())
        );
        jEnterConfirmPasswordLayout.setVerticalGroup(
            jEnterConfirmPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEnterConfirmPasswordLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPConfirmPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon("/Users/royperlman/NetBeansProjects/SpartainExpenseTracker/src/main/java/SpartainExpenseTracker/icons8-back-arrow-32.png")); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ResetButton.setIcon(new javax.swing.ImageIcon("/Users/royperlman/NetBeansProjects/SpartainExpenseTracker/src/main/java/SpartainExpenseTracker/icons8-reset-24.png")); // NOI18N
        ResetButton.setText("Reset");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        SubmitButton.setIcon(new javax.swing.ImageIcon("/Users/royperlman/NetBeansProjects/SpartainExpenseTracker/src/main/java/SpartainExpenseTracker/icons8-submit-document-50.png")); // NOI18N
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        jLabelMiddleName.setText("Enter Middle Name: (Optional)");

        javax.swing.GroupLayout jPanelMiddleNameLayout = new javax.swing.GroupLayout(jPanelMiddleName);
        jPanelMiddleName.setLayout(jPanelMiddleNameLayout);
        jPanelMiddleNameLayout.setHorizontalGroup(
            jPanelMiddleNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMiddleNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMiddleName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMiddleNameLayout.setVerticalGroup(
            jPanelMiddleNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMiddleNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMiddleName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextFieldMIddleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMIddleNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextFieldMIddleName)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTextFieldMIddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 87, Short.MAX_VALUE)
                        .addComponent(SubmitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(336, 336, 336))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jEnterConfirmPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanelID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanelLastName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jEnterLastName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanelCreatePassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanelConfirmPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jEnterFirstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EnterStudentID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jEnterCreatePassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanelFirstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanelID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnterStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jEnterFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jPanelLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEnterLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCreatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEnterCreatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEnterConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitButton)
                    .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.dispose();
        
        LoginAndCreateAccount createAndLogin = new LoginAndCreateAccount();
        
        createAndLogin.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        
        jTextPaneEnterStudentID.setText("");
        jTextPaneEnterFirstName.setText("");
        jTextFieldMIddleName.setText("");
        jTextPaneEnterLastName.setText("");
        jCreatePasswordField1.setText("");
        jPConfirmPasswordField1.setText("");
        
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        
        //int studentID = Integer.parseInt(jTextPaneEnterStudentID.getText());
       
        if(DataStorage.StoreUser(jTextPaneEnterStudentID.getText(),jTextPaneEnterFirstName.getText(),jTextFieldMIddleName.getText(),
            jTextPaneEnterLastName.getText(),jCreatePasswordField1.getText(), jPConfirmPasswordField1.getText()))
        {
            UserData.currentUser = DataStorage.getUser(jTextPaneEnterStudentID.getText());

            DataStorage.SaveData();
            
            this.dispose();

            HomePage HP = new HomePage();

            HP.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Sorry, Invalid entry. This Account either Exist or Form not Finished.");
        }         
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void jCreatePasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCreatePasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCreatePasswordField1ActionPerformed

    private void jPConfirmPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPConfirmPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPConfirmPasswordField1ActionPerformed

    private void jTextFieldMIddleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMIddleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMIddleNameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
       
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run()
            {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConfirmPassword;
    private javax.swing.JLabel CreatePassword;
    private javax.swing.JPanel EnterStudentID;
    private javax.swing.JLabel FirstName;
    private javax.swing.JLabel LastName;
    private javax.swing.JButton ResetButton;
    private javax.swing.JLabel StudentID;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JPasswordField jCreatePasswordField1;
    private javax.swing.JPanel jEnterConfirmPassword;
    private javax.swing.JPanel jEnterCreatePassword;
    private javax.swing.JPanel jEnterFirstName;
    private javax.swing.JPanel jEnterLastName;
    private javax.swing.JLabel jLabelMiddleName;
    private javax.swing.JPasswordField jPConfirmPasswordField1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelConfirmPassword;
    private javax.swing.JPanel jPanelCreatePassword;
    private javax.swing.JPanel jPanelFirstName;
    private javax.swing.JPanel jPanelID;
    private javax.swing.JPanel jPanelLastName;
    private javax.swing.JPanel jPanelMiddleName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldMIddleName;
    private javax.swing.JTextPane jTextPaneEnterFirstName;
    private javax.swing.JTextPane jTextPaneEnterLastName;
    private javax.swing.JTextPane jTextPaneEnterStudentID;
    // End of variables declaration//GEN-END:variables
}
