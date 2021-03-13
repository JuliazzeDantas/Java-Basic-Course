package swingdateandtime;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class DateTime {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DateTime window = new DateTime();
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
	public DateTime() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel iconCalendar = new JLabel("");
		iconCalendar.setBounds(84, 13, 100, 100);
		iconCalendar.setIcon(new ImageIcon("C:\\Users\\vinig\\Desktop\\calendar.jpg"));
		
		JLabel labelTitle = new JLabel("Date and Time");
		labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle.setBounds(209, 23, 138, 25);
		labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel labelTime = new JLabel(" ");
		labelTime.setHorizontalAlignment(SwingConstants.CENTER);
		labelTime.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		labelTime.setBounds(12, 148, 408, 58);
		frame.getContentPane().add(labelTime);
		
		JButton buttonStart = new JButton("Click me!");
		buttonStart.setBounds(226, 75, 97, 25);
		buttonStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Date date = new Date();
				labelTime.setText(date.toString());
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(iconCalendar);
		frame.getContentPane().add(labelTitle);
		frame.getContentPane().add(buttonStart);
		
		
	}
}
