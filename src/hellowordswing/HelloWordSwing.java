package hellowordswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloWordSwing {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWordSwing window = new HelloWordSwing();
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
	public HelloWordSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 774, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel principalLabel = new JLabel("Press The Button");
		principalLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		principalLabel.setBounds(263, 80, 230, 80);
		frame.getContentPane().add(principalLabel);
		
		JButton initialButton = new JButton("New button");
		initialButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				principalLabel.setText("Hello Word!");
			}
		});
		initialButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		initialButton.setBounds(278, 300, 200, 30);
		frame.getContentPane().add(initialButton);
	}
}
