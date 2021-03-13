package systemlanguage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.awt.event.ActionEvent;

public class SystemLanguageSwing {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SystemLanguageSwing window = new SystemLanguageSwing();
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
	public SystemLanguageSwing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 624, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel iconLanguage = new JLabel("");
		iconLanguage.setIcon(new ImageIcon("C:\\Users\\vinig\\Desktop\\language.png"));
		iconLanguage.setBounds(12, 0, 256, 256);
		frame.getContentPane().add(iconLanguage);
		
		JLabel labelTitle = new JLabel("Your system's language is:");
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setFont(new Font("Tahoma", Font.BOLD, 22));
		labelTitle.setBounds(291, 47, 303, 74);
		frame.getContentPane().add(labelTitle);
		
		JLabel labelLanguage = new JLabel(" ");
		labelLanguage.setHorizontalAlignment(SwingConstants.CENTER);
		labelLanguage.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		labelLanguage.setBounds(12, 312, 582, 68);
		frame.getContentPane().add(labelLanguage);
		
		JButton btnClickMe = new JButton("Click me!");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Locale language = Locale.getDefault();
				labelLanguage.setText("The system language is: " + language.getDisplayLanguage());
			}
		});
		btnClickMe.setBounds(399, 197, 97, 25);
		frame.getContentPane().add(btnClickMe);
	}

}
