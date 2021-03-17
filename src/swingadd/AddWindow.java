package swingadd;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddWindow {

	private JFrame frame;
	private JTextField value1;
	private JTextField value2;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddWindow window = new AddWindow();
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
	public AddWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 10, 678, 244);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		value1 = new JTextField();
		value1.setHorizontalAlignment(SwingConstants.CENTER);
		value1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		value1.setBounds(57, 110, 116, 39);
		frame.getContentPane().add(value1);
		value1.setColumns(10);
		
		value2 = new JTextField();
		value2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		value2.setHorizontalAlignment(SwingConstants.CENTER);
		value2.setBounds(229, 110, 116, 39);
		frame.getContentPane().add(value2);
		value2.setColumns(10);
		
		JLabel add = new JLabel("+");
		add.setFont(new Font("Tahoma", Font.BOLD, 20));
		add.setHorizontalAlignment(SwingConstants.CENTER);
		add.setBounds(172, 110, 56, 39);
		frame.getContentPane().add(add);
		
		JLabel labelResult = new JLabel("  ");
		labelResult.setFont(new Font("Tahoma", Font.PLAIN, 23));
		labelResult.setHorizontalAlignment(SwingConstants.CENTER);
		labelResult.setBounds(465, 110, 129, 39);
		frame.getContentPane().add(labelResult);
		
		JButton buttonEqual = new JButton("=");
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float number1, number2;
				
				number1 = Float.parseFloat(value1.getText());
				number2 = Float.parseFloat(value2.getText());
				
				number1 = number1 + number2;
				
				labelResult.setText(Float.toString(number1));
				
			}
		});
		buttonEqual.setBounds(353, 110, 100, 39);
		frame.getContentPane().add(buttonEqual);
		
		lblNewLabel = new JLabel("Click on equal!");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(236, 19, 177, 51);
		frame.getContentPane().add(lblNewLabel);
	}
}
