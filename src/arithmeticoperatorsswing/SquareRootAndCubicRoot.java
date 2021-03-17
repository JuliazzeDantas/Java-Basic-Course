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

public class SquareRootAndCubicRoot extends JFrame {

	private JPanel contentPane;
	private JTextField textValue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SquareRootAndCubicRoot frame = new SquareRootAndCubicRoot();
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
	public SquareRootAndCubicRoot() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 312);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textValue = new JTextField();
		textValue.setHorizontalAlignment(SwingConstants.CENTER);
		textValue.setFont(new Font("Tahoma", Font.BOLD, 20));
		textValue.setBounds(219, 46, 116, 39);
		contentPane.add(textValue);
		textValue.setColumns(10);

		JLabel lblValue = new JLabel("Value");
		lblValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblValue.setBounds(49, 46, 116, 39);
		contentPane.add(lblValue);

		JLabel lblSquare = new JLabel("Square root: ");
		lblSquare.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblSquare.setBounds(49, 168, 349, 34);
		contentPane.add(lblSquare);

		JLabel lblCubic = new JLabel("Cubic root: ");
		lblCubic.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCubic.setBounds(49, 218, 349, 34);
		contentPane.add(lblCubic);

		JButton btnRoot = new JButton("Calculate");
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				float value;

				value = Float.parseFloat(textValue.getText());

				if(value >= 0) {
					lblSquare.setText("Square root: " + Math.sqrt(value));
				}
				else {
					lblSquare.setText("Square root: Not a number");
				}
				lblCubic.setText("Cubic root: " + Math.cbrt(value));


			}
		});
		btnRoot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRoot.setBounds(146, 118, 136, 37);
		contentPane.add(btnRoot);
	}
}
