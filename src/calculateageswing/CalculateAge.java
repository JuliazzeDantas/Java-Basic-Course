package calculateageswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class CalculateAge extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateAge frame = new CalculateAge();
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
	public CalculateAge() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelTitle = new JLabel("What year were you were born?");
		labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 21));
		labelTitle.setBounds(12, 27, 307, 54);
		contentPane.add(labelTitle);
		
		JLabel labelIcon = new JLabel("");
		labelIcon.setIcon(new ImageIcon("C:\\Users\\vinig\\Desktop\\iconAge.png"));
		labelIcon.setBounds(315, 25, 191, 200);
		contentPane.add(labelIcon);
		
		JLabel labelText = new JLabel(" ");
		labelText.setFont(new Font("Tahoma", Font.PLAIN, 30));
		labelText.setBounds(12, 238, 511, 93);
		contentPane.add(labelText);
		
		JSpinner spinnerAge = new JSpinner();
		spinnerAge.setModel(new SpinnerNumberModel(new Integer(2000), new Integer(1900), null, new Integer(1)));
		spinnerAge.setFont(new Font("Tahoma", Font.PLAIN, 25));
		spinnerAge.setBounds(80, 94, 132, 40);
		contentPane.add(spinnerAge);
		
		JButton ButtonCalculate = new JButton("Calculate");
		ButtonCalculate.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				
				GregorianCalendar date = new GregorianCalendar();
				int age = date.get(Calendar.YEAR);
				age -= Integer.parseInt(spinnerAge.getValue().toString());
				
				
				labelText.setText("You are " + age + " years old!");
				
			}
		});
		ButtonCalculate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ButtonCalculate.setBounds(80, 172, 132, 40);
		contentPane.add(ButtonCalculate);
	}
}
