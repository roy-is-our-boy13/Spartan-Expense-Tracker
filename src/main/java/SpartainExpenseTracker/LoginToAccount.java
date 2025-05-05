
package SpartainExpenseTracker;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
/**
 *
 * @author royperlman
 */
public class LoginToAccount extends javax.swing.JFrame
{

    public LoginToAccount() 
    {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        Border StudentID = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jPanelStudentID.setBorder(StudentID );
        
        Border jPanelStudentID = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        EnterID.setBorder(jPanelStudentID);
        
        Border Password = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jPanelPassword.setBorder(Password);
        
        Border jTextFieldEnterPassword = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        EnterPassword.setBorder(jTextFieldEnterPassword);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelLogin = new javax.swing.JPanel();
        LoginButton = new javax.swing.JButton();
        jPanelStudentID = new javax.swing.JPanel();
        StudentID = new javax.swing.JLabel();
        EnterID = new javax.swing.JPanel();
        jTextFieldStudentID = new javax.swing.JTextField();
        EnterPassword = new javax.swing.JPanel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanelPassword = new javax.swing.JPanel();
        Password = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jPanelLogin.setBackground(new java.awt.Color(51, 1, 255));

        LoginButton.setIcon(new javax.swing.ImageIcon("/Users/royperlman/NetBeansProjects/SpartainExpenseTracker/src/main/java/SpartainExpenseTracker/icons8-login-24.png")); // NOI18N
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        StudentID.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        StudentID.setText("Enter Student ID #");

        javax.swing.GroupLayout jPanelStudentIDLayout = new javax.swing.GroupLayout(jPanelStudentID);
        jPanelStudentID.setLayout(jPanelStudentIDLayout);
        jPanelStudentIDLayout.setHorizontalGroup(
            jPanelStudentIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStudentIDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StudentID)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanelStudentIDLayout.setVerticalGroup(
            jPanelStudentIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStudentIDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StudentID)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextFieldStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStudentIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EnterIDLayout = new javax.swing.GroupLayout(EnterID);
        EnterID.setLayout(EnterIDLayout);
        EnterIDLayout.setHorizontalGroup(
            EnterIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnterIDLayout.createSequentialGroup()
                .addComponent(jTextFieldStudentID)
                .addContainerGap())
        );
        EnterIDLayout.setVerticalGroup(
            EnterIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnterIDLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout EnterPasswordLayout = new javax.swing.GroupLayout(EnterPassword);
        EnterPassword.setLayout(EnterPasswordLayout);
        EnterPasswordLayout.setHorizontalGroup(
            EnterPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EnterPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );
        EnterPasswordLayout.setVerticalGroup(
            EnterPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnterPasswordLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Password.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Password.setText("Password");

        javax.swing.GroupLayout jPanelPasswordLayout = new javax.swing.GroupLayout(jPanelPassword);
        jPanelPassword.setLayout(jPanelPasswordLayout);
        jPanelPasswordLayout.setHorizontalGroup(
            jPanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Password)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanelPasswordLayout.setVerticalGroup(
            jPanelPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Password)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon("/Users/royperlman/NetBeansProjects/SpartainExpenseTracker/src/main/java/SpartainExpenseTracker/icons8-back-arrow-32.png")); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EnterPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EnterID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(338, 338, 338))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jPanelStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EnterID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(EnterPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jTextFieldStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStudentIDActionPerformed
        
    }//GEN-LAST:event_jTextFieldStudentIDActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
       
        
        if(DataStorage.CheckPassword(jTextFieldStudentID.getText(), jPasswordField1.getText()))
        {
       
            UserData.currentUser = DataStorage.getUser(jTextFieldStudentID.getText());
            
            this.dispose();

            HomePage HP = new HomePage();

            HP.setVisible(true); 
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Sorry, Invalid Entry");
        }    
    }//GEN-LAST:event_LoginButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                System.out.println("Loading to the Next Page....");
                
                new LoginToAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EnterID;
    private javax.swing.JPanel EnterPassword;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel StudentID;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelPassword;
    private javax.swing.JPanel jPanelStudentID;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldStudentID;
    // End of variables declaration//GEN-END:variables
}
