package factorialswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SpinnerNumberModel;

public class FactorialSwing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FactorialSwing frame = new FactorialSwing();
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
	public FactorialSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 169);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFactorial = new JLabel("1");
		lblFactorial.setForeground(Color.RED);
		lblFactorial.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFactorial.setBounds(284, 43, 325, 42);
		contentPane.add(lblFactorial);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 12, 1));
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int number = Integer.parseInt(spinner.getValue().toString());
				
				int counter = 0;
				int result = 1;
				
				while(counter <= number) {
					if(counter == 0) {
						result = 1;
					}
					else {
						result *= counter;
					}
					counter++;
				}
				lblFactorial.setText(Integer.toString(result));
			}
		});
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 20));
		spinner.setBounds(92, 43, 114, 42);
		contentPane.add(spinner);
		
		JLabel lblItem = new JLabel("Number:");
		lblItem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblItem.setBounds(24, 43, 64, 42);
		contentPane.add(lblItem);
		
		JLabel lblSignal = new JLabel("!");
		lblSignal.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblSignal.setBounds(218, 43, 16, 42);
		contentPane.add(lblSignal);
		
		JLabel lblNewLabel = new JLabel("=");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(246, 43, 26, 42);
		contentPane.add(lblNewLabel);
		
	}
}
