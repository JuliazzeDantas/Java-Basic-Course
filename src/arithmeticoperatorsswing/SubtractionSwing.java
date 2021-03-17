package arithmeticoperatorsswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class SubtractionSwing extends JFrame {

	private JPanel contentPane;
	private JTextField textNumber2;
	private JTextField textNumber1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SubtractionSwing frame = new SubtractionSwing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SubtractionSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 312);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textNumber2 = new JTextField();
		textNumber2.setHorizontalAlignment(SwingConstants.CENTER);
		textNumber2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textNumber2.setBounds(189, 65, 116, 39);
		contentPane.add(textNumber2);
		textNumber2.setColumns(10);

		textNumber1 = new JTextField();
		textNumber1.setHorizontalAlignment(SwingConstants.CENTER);
		textNumber1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textNumber1.setBounds(189, 13, 116, 39);
		contentPane.add(textNumber1);
		textNumber1.setColumns(10);

		JLabel lblNumber1 = new JLabel("Number 1");
		lblNumber1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumber1.setBounds(61, 13, 116, 39);
		contentPane.add(lblNumber1);

		JLabel lblNumber2 = new JLabel("Number 2");
		lblNumber2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumber2.setBounds(61, 65, 116, 39);
		contentPane.add(lblNumber2);

		JLabel lblResult = new JLabel("Result: 0");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblResult.setBounds(49, 200, 349, 34);
		contentPane.add(lblResult);

		JButton btnSubtraction = new JButton("Subtract");
		btnSubtraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int number1, number2;

				number1 = Integer.parseInt(textNumber1.getText());
				number2 = Integer.parseInt(textNumber2.getText());


				lblResult.setText("Result: " + (number1 - number2));


			}
		});
		btnSubtraction.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSubtraction.setBounds(119, 133, 136, 37);
		contentPane.add(btnSubtraction);
	}
}