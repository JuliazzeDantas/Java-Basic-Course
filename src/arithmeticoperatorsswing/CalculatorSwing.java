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
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;

public class CalculatorSwing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorSwing frame = new CalculatorSwing();
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
	public CalculatorSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 652, 566);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblValue = new JLabel("Value: ");
		lblValue.setHorizontalAlignment(SwingConstants.CENTER);
		lblValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblValue.setBounds(99, 65, 116, 39);
		contentPane.add(lblValue);

		JSpinner spinnerValue = new JSpinner();
		spinnerValue.setFont(new Font("Tahoma", Font.PLAIN, 25));
		spinnerValue.setBounds(227, 65, 150, 39);
		contentPane.add(spinnerValue);

		JPanel panel = new JPanel();
		panel.setBounds(12, 161, 610, 355);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblMod = new JLabel("Value % 2: 0");
		lblMod.setBounds(12, 73, 551, 34);
		panel.add(lblMod);
		lblMod.setFont(new Font("Tahoma", Font.PLAIN, 25));

		JLabel lblSquare = new JLabel("Square: 0");
		lblSquare.setBounds(12, 133, 551, 34);
		panel.add(lblSquare);
		lblSquare.setFont(new Font("Tahoma", Font.PLAIN, 25));

		JLabel lblCube = new JLabel("Cube: 0");
		lblCube.setBounds(12, 194, 551, 34);
		panel.add(lblCube);
		lblCube.setFont(new Font("Tahoma", Font.PLAIN, 25));

		JLabel lblSquareRoot = new JLabel("Square Root: 0");
		lblSquareRoot.setBounds(12, 253, 551, 34);
		panel.add(lblSquareRoot);
		lblSquareRoot.setFont(new Font("Tahoma", Font.PLAIN, 25));

		JLabel lblCubeRoot = new JLabel("Cube Root: 0");
		lblCubeRoot.setBounds(12, 313, 551, 34);
		panel.add(lblCubeRoot);
		lblCubeRoot.setFont(new Font("Tahoma", Font.PLAIN, 25));

		JLabel lblAbs = new JLabel("Absolute Value: 0");
		lblAbs.setBounds(12, 13, 551, 34);
		panel.add(lblAbs);
		lblAbs.setFont(new Font("Tahoma", Font.PLAIN, 25));

		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int value = Integer.parseInt(spinnerValue.getValue().toString());

				lblMod.setText("Value % 2: " + value % 2);
				lblSquare.setText("Square: " + Math.pow(value, 2));
				lblCube.setText("Cube: " + Math.pow(value, 3));
				lblSquareRoot.setText("Square Root: " + Math.sqrt(value));
				lblCubeRoot.setText("Cube Root: " + Math.cbrt(value));
				lblAbs.setText("Absolute Value: " + Math.abs(value));


			}
		});
		btnCalculate.setFont(new Font("Arial", Font.BOLD, 25));
		btnCalculate.setBounds(428, 43, 172, 91);
		contentPane.add(btnCalculate);
	}
}