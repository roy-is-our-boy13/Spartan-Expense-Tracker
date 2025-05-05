package SpartainExpenseTracker;

import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.util.Scanner;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.swing.*;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author royperlman
*/

class FileFilter extends javax.swing.filechooser.FileFilter
{
    @Override
    public boolean accept(File f) 
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String getDescription() 
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    } 
}

public class HomePage extends javax.swing.JFrame 
{
    public HomePage()
    {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        Border ExpenseTrackerTitle = BorderFactory.createMatteBorder(5,5,5,5, Color.black);
        jPanel4.setBorder(ExpenseTrackerTitle);
        
        Border DashboardLabel = BorderFactory.createMatteBorder(5,5,5,5, Color.black);
        jPanel3.setBorder(DashboardLabel);
        
        Border ExpenseButton = BorderFactory.createMatteBorder(5,5,5,5, Color.black);
        jPanel1.setBorder(ExpenseButton);     
     
    }

    public void openFile() throws IOException, ClassNotFoundException 
    {
        FileFilter fJavaFilter = new FileFilter();
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Open your file");
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fc.setCurrentDirectory(new File("."));
        fc.setFileFilter(fJavaFilter);

        int result = fc.showOpenDialog(this);
        
        if (result == JFileChooser.CANCEL_OPTION)
        {
            System.out.println("Cancels Action");
        }
        else 
             if (result == JFileChooser.APPROVE_OPTION)
            {

                File selectedFile = fc.getSelectedFile();
                String path = selectedFile.getAbsolutePath();

                File myFile = new File(path);
                Desktop.getDesktop().open(myFile);
             }
} 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        IncomeButton = new javax.swing.JButton();
        ExpenseButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        DashboardLabel = new javax.swing.JLabel();
        HomeButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jEatButton1 = new javax.swing.JButton();
        jClassesButton = new javax.swing.JButton();
        OtherButton = new javax.swing.JButton();
        AllButton = new javax.swing.JButton();
        IncomesButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        LogoutButton = new javax.swing.JButton();
        ExpenseTrackerTitle = new javax.swing.JLabel();
        TutorialButton = new javax.swing.JButton();
        SettingsButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        AddingBalancejLabel = new javax.swing.JLabel();
        AddingIncomejLabel = new javax.swing.JLabel();
        AddingExpensejLabel = new javax.swing.JLabel();
        AddingBalanceButton = new javax.swing.JButton();
        RestAllDataButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        IncomeButton.setText("+Income");
        IncomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncomeButtonActionPerformed(evt);
            }
        });

        ExpenseButton.setText("+Expense");
        ExpenseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpenseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(396, 396, 396)
                .addComponent(ExpenseButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IncomeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExpenseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IncomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        DashboardLabel.setFont(new java.awt.Font("Lao MN", 1, 25)); // NOI18N
        DashboardLabel.setForeground(new java.awt.Color(255, 255, 255));
        DashboardLabel.setText("Dashboard");

        HomeButton.setIcon(new javax.swing.ImageIcon("/Users/royperlman/NetBeansProjects/SpartainExpenseTracker/src/main/java/SpartainExpenseTracker/icons8-home-50.png")); // NOI18N
        HomeButton.setText("Home");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        jButton1.setText("BookStore");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jEatButton1.setText("Food History");
        jEatButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEatButton1ActionPerformed(evt);
            }
        });

        jClassesButton.setText("Classes");
        jClassesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClassesButtonActionPerformed(evt);
            }
        });

        OtherButton.setText("Other Expense");
        OtherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherButtonActionPerformed(evt);
            }
        });

        AllButton.setText("All Expenses");
        AllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllButtonActionPerformed(evt);
            }
        });

        IncomesButton.setText("Incomes");
        IncomesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncomesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jEatButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DashboardLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomeButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jClassesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OtherButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AllButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IncomesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(DashboardLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HomeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEatButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jClassesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OtherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IncomesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));

        LogoutButton.setIcon(new javax.swing.ImageIcon("/Users/royperlman/NetBeansProjects/SpartainExpenseTracker/src/main/java/SpartainExpenseTracker/icons8-sign-out-24.png")); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        ExpenseTrackerTitle.setIcon(new javax.swing.ImageIcon("/Users/royperlman/NetBeansProjects/SpartainExpenseTracker/src/main/java/SpartainExpenseTracker/Spartan Expense.png")); // NOI18N

        TutorialButton.setText("Help");
        TutorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TutorialButtonActionPerformed(evt);
            }
        });

        SettingsButton.setText("Settings");
        SettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TutorialButton)
                .addGap(142, 142, 142)
                .addComponent(ExpenseTrackerTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(SettingsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoutButton)
                .addGap(41, 41, 41))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SettingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ExpenseTrackerTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TutorialButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Income");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Expense");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("................................................................");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Balance");

        AddingBalancejLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        AddingBalancejLabel.setForeground(new java.awt.Color(0, 51, 153));
        AddingBalancejLabel.setText("$"+UserData.currentUser.Balance);

        AddingIncomejLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        AddingIncomejLabel.setForeground(new java.awt.Color(102, 204, 0));
        AddingIncomejLabel.setText("$"+UserData.currentUser.Income);

        AddingExpensejLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        AddingExpensejLabel.setForeground(new java.awt.Color(153, 0, 51));
        AddingExpensejLabel.setText("$"+UserData.currentUser.Expence);

        AddingBalanceButton.setText("Add");
        AddingBalanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddingBalanceButtonActionPerformed(evt);
            }
        });

        RestAllDataButton.setText("Reset All Data");
        RestAllDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestAllDataButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 204, 51));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Welcome "+UserData.currentUser.FirstName+" "+UserData.currentUser.MiddleName+" "+UserData.currentUser.LastName);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddingBalancejLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AddingBalanceButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RestAllDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(337, 337, 337)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(AddingExpensejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(AddingIncomejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(AddingIncomejLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddingExpensejLabel)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(AddingBalancejLabel)
                            .addComponent(AddingBalanceButton)
                            .addComponent(RestAllDataButton)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IncomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncomeButtonActionPerformed
        
        Object[]categories = {"Carry Over","Salary"};
 
         while(true)
         {
            int x = JOptionPane.showOptionDialog(null,"Which one of these two is your Income on?","Categories", 
                     JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, categories, categories[0]);
         
            String Income = JOptionPane.showInputDialog("Add your Income");
            double addingIncome = Double.parseDouble(Income);
            
 
        
            if(x == 0)
            {
                Object[] YesOrNo = {"Yes","No"};
                
                int ConfirmOrNot = JOptionPane.showOptionDialog(null,"Do you want to add $"+addingIncome+" for you income on Carry Over?"
                        ,"Making Sure",JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, YesOrNo, YesOrNo[0] );
              
                if(ConfirmOrNot == 0)
                {
                
                    JOptionPane.showMessageDialog(null, "Alright, your $"+addingIncome+" has been added on as your Carry-Over.");
                   
                    UserData.currentUser.Carrey_On += addingIncome;
                    
                    String addingIncomeString = String.valueOf(UserData.currentUser.Income +=addingIncome); 
                    
				try 
				{
					UserData.currentUser.Balance = UserData.currentUser.Balance + addingIncome;

					AddingIncomejLabel.setText("$"+addingIncomeString);
                                        AddingBalancejLabel.setText("$"+UserData.currentUser.Balance);

				} 
                                catch (Exception y) 
				{
					JOptionPane.showMessageDialog(null, "Please enter a valid number.");
				}
         
                    break;
                }
                else
                    if(ConfirmOrNot == 1)
                    {
                        Object[] YesOrNo3 = {"Yes","No"};
                        
                        JOptionPane.showMessageDialog(null, "Alright, your $"+addingIncome+" has not been added.");
                        
                        int AgainOrNot =  JOptionPane.showOptionDialog(null,"Do you want to try again?"
                        ,"Again",JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, YesOrNo3, YesOrNo3[0] );
                        if(AgainOrNot == 0)
                        {
                            System.out.println("Again");
                        }
                        else
                            if(AgainOrNot == 1)
                            {
                                System.out.println("Stopping");
                                break;
                            }
                        else
                            {
                                break;
                            }
                    }
            }
            else
                if(x == 1)
            {
                Object[] YesOrNo2 = {"Yes","No"};
                
                int ConfirmOrNot = JOptionPane.showOptionDialog(null,"Just to makse sure, did you add $"+addingIncome+" for you income on Carry Over?"
                    ,"Making Sure",JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, YesOrNo2, YesOrNo2[0] );
                if(ConfirmOrNot == 0)
                {
                
                    JOptionPane.showMessageDialog(null, "Alright, your $"+addingIncome+" has benn added as your Salary.");
                    
                    UserData.currentUser.Salary += addingIncome;

                    String addingIncomeString = String.valueOf(UserData.currentUser.Income +=addingIncome); 
               
                    try
                    {
                    
                        UserData.currentUser.Balance = UserData.currentUser.Balance + addingIncome;
                        
                        AddingIncomejLabel.setText("$"+addingIncomeString );
                    
                        AddingBalancejLabel.setText("$"+UserData.currentUser.Balance);
               
                    }
                    catch (Exception y)
                    {
                        JOptionPane.showMessageDialog(null,"Please enter a valid number");
                    }
                    
                    break;  
                }
                else
                    if(ConfirmOrNot == 1)
                    {
                        Object[] YesOrNo3 = {"Yes","No"};
                        
                       JOptionPane.showMessageDialog(null, "Alright, your $"+addingIncome+" has not been added."); 
                       
                       int AgainOrNot =  JOptionPane.showOptionDialog(null,"Do you want to try again?"
                        ,"Again",JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, YesOrNo3, YesOrNo3[0] );
                        if(AgainOrNot == 0)
                        {
                            System.out.println("Again");
                        }
                        else
                            if(AgainOrNot == 1)
                            {
                                System.out.println("Stopping");
                                break;
                            }
                        else
                            {
                                break;
                            }
                    }
            } 
         }
    }//GEN-LAST:event_IncomeButtonActionPerformed

    private void ExpenseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpenseButtonActionPerformed
      
            Object[]categories = {"Food History","Book Store","Class", "Other"};
            
            while(true)
            {
                int x = JOptionPane.showOptionDialog(null,"Which one of these three are you going to add your Expense on?","Categories", 
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, categories, categories[0]);
                if(x == 0)
                {

                    String Expense = JOptionPane.showInputDialog("Add your Expense:");
                    double addingExpense = Double.parseDouble(Expense);
                
                    Object[] YesOrNo = {"Yes","No"};
                
                    String ProductFoodName = JOptionPane.showInputDialog("The name of the Food Product:");
                    String RestrantOrFastFoot = JOptionPane.showInputDialog("The name of the merchant of where you got your "+ProductFoodName+".");
               
                    int ConfirmOrNot = JOptionPane.showOptionDialog(null,"Do you want to confirm your purchase of "+ ProductFoodName+
                         " from "+RestrantOrFastFoot+" for $"+Expense+"?" 
                        ,"Confirm",JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, YesOrNo, YesOrNo[0] );
                    
                     if(ConfirmOrNot == 0)
                     {
                        JOptionPane.showMessageDialog(null, "Alright, your $"+addingExpense+" has been added in the Eat-Out Slot.");
                       
                        UserData.currentUser.EatOutTotal += addingExpense;
                        
                        String addingExpenseString = String.valueOf(UserData.currentUser.Expence += addingExpense );

                        UserData.currentUser.EatOut.add(new String[]{"$"+Expense,ProductFoodName, RestrantOrFastFoot });
                        
                        UserData.currentUser.AllTheAbove.add(new String[]{ProductFoodName," ","$"+Expense, RestrantOrFastFoot});          
                        
                        DataStorage.SaveData();
				
			try 
			{
                           UserData.currentUser.Balance = UserData.currentUser.Balance - addingExpense;

			    AddingExpensejLabel.setText("$"+addingExpenseString);
                            AddingBalancejLabel.setText("$"+UserData.currentUser.Balance);
			} 
                        catch (Exception y) 
		       {
			    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
		       }
                                
                                if(UserData.currentUser.Expence >= 1000) 
                                   {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is starting to get high.","Warning",JOptionPane.ERROR_MESSAGE);
                                   }
                                else
                                    if(UserData.currentUser.Expence >= 2000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is getting higher.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                                else
                                    if(UserData.currentUser.Expence >= 3000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is getting much higher.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                                else
                                    if(UserData.currentUser.Expence >= 4000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is way too high.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                        break;
                     }
                     else 
                         if(ConfirmOrNot == 1)
                    {
                         Object[] YesOrNo2 = {"Yes","No"};
                    
                         JOptionPane.showMessageDialog(null, "Alright, your $"+addingExpense+" has been not added in the Eat-Out Slot.");
                    
                        int tryAgainOrNot = JOptionPane.showOptionDialog(null,"Do you want to try again?","Try Again",JOptionPane.DEFAULT_OPTION,
                             JOptionPane.QUESTION_MESSAGE, null, YesOrNo2, YesOrNo2[0] );
                        if(tryAgainOrNot == 0)
                        {
                            System.out.println("Starting Again...");
                        }
                        else 
                             if(tryAgainOrNot == 1)
                        {
                             break;
                        }
                    }
            }
            else
                if(x == 1)
            {
                String Expense = JOptionPane.showInputDialog("Add your Expense:");
                double addingExpense = Double.parseDouble(Expense);
                
                Object[] YesOrNo = {"Yes","No"};
                
                String ProductName = JOptionPane.showInputDialog("The name of the Product:");
                int ConfirmOrNot = JOptionPane.showOptionDialog(null,"Do you want to confirm your purchase of "+ProductName+
                        " for $"+Expense+" from the SJSU BookStore?","Confirm",JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, YesOrNo, YesOrNo[0] );
              
                if(ConfirmOrNot == 0)
                {
                    JOptionPane.showMessageDialog(null, "Alright, your $"+addingExpense+" has been added in the Book Store Slot.");
                
                    String addingExpenseString = String.valueOf(UserData.currentUser.Expence += addingExpense); 
                    
                    UserData.currentUser.BookStoreTotal += addingExpense;
                    
                    UserData.currentUser.BookStore.add(new String[]{"$"+Expense,ProductName});
                    
                    UserData.currentUser.AllTheAbove.add(new String[]{ProductName," ","$"+Expense,"BookStore"});

                    DataStorage.SaveData();
				try 
				{
					UserData.currentUser.Balance = UserData.currentUser.Balance - addingExpense;

					AddingExpensejLabel.setText("$"+addingExpenseString);
                                        AddingBalancejLabel.setText("$"+UserData.currentUser.Balance);

				} 
                                catch (Exception y) 
				{
					JOptionPane.showMessageDialog(null, "Please enter a valid number.");
				} 
                                
                                if(UserData.currentUser.Expence >= 1000) 
                                   {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is starting to get high.","Warning",JOptionPane.ERROR_MESSAGE);
                                   }
                                else
                                    if(UserData.currentUser.Expence >= 2000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is getting higher.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                                else
                                    if(UserData.currentUser.Expence >= 3000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is getting much higher.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                                else
                                    if(UserData.currentUser.Expence >= 4000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is way too high.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                    break;
                }
                else
                    if(ConfirmOrNot == 1)
                    {
                        Object[] YesOrNo2 = {"Yes","No"};
                    
                        JOptionPane.showMessageDialog(null, "Alright, your $"+addingExpense+" has not been added in the Bookstore Slot.");
                    
                        int tryAgainOrNot = JOptionPane.showOptionDialog(null,"Do you want to try again?","Try Again",JOptionPane.DEFAULT_OPTION,
                             JOptionPane.QUESTION_MESSAGE, null, YesOrNo2, YesOrNo2[0] );
                        if(tryAgainOrNot == 0)
                        {
                            System.out.println("Starting Again...");
                        }
                        else 
                             if(tryAgainOrNot == 1)
                        {
                             break;
                        }
                    }
            }
            else 
                if(x == 2)
           {
                    String ClassNumbers = JOptionPane.showInputDialog("Amount of Classes this Semester:");
                    double CountingClasses = Double.parseDouble(ClassNumbers);
                    if(CountingClasses == 1)
                    {
                        String ClassName1 = JOptionPane.showInputDialog("The name of the Class:");
                        
                        double classPrice = 2722;
                       
                        Object[] YesOrNo = {"Yes","No"};
                        
                        int ConfirmOrNot = JOptionPane.showOptionDialog(null,"Do you want to confirm your Selct of One Class for "+ClassName1 
                           +"?","Confirm",JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, YesOrNo, YesOrNo[0] );
                        
                        if(ConfirmOrNot == 0)
                        {

                            JOptionPane.showMessageDialog(null, "Alright, you add $"+classPrice+" for One Class.");
                        
                            String addingClassPriceExpenseString = String.valueOf(UserData.currentUser.Expence += classPrice); 
                
                            UserData.currentUser.ClassesTotal += classPrice;
                            
                            UserData.currentUser.Classes.add(new String[]{ClassName1, "$"+addingClassPriceExpenseString });
                            
                            UserData.currentUser.AllTheAbove.add(new String[]{" ", ClassName1,"$"+classPrice, "MySJSU Portal" });
                            
                                try
                                {
                                    UserData.currentUser.Balance = UserData.currentUser.Balance - classPrice;
                                    
                                    AddingExpensejLabel.setText("$"+addingClassPriceExpenseString);
                                    AddingBalancejLabel.setText("$"+UserData.currentUser.Balance);
                                }
                                catch(Exception y)
                                {
                                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                                }
                                
                                if(UserData.currentUser.Expence >= 1000) 
                                   {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is starting to get high.","Warning",JOptionPane.ERROR_MESSAGE);
                                   }
                                else
                                    if(UserData.currentUser.Expence >= 2000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is getting higher.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                                else
                                    if(UserData.currentUser.Expence >= 3000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is getting much higher.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                                else
                                    if(UserData.currentUser.Expence >= 4000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is way too high.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                            
                            DataStorage.SaveData();
                        
                            break;
                        }
                        else
                            if(ConfirmOrNot == 1)
                            {
                                Object[] YesOrNo2 = {"Yes","No"};
                    
                                JOptionPane.showMessageDialog(null, "Alright, your One Class has been not added in the Class Slot.");
                    
                                int tryAgainOrNot = JOptionPane.showOptionDialog(null,"Do you wan't to try again?","Try Again",
                                        JOptionPane.DEFAULT_OPTION,
                                        JOptionPane.QUESTION_MESSAGE, null, YesOrNo2, YesOrNo2[0] );
                                
                                 if(tryAgainOrNot == 0)
                                    {
                                        System.out.println("Starting Again...");
                                    }
                                     else 
                                       if(tryAgainOrNot == 1)
                                    {
                                        break;
                                    }
                            }  
                     }
                    else 
                        if(CountingClasses == 2)
                    {
                        String ClassName1 = JOptionPane.showInputDialog("The name of the 1st Class:");
                        String ClassName2 = JOptionPane.showInputDialog("The name of the 2nd Class:");
                        
                        double classPrice = 3928;
                        
                        Object[] YesOrNo = {"Yes","No"};
                        
                        int ConfirmOrNot = JOptionPane.showOptionDialog(null,"Do you want to confimr your Selct of One Class for "
                                +ClassName1 +", and "+ClassName2+"?","Confirm",JOptionPane.DEFAULT_OPTION,
                                JOptionPane.QUESTION_MESSAGE, null, YesOrNo, YesOrNo[0] );
                        
                        if(ConfirmOrNot == 0)
                        {
                            JOptionPane.showMessageDialog(null, "Alright, you add $"+classPrice+" for two Class.");
                            
                            String addingClassPriceExpenseString = String.valueOf(UserData.currentUser.Expence += classPrice); 
                
                            UserData.currentUser.ClassesTotal += classPrice;
                            
                            UserData.currentUser.Classes.add(new String[]{ClassName1, "  V"});
                            UserData.currentUser.Classes.add(new String[]{ClassName2, "$"+classPrice});
                            
                            UserData.currentUser.AllTheAbove.add(new String[]{" ",ClassName1, "  V", "MySJSU Portal"});
                            UserData.currentUser.AllTheAbove.add(new String[]{" ",ClassName2,"$"+classPrice,"MySJSU Portal" });
                          
                                try
                                {
                                    UserData.currentUser.Balance = UserData.currentUser.Balance - classPrice;
                                
                                    AddingExpensejLabel.setText("$"+addingClassPriceExpenseString);
                                    AddingBalancejLabel.setText("$"+UserData.currentUser.Balance);
                                }
                                catch(Exception y)
                                {
                                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                                }
                                
                                if(UserData.currentUser.Expence >= 1000) 
                                   {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is starting to get high.","Warning",JOptionPane.ERROR_MESSAGE);
                                   }
                                else
                                    if(UserData.currentUser.Expence >= 2000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is getting higher.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                                else
                                    if(UserData.currentUser.Expence >= 3000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is getting much higher.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                                else
                                    if(UserData.currentUser.Expence >= 4000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is way too high.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }

                            DataStorage.SaveData();
                        
                            break;
                        }
                        else
                            if(ConfirmOrNot == 1)
                            {
                                Object[] YesOrNo2 = {"Yes","No"};
                    
                                JOptionPane.showMessageDialog(null, "Alright, your two Class has been not added in the Class Slot.");
                    
                                int tryAgainOrNot = JOptionPane.showOptionDialog(null,"Do you want to try again?","Try Again",JOptionPane.DEFAULT_OPTION,
                                 JOptionPane.QUESTION_MESSAGE, null, YesOrNo2, YesOrNo2[0] );
                                
                                 if(tryAgainOrNot == 0)
                                    {
                                        System.out.println("Starting Again...");
                                    }
                                     else 
                                       if(tryAgainOrNot == 1)
                                    {
                                        break;
                                    }
                            } 
                        /*
                        
                        JOptionPane.showMessageDialog(null, "Alright, you add $"+classPrice+" for Two Class.");
                        
                        String addingClassPriceExpenseString = String.valueOf(classPrice); 
                
                        AddingExpensejLabel.setText("$" + addingClassPriceExpenseString );
                        
                        break;*/
                    }
                    else 
                        if(CountingClasses == 3)
                    {
                        String ClassName1 = JOptionPane.showInputDialog("The name of the 1st Class:");
                        String ClassName2 = JOptionPane.showInputDialog("The name of the 2nd Class:");
                        String ClassName3 = JOptionPane.showInputDialog("The name of the 3rd Class:");
                        
                        double classPrice = 3928;
                       
                         Object[] YesOrNo = {"Yes","No"};
                        
                        int ConfirmOrNot = JOptionPane.showOptionDialog(null,"Do you wan't to confirm your Selct of One Class for "
                                +ClassName1+ ", "+ClassName2+", and "+ClassName3+"?","Making Sure", JOptionPane.DEFAULT_OPTION,
                                JOptionPane.QUESTION_MESSAGE, null, YesOrNo, YesOrNo[0] );
                        
                        if(ConfirmOrNot == 0)
                        {
                            JOptionPane.showMessageDialog(null, "Alright, you add $"+classPrice+" for One Class.");
                        
                            String addingClassPriceExpenseString = String.valueOf(UserData.currentUser.Expence += classPrice); 
                
                            UserData.currentUser.ClassesTotal += classPrice;
                            
                            UserData.currentUser.Classes.add(new String[]{ClassName1, "  |"});
                            UserData.currentUser.Classes.add(new String[]{ClassName2, "  V"});
                            UserData.currentUser.Classes.add(new String[]{ClassName3,"$"+classPrice });
                           
                            UserData.currentUser.AllTheAbove.add(new String[]{" ",ClassName1, "  |", "MySJSU Portal"});
                            UserData.currentUser.AllTheAbove.add(new String[]{" ",ClassName2, "  V", "MySJSU Portal"});
                            UserData.currentUser.AllTheAbove.add(new String[]{" ",ClassName3,"$"+classPrice,"MySJSU Portal" });
                      
                                try
                                {
                                    UserData.currentUser.Balance = UserData.currentUser.Balance - classPrice;
                      
                                    AddingExpensejLabel.setText("$"+addingClassPriceExpenseString);
                                    AddingBalancejLabel.setText("$"+UserData.currentUser.Balance);
                                }
                                catch(Exception y)
                                {
                                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                                }
                                if(UserData.currentUser.Expence >= 1000) 
                                   {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is starting to get high.","Warning",JOptionPane.ERROR_MESSAGE);
                                   }
                                else
                                    if(UserData.currentUser.Expence >= 2000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is getting higher.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                                else
                                    if(UserData.currentUser.Expence >= 3000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is getting much higher.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                                else
                                    if(UserData.currentUser.Expence >= 4000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is way too high.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                            
                            DataStorage.SaveData();
                        
                            break;
                        }
                        else
                            if(ConfirmOrNot == 1)
                            {
                                Object[] YesOrNo2 = {"Yes","No"};
                    
                                JOptionPane.showMessageDialog(null, "Alright, your One Class has been not added in the Class Slot.");
                    
                                int tryAgainOrNot = JOptionPane.showOptionDialog(null,"Do you want to try again?",
                                        "Try Again",JOptionPane.DEFAULT_OPTION,
                                        JOptionPane.QUESTION_MESSAGE, null, YesOrNo2, YesOrNo2[0] );
                                
                                 if(tryAgainOrNot == 0)
                                    {
                                        System.out.println("Starting Again...");
                                    }
                                     else 
                                       if(tryAgainOrNot == 1)
                                    {
                                        break;
                                    }
                            } 
                         
                         /*
                        JOptionPane.showMessageDialog(null, "Alright, you add $"+classPrice+" for Three Class.");
                        
                        String addingClassPriceExpenseString = String.valueOf(classPrice); 
                
                        AddingExpensejLabel.setText("$" + addingClassPriceExpenseString );
                        
                        break;*/
                    }
                    else 
                        if(CountingClasses == 4)
                    {
                        String ClassName1 = JOptionPane.showInputDialog("The name of the 1st Class:");
                        String ClassName2 = JOptionPane.showInputDialog("The name of the 2nd Class:");
                        String ClassName3 = JOptionPane.showInputDialog("The name of the 3rd Class:");
                        String ClassName4 = JOptionPane.showInputDialog("The name of the 4th Class:");
                        
                        double classPrice = 3928;
 
                         Object[] YesOrNo = {"Yes","No"};
                        
                        int ConfirmOrNot = JOptionPane.showOptionDialog(null,"Do you want to confirm your Select of Four Class for "
                                +ClassName1 +","+ClassName2+","+
                                ClassName3+", and"+ClassName4+"?","Making Sure",JOptionPane.DEFAULT_OPTION,
                                JOptionPane.QUESTION_MESSAGE, null, YesOrNo, YesOrNo[0] );
                        
                        if(ConfirmOrNot == 0)
                        {
                            JOptionPane.showMessageDialog(null, "Alright, you add $"+classPrice+" for One Class.");
                            
                            String addingClassPriceExpenseString = String.valueOf(UserData.currentUser.Expence += classPrice); 
                       
                            UserData.currentUser.ClassesTotal += classPrice;
                            
                            UserData.currentUser.Classes.add(new String[]{ClassName1, "  |"});
                            UserData.currentUser.Classes.add(new String[]{ClassName2, "  |"});
                            UserData.currentUser.Classes.add(new String[]{ClassName3, "  V"});
                            UserData.currentUser.Classes.add(new String[]{ClassName4,"$"+classPrice });
                            
                            UserData.currentUser.AllTheAbove.add(new String[]{" ",ClassName1, "  |", "MySJSU Portal"});
                            UserData.currentUser.AllTheAbove.add(new String[]{" ",ClassName2, "  |", "MySJSU Portal"});
                            UserData.currentUser.AllTheAbove.add(new String[]{" ",ClassName3, "  V", "MySJSU Portal"}); 
                            UserData.currentUser.AllTheAbove.add(new String[]{" ",ClassName4,"$"+classPrice,"MySJSU Portal" });
    
                                try
                                {
                                    UserData.currentUser.Balance = UserData.currentUser.Balance - classPrice;
                                    
                                    AddingExpensejLabel.setText("$"+addingClassPriceExpenseString);
                                    AddingBalancejLabel.setText("$"+UserData.currentUser.Balance);
                                }
                                catch(Exception y)
                                {
                                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                                }
                                
                                if(UserData.currentUser.Expence >= 1000) 
                                   {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is starting to get high.","Warning",JOptionPane.ERROR_MESSAGE);
                                   }
                                else
                                    if(UserData.currentUser.Expence >= 2000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is getting higher.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                                else
                                    if(UserData.currentUser.Expence >= 3000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is getting much higher.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                                else
                                    if(UserData.currentUser.Expence >= 4000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is way too high.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                            
                            DataStorage.SaveData();
                            
                            break;
                        }
                        else
                            if(ConfirmOrNot == 1)
                            {
                                Object[] YesOrNo2 = {"Yes","No"};
                    
                                JOptionPane.showMessageDialog(null, "Alright, your One Class has been not added in the Class Slot.");
                    
                                int tryAgainOrNot = JOptionPane.showOptionDialog(null,"Do you want to try again?","Try Again",JOptionPane.DEFAULT_OPTION,
                                 JOptionPane.QUESTION_MESSAGE, null, YesOrNo2, YesOrNo2[0] );
                                
                                 if(tryAgainOrNot == 0)
                                    {
                                        System.out.println("Starting Again...");
                                    }
                                     else 
                                       if(tryAgainOrNot == 1)
                                    {
                                        break;
                                    }
                            } 
                         
                         
                         /*
                        JOptionPane.showMessageDialog(null, "Alright, you add $"+classPrice+" for Four Class.");
                        
                        String addingClassPriceExpenseString = String.valueOf(classPrice); 
                
                        AddingExpensejLabel.setText("$" + addingClassPriceExpenseString );
                        
                        break;*/
                        
                    }
                    else 
                        if(CountingClasses == 5)
                    {
                        String ClassName1 = JOptionPane.showInputDialog("The name of the 1st Class:");
                        String ClassName2 = JOptionPane.showInputDialog("The name of the 2nd Class:");
                        String ClassName3 = JOptionPane.showInputDialog("The name of the 3rd Class:");
                        String ClassName4 = JOptionPane.showInputDialog("The name of the 4th Class:");
                        String ClassName5 = JOptionPane.showInputDialog("The name of the 5th Class:");
                        
                        double classPrice5 = 3928;
                        
                  
                        Object[] YesOrNo = {"Yes","No"};
                        
                        int ConfirmOrNot = JOptionPane.showOptionDialog(null,"Do you want to confirm your select of five classes for "+ClassName1 +", "
                                +ClassName2+", "+ClassName3+
                                ", "+ClassName4+", and "+ClassName5+ "?","Confirm",JOptionPane.DEFAULT_OPTION,
                               JOptionPane.QUESTION_MESSAGE, null, YesOrNo, YesOrNo[0] );
                        
                        if(ConfirmOrNot == 0)
                        {
                            JOptionPane.showMessageDialog(null, "Alright, you add $"+classPrice5+" for five classes.");
                        
                            String addingClassPriceExpenseString = String.valueOf(UserData.currentUser.Expence += classPrice5); 
                
                            UserData.currentUser.ClassesTotal += classPrice5;
                            
                            UserData.currentUser.Classes.add(new String[]{ClassName1, "  |"});
                            UserData.currentUser.Classes.add(new String[]{ClassName2, "  |"});
                            UserData.currentUser.Classes.add(new String[]{ClassName3, "  |"});
                            UserData.currentUser.Classes.add(new String[]{ClassName4, "  V"});
                            UserData.currentUser.Classes.add(new String[]{ClassName5,"$"+classPrice5 });
                
                            UserData.currentUser.AllTheAbove.add(new String[]{" ",ClassName1, "  |", "MySJSU Portal"});
                            UserData.currentUser.AllTheAbove.add(new String[]{" ",ClassName2, "  |", "MySJSU Portal"});
                            UserData.currentUser.AllTheAbove.add(new String[]{" ",ClassName3, "  |", "MySJSU Portal"});
                            UserData.currentUser.AllTheAbove.add(new String[]{" ",ClassName4, "  V", "MySJSU Portal"}); 
                            UserData.currentUser.AllTheAbove.add(new String[]{" ",ClassName5,"$"+classPrice5,"MySJSU Portal" });
 
                                try
                                {
                                    UserData.currentUser.Balance = UserData.currentUser.Balance - classPrice5;
                                    
                                    AddingExpensejLabel.setText("$"+addingClassPriceExpenseString);
                                    AddingBalancejLabel.setText("$"+UserData.currentUser.Balance);
                                }
                                catch(Exception y)
                                {
                                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                                }
                                
                                if(UserData.currentUser.Expence == 1000) 
                                   {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is starting to get high.","Warning",JOptionPane.ERROR_MESSAGE);
                                   }
                                else
                                    if(UserData.currentUser.Expence == 2000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is getting higher.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                                else
                                    if(UserData.currentUser.Expence == 3000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is getting much higher.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                                else
                                    if(UserData.currentUser.Expence >= 4000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is way too high.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }

                            DataStorage.SaveData();
                            
                            break;
                        }
                        else
                            if(ConfirmOrNot == 1)
                            {
                                Object[] YesOrNo2 = {"Yes","No"};
                    
                                JOptionPane.showMessageDialog(null, "Alright, your one class has been not added in the classes slot.");
                    
                                int tryAgainOrNot = JOptionPane.showOptionDialog(null,"Do you want to try again?","Try Again",JOptionPane.DEFAULT_OPTION,
                                 JOptionPane.QUESTION_MESSAGE, null, YesOrNo2, YesOrNo2[0] );
                                
                                 if(tryAgainOrNot == 0)
                                    {
                                        System.out.println("Starting Again...");
                                    }
                                     else 
                                       if(tryAgainOrNot == 1)
                                    {
                                        break;
                                    }
                            } 
                        /*
                        JOptionPane.showMessageDialog(null, "Alright, you add $"+classPrice+" for Five Class.");
                        
                        String addingClassPriceExpenseString = String.valueOf(classPrice); 
                
                        AddingExpensejLabel.setText("$" + addingClassPriceExpenseString );
                        
                        break;*/
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Error, SJSU does not allow students to take on more than five classes.");
                        JOptionPane.showMessageDialog(null, "Try again with five classes or less.");    
                    }
            }
            else
                if(x == 3)
                {
                    String OtherExpense = JOptionPane.showInputDialog("Add your Expense: ");
                    double addingOtherExpense = Double.parseDouble(OtherExpense);
                    
                    Object[] YesOrNoQuestion = {"Yes","No"};
                    
                    String theOtherProductName = JOptionPane.showInputDialog("The name of the Product:");
                    
                    int ComfirmingOrNot = JOptionPane.showOptionDialog(null," Do you want to confirm your purchase "+
                            theOtherProductName+" for $"
                           +OtherExpense+"?","Confirm", 
                           JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, YesOrNoQuestion, YesOrNoQuestion[0]);
                    
                    if(ComfirmingOrNot == 0)
                    {
                        JOptionPane.showMessageDialog(null, "Alright, your $"+OtherExpense+" has been added in the Other Slot.");
                        
                        String addingStringExpense = String.valueOf( UserData.currentUser.Expence += addingOtherExpense);

                        UserData.currentUser.OthersTotal += addingOtherExpense;
                        
                        UserData.currentUser.Others.add(new String[]{"$"+addingOtherExpense,theOtherProductName });
                        
                        UserData.currentUser.AllTheAbove.add(new String[]{theOtherProductName," ","$"+addingOtherExpense,"Unsure"});
                     
                                try
                                {
                                    UserData.currentUser.Balance = UserData.currentUser.Balance - addingOtherExpense;
                                  
                                    AddingExpensejLabel.setText("$"+addingStringExpense);
                                    AddingBalancejLabel.setText("$"+UserData.currentUser.Balance);   
                                }
                                catch(Exception y)
                                {
                                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                                }
                                
                                if(UserData.currentUser.Expence == 1000) 
                                   {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is starting to get high.","Warning",JOptionPane.ERROR_MESSAGE);
                                   }
                                else
                                    if(UserData.currentUser.Expence == 2000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is getting higher.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                                else
                                    if(UserData.currentUser.Expence == 3000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is getting much higher.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                                else
                                    if(UserData.currentUser.Expence >= 4000)
                                    {
                                        JOptionPane.showMessageDialog(null, "Warning, your Expense is way too high.","Warning",JOptionPane.ERROR_MESSAGE);
                                    }
                        
                        DataStorage.SaveData();
                        
                        break;
                    }
                    else
                        if(ComfirmingOrNot == 1)
                    {
                        Object[] YesOrNoQuestion2 = {"Yes","No"};
                        
                           JOptionPane.showMessageDialog(null, "Alright, your $"+OtherExpense+" has not been added in the other slot.");
                           
                           int tryAgainOrNot2 = JOptionPane.showOptionDialog(null,"Do you want to try again?","Try Again",
                                 JOptionPane.DEFAULT_OPTION,
                                 JOptionPane.QUESTION_MESSAGE, null, YesOrNoQuestion2, YesOrNoQuestion2[0] );
                                
                                 if(tryAgainOrNot2 == 0)
                                    {
                                        System.out.println("Starting Again...");
                                    }
                                     else 
                                       if(tryAgainOrNot2 == 1)
                                    {
                                        break;
                                    }
                    }
                }
            else
            {
                System.out.println("Canceling/Exiting");
                break;
            }
        }
    }//GEN-LAST:event_ExpenseButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
      
        this.dispose();

        LoginAndCreateAccount LCA = new  LoginAndCreateAccount();

        LCA.setVisible(true);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        
        this.dispose();
        
        HomePage Home = new HomePage();
        
        Home.setVisible(true);
        
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void BookStoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookStoreButtonActionPerformed
        
        this.dispose();
        
        BookStore book = new BookStore();
        
        book.setVisible(true);
        
    }//GEN-LAST:event_BookStoreButtonActionPerformed

    private void ClassesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassesButtonActionPerformed

        this.dispose();
        
        Classes aClassRoom = new Classes();
        
        aClassRoom.setVisible(true);
        
    }//GEN-LAST:event_ClassesButtonActionPerformed

    private void jEatButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEatButton1ActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
        EatOut eat = new EatOut();
        
        eat.setVisible(true);
        
    }//GEN-LAST:event_jEatButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
        BookStore book = new BookStore();
        
        book.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jClassesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClassesButtonActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
        Classes aClass = new Classes();
        
        aClass.setVisible(true);
    }//GEN-LAST:event_jClassesButtonActionPerformed

    private void AddingBalanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddingBalanceButtonActionPerformed
        
        String addingBalance = JOptionPane.showInputDialog("Add your Balance: ");
        double addingDoubleBalance = Double.parseDouble(addingBalance);
        
        UserData.currentUser.Balance = addingDoubleBalance;

        AddingBalancejLabel.setText("$"+ UserData.currentUser.Balance);
        
        DataStorage.SaveData();
        
    }//GEN-LAST:event_AddingBalanceButtonActionPerformed

    private void OtherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherButtonActionPerformed
       
        this.dispose();
        
        Other other = new Other();
        
        other.setVisible(true);
    }//GEN-LAST:event_OtherButtonActionPerformed

    private void AllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllButtonActionPerformed
       
        this.dispose();
        
        AllOfTheAbove all = new AllOfTheAbove();
        
        all.setVisible(true);
    }//GEN-LAST:event_AllButtonActionPerformed

    private void RestAllDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestAllDataButtonActionPerformed
     
        UserData.currentUser.Expence = 0;
        UserData.currentUser.Income = 0;
        UserData.currentUser.Balance = 0;
        UserData.currentUser.BookStoreTotal = 0;
        UserData.currentUser.EatOutTotal = 0;
        UserData.currentUser.ClassesTotal = 0;
        UserData.currentUser.OthersTotal = 0;
        UserData.currentUser.Carrey_On = 0;
        UserData.currentUser.Salary = 0;
        
        UserData.currentUser.EatOut.clear();
        UserData.currentUser.BookStore.clear();
        UserData.currentUser.Classes.clear();
        UserData.currentUser.Others.clear();
        UserData.currentUser.AllTheAbove.clear();
    
        AddingExpensejLabel.setText("$0.0");
        AddingBalancejLabel.setText("$0.0");
        AddingIncomejLabel.setText("$0.0");
        
        DataStorage.SaveData();
        
    }//GEN-LAST:event_RestAllDataButtonActionPerformed

    private void TutorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TutorialButtonActionPerformed

         this.dispose();
         
         Help help = new Help();
         
         help.setVisible(true);
        
        /*
        try
        {
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.OPEN)) 
            {
            desktop.open(new File("Chapter6SelectedProblems.pdf"));
            } 
            else 
            {
               System.out.println("Open is not supported");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        */
        
        /*
       try
       {
        File file = new File("file:///Users/royperlman/Desktop/Chapter6SelectedProblems.pdf");
           
         if(file.exists())
          {
              System.out.println("Opening");
              
              if(Desktop.isDesktopSupported())
              {
                  
                Desktop.getDesktop().open(file);
              }
              else
              {
                JOptionPane.showMessageDialog(this,"Not Supported");
              }
          }
          else
          {
            JOptionPane.showMessageDialog(this,"File does not Exist.");
              //Desktop.getDesktop().open(file);
          }
           
       }
       catch (Exception e)
       {
           //JOptionPane.showMessageDialog(null,"Error");
           e.printStackTrace();
       }
        */
        
    }//GEN-LAST:event_TutorialButtonActionPerformed

    private void IncomesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncomesButtonActionPerformed
       
        this.dispose();
        
        Incomes income = new Incomes();
        
        income.setVisible(true);
    }//GEN-LAST:event_IncomesButtonActionPerformed

    private void SettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsButtonActionPerformed
       
        this.dispose();
        
        Settings set = new Settings();
        
        set.setVisible(true);
        
    }//GEN-LAST:event_SettingsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
       System.out.println("Lanching");
      
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        HomePage balance = new HomePage();
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run()
            {
                new HomePage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddingBalanceButton;
    private javax.swing.JLabel AddingBalancejLabel;
    private javax.swing.JLabel AddingExpensejLabel;
    private javax.swing.JLabel AddingIncomejLabel;
    private javax.swing.JButton AllButton;
    private javax.swing.JLabel DashboardLabel;
    private javax.swing.JButton ExpenseButton;
    private javax.swing.JLabel ExpenseTrackerTitle;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton IncomeButton;
    private javax.swing.JButton IncomesButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton OtherButton;
    private javax.swing.JButton RestAllDataButton;
    private javax.swing.JButton SettingsButton;
    private javax.swing.JButton TutorialButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jClassesButton;
    private javax.swing.JButton jEatButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    private void display(String tutorial, String testing) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*
    private void ExpenseChangeInputMethodTextChanged() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
