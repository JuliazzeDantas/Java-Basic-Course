package counterswing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JList;
import java.awt.List;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class CounterSwing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CounterSwing frame = new CounterSwing();
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
	public CounterSwing() {
		setTitle(" ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStart = new JLabel("Start:");
		lblStart.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStart.setBounds(12, 24, 56, 26);
		contentPane.add(lblStart);
		
		JLabel lblEnd = new JLabel("End:");
		lblEnd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnd.setBounds(12, 74, 56, 26);
		contentPane.add(lblEnd);
		
		JLabel lblJump = new JLabel("Jump:");
		lblJump.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblJump.setBounds(12, 124, 56, 26);
		contentPane.add(lblJump);
		
		JLabel lblStartNumber = new JLabel("0");
		lblStartNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblStartNumber.setBounds(404, 24, 56, 26);
		contentPane.add(lblStartNumber);
		
		JLabel lblEndNumber = new JLabel("5");
		lblEndNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEndNumber.setBounds(404, 74, 56, 26);
		contentPane.add(lblEndNumber);
		
		JLabel lblJumpNumber = new JLabel("1");
		lblJumpNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblJumpNumber.setBounds(404, 124, 56, 26);
		contentPane.add(lblJumpNumber);
		
		JSlider sliderStart = new JSlider();
		sliderStart.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				lblStartNumber.setText(Integer.toString(sliderStart.getValue()));
			}
		});
		sliderStart.setValue(0);
		sliderStart.setMaximum(5);
		sliderStart.setBounds(91, 24, 287, 26);
		contentPane.add(sliderStart);
		
		JSlider sliderEnd = new JSlider();
		sliderEnd.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblEndNumber.setText(Integer.toString(sliderEnd.getValue()));
			}
		});
		sliderEnd.setValue(0);
		sliderEnd.setMinimum(5);
		sliderEnd.setMaximum(50);
		sliderEnd.setBounds(91, 74, 287, 26);
		contentPane.add(sliderEnd);
		
		JSlider sliderJump = new JSlider();
		sliderJump.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblJumpNumber.setText(Integer.toString(sliderJump.getValue()));
			}
		});
		sliderJump.setValue(1);
		sliderJump.setMaximum(5);
		sliderJump.setMinimum(1);
		sliderJump.setBounds(91, 124, 287, 26);
		contentPane.add(sliderJump);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(442, 24, 74, 292);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		list.setForeground(Color.RED);
		scrollPane.setViewportView(list);
		list.setVisibleRowCount(15);
		list.setFont(new Font("Tahoma", Font.PLAIN, 20));
		list.setValueIsAdjusting(true);
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setSelectedIndex(0);
		
		
        //scroll
		
		JButton btnCount = new JButton("Count");
		btnCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int start = sliderStart.getValue();
				int end = sliderEnd.getValue();
				int jump = sliderJump.getValue();
				
				DefaultListModel auxList = new DefaultListModel<>();
				
				for(int count = start ; count <= end ; count += jump) {
					auxList.addElement(count);
				}
				list.setModel(auxList);
				
			}
		});
	
		
		btnCount.setBounds(181, 214, 97, 25);
		contentPane.add(btnCount);
	}
}
