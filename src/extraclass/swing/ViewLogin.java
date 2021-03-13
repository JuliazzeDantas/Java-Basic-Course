package extraclass.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class ViewLogin {

	private JFrame frame;
	private JTextField textUser;
	private JPasswordField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin window = new ViewLogin();
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
	public ViewLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 333, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelUser = new JLabel("Login:");
		labelUser.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelUser.setBounds(75, 51, 91, 25);
		frame.getContentPane().add(labelUser);
		
		JLabel labelPassword = new JLabel("Password:");
		labelPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelPassword.setBounds(75, 155, 91, 25);
		frame.getContentPane().add(labelPassword);
		
		textUser = new JTextField();
		textUser.setBounds(75, 88, 180, 30);
		frame.getContentPane().add(textUser);
		textUser.setColumns(10);
		
		JButton buttonAcess = new JButton("Confirm");
		buttonAcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(confirmation(textUser.getText(), new String(textPassword.getPassword()))) {
					
					JOptionPane.showMessageDialog(null, "Welcome to System!", "Acess Released", JOptionPane.INFORMATION_MESSAGE);
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid Data!", "Acess Denied", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		buttonAcess.setBounds(99, 275, 134, 40);
		frame.getContentPane().add(buttonAcess);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(75, 193, 180, 30);
		frame.getContentPane().add(textPassword);
	}
	
	public boolean confirmation(String user, String password) {
		return user.equals("User1") && password.equals("123");
	}
}
