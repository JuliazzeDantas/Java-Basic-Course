package addnewelementsswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.JScrollPane;
import javax.swing.ListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AddNewElementsSwing extends JFrame {

	private JPanel contentPane;
	int index = 0;
	DefaultListModel<String> auxList = new DefaultListModel<String>();
	int vector[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int counter = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNewElementsSwing frame = new AddNewElementsSwing();
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
	public AddNewElementsSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		for(int number : vector) {
			auxList.addElement("[" + counter + "] -> " + number);
			counter++;
		}

		contentPane.setLayout(null);
		
		JLabel lblIndex = new JLabel("[0]");
		lblIndex.setBounds(459, 30, 39, 26);
		lblIndex.setForeground(Color.RED);
		lblIndex.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIndex.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lblIndex);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(64, 35, 103, 26);
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(spinner);
		
		JList list = new JList();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				index = list.getSelectedIndex();
				
				lblIndex.setText("[" + index + "]");
				
			}
		});
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setFont(new Font("Tahoma", Font.PLAIN, 18));
		list.setBounds(374, 65, 124, 244);
		contentPane.add(list);
		list.setModel(auxList);
		
		JLabel lvlVector = new JLabel("Vector");
		lvlVector.setBounds(374, 30, 73, 26);
		lvlVector.setForeground(Color.RED);
		lvlVector.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lvlVector);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vector[index] = Integer.parseInt(spinner.getValue().toString());
				counter = 0;
				auxList.removeAllElements();
				for(int number : vector) {
					auxList.addElement("[" + counter + "] -> " + number);
					counter++;
				}
			}
		});
		btnAdd.setBounds(209, 38, 97, 25);
		contentPane.add(btnAdd);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vector[index] = 0;  
				counter = 0;
				auxList.removeAllElements();
				for(int number : vector) {
					auxList.addElement("[" + counter + "] -> " + number);
					counter++;
				}
			}
		});
		btnRemove.setBounds(209, 104, 97, 25);
		contentPane.add(btnRemove);
		
		JButton btnOrganize = new JButton("Organize");
		btnOrganize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arrays.sort(vector);
				auxList.removeAllElements();
				counter = 0;
				for(int number : vector) {
					auxList.addElement("[" + counter + "] -> " + number);
					counter++;
				}
			}
		});
		btnOrganize.setBounds(209, 172, 97, 25);
		contentPane.add(btnOrganize);
		
		
		
		
		
		
		
	}
}
