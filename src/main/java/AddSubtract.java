import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddSubtract
{

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
        {
		EventQueue.invokeLater(new Runnable() 
                {
			public void run()
                        {
				try 
                                {
					AddSubtract window = new AddSubtract();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddSubtract() 
        {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(35, 34, 166, 42);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);

		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(245, 34, 166, 42);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);

		JButton btnNewButton = new JButton("+ Income");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{

				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num1 + num2;

					textFieldAns.setText(Integer.toString(ans));

				} catch (Exception x) 
				{
					JOptionPane.showMessageDialog(null, "Please enter a valid number.");
				}
			}
		});
		btnNewButton.setBounds(59, 123, 142, 42);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("+ Expense");
		btnNewButton_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
                        {

				int num1, num2, ans;
				try 
				{

					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					ans = num2 - num1;

					textFieldAns.setText(Integer.toString(ans));

				} catch (Exception x) 
                                {
					JOptionPane.showMessageDialog(null, "Please enter a valid number.");
				}
			}
		});
		btnNewButton_1.setBounds(245, 123, 142, 42);
		frame.getContentPane().add(btnNewButton_1);

		textFieldAns = new JTextField();
		textFieldAns.setBounds(221, 213, 166, 42);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);

		JLabel lblNewLabel = new JLabel("New Balance:");
		lblNewLabel.setFont(new Font("Lao MN", Font.BOLD, 15));
		lblNewLabel.setBounds(112, 228, 113, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Amount");
		lblNewLabel_1.setBounds(59, 17, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Balance");
		lblNewLabel_2.setBounds(269, 17, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
	}
}