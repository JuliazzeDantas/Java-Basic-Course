package screensize;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScreenSizeSwing {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenSizeSwing window = new ScreenSizeSwing();
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
	public ScreenSizeSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 522, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel iconScreen = new JLabel("");
		iconScreen.setIcon(new ImageIcon("C:\\Users\\vinig\\Desktop\\screen.jfif"));
		iconScreen.setBounds(12, 13, 211, 225);
		frame.getContentPane().add(iconScreen);
		
		JLabel lblScreenResolution = new JLabel("Screen Resolution");
		lblScreenResolution.setHorizontalAlignment(SwingConstants.CENTER);
		lblScreenResolution.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblScreenResolution.setBounds(255, 89, 237, 38);
		frame.getContentPane().add(lblScreenResolution);
		
		JLabel labelResolution = new JLabel("  ");
		labelResolution.setHorizontalAlignment(SwingConstants.CENTER);
		labelResolution.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		labelResolution.setBounds(12, 270, 480, 73);
		frame.getContentPane().add(labelResolution);
		
		JButton btnClickMe = new JButton("Click me!");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
				labelResolution.setText("The screen size is: " + dimension.width + "x" + dimension.height);
			}
		});
		btnClickMe.setBounds(325, 179, 97, 25);
		frame.getContentPane().add(btnClickMe);
	}

}
