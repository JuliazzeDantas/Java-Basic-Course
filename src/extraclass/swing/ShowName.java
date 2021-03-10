package extraclass.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShowName {

	private JFrame frame;
	private JTextField textName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try { // code snippet copied from NetBeans
			for(javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()) {
				if("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}
		catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
			System.err.println(ex);
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowName window = new ShowName();
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
	public ShowName() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textName = new JTextField();
		textName.setBounds(136, 129, 160, 22);
		frame.getContentPane().add(textName);
		textName.setColumns(10);

		JLabel labelName = new JLabel("Digit your name and press the button");
		labelName.setFont(new Font("Tahoma", Font.PLAIN, 24));
		labelName.setBounds(12, 59, 408, 35);
		frame.getContentPane().add(labelName);

		JButton btnNewButton = new JButton("Click");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,	"Nome: " + textName.getText());
			}
		});
		btnNewButton.setBounds(165, 175, 97, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
