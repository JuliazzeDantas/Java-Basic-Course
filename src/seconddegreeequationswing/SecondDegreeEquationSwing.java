package seconddegreeequationswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Color;

public class SecondDegreeEquationSwing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondDegreeEquationSwing frame = new SecondDegreeEquationSwing();
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
	public SecondDegreeEquationSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JSpinner spinnX2 = new JSpinner();
		spinnX2.setBounds(24, 51, 94, 34);
		spinnX2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JSpinner spinnX = new JSpinner();
		spinnX.setBounds(183, 51, 94, 34);
		spinnX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JSpinner spinnCte = new JSpinner();
		spinnCte.setBounds(329, 51, 94, 34);
		spinnCte.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblX2Text = new JLabel("X\u00B2 + ");
		lblX2Text.setBounds(133, 51, 49, 34);
		lblX2Text.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblXText = new JLabel("X + ");
		lblXText.setBounds(289, 50, 39, 34);
		lblXText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblZeroText = new JLabel(" = 0");
		lblZeroText.setBounds(435, 50, 56, 34);
		lblZeroText.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblDelta = new JLabel("Delta =");
		lblDelta.setBounds(24, 121, 69, 34);
		lblDelta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.setLayout(null);
		contentPane.add(spinnX2);
		contentPane.add(spinnX);
		contentPane.add(spinnCte);
		contentPane.add(lblX2Text);
		contentPane.add(lblXText);
		contentPane.add(lblZeroText);
		contentPane.add(lblDelta);
		
		JLabel lblB = new JLabel("B\u00B2");
		lblB.setForeground(Color.RED);
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblB.setBounds(105, 121, 69, 34);
		contentPane.add(lblB);
		
		JLabel lblA = new JLabel("A");
		lblA.setForeground(Color.RED);
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblA.setBounds(222, 121, 69, 34);
		contentPane.add(lblA);
		
		JLabel lblC = new JLabel("C");
		lblC.setForeground(Color.RED);
		lblC.setHorizontalAlignment(SwingConstants.CENTER);
		lblC.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblC.setBounds(303, 121, 69, 34);
		contentPane.add(lblC);
		
		spinnX2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(Integer.parseInt(spinnX2.getValue().toString()) == 0 && Integer.parseInt(spinnX.getValue().toString()) == 0 && Integer.parseInt(spinnCte.getValue().toString()) == 0) {
					lblC.setText("C");
					lblB.setText("B\u00B2");
					lblA.setText("A");
				}
				else {
					lblC.setText(spinnCte.getValue().toString());
					int B = Integer.parseInt(spinnX.getValue().toString());
					B *= B;
					lblB.setText(Integer.toString(B));
					lblA.setText(spinnX2.getValue().toString());
				}
				
			}
		});
		
		spinnX.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(Integer.parseInt(spinnX2.getValue().toString()) == 0 && Integer.parseInt(spinnX.getValue().toString()) == 0 && Integer.parseInt(spinnCte.getValue().toString()) == 0) {
					lblC.setText("C");
					lblB.setText("B\u00B2");
					lblA.setText("A");
				}
				else {
					lblC.setText(spinnCte.getValue().toString());
					int B = Integer.parseInt(spinnX.getValue().toString());
					B *= B;
					lblB.setText(Integer.toString(B));
					lblA.setText(spinnX2.getValue().toString());
				}
				
			}
		});
		
		spinnCte.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if(Integer.parseInt(spinnX2.getValue().toString()) == 0 && Integer.parseInt(spinnX.getValue().toString()) == 0 && Integer.parseInt(spinnCte.getValue().toString()) == 0) {
					lblC.setText("C");
					lblB.setText("B\u00B2");
					lblA.setText("A");
				}
				else {
					lblC.setText(spinnCte.getValue().toString());
					int B = Integer.parseInt(spinnX.getValue().toString());
					B *= B;
					lblB.setText(Integer.toString(B));
					lblA.setText(spinnX2.getValue().toString());
				}
				
			}
		});
		
		JPanel panelResult = new JPanel();
		panelResult.setBounds(24, 239, 472, 89);
		panelResult.setLayout(null);
		panelResult.setVisible(false);
		
		JLabel lbl4 = new JLabel("- 4 . ");
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl4.setBounds(178, 121, 49, 34);
		contentPane.add(lbl4);
		
		JLabel lblMult = new JLabel(".");
		lblMult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMult.setBounds(294, 121, 6, 34);
		contentPane.add(lblMult);
		
		JLabel lblDeltaResult = new JLabel("Delta = 0");
		lblDeltaResult.setBounds(0, 13, 475, 25);
		panelResult.add(lblDeltaResult);
		lblDeltaResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblResult = new JLabel("Delta = B\u00B2 - 4 . A . C");
		lblResult.setBounds(0, 51, 475, 34);
		panelResult.add(lblResult);
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(panelResult);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.setBounds(192, 176, 125, 34);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double delta = Math.pow(Double.parseDouble(spinnX.getValue().toString()), 2) - (4 * Double.parseDouble(spinnX2.getValue().toString()) * Double.parseDouble(spinnCte.getValue().toString()));
				double x1, x2;
				lblDeltaResult.setText("Delta = " + delta);
				if(delta < 0) {
					lblResult.setText("There are no real roots");
				}
				else {
					x1 = (- Double.parseDouble(spinnX.getValue().toString()) + Math.sqrt(delta)) / (2 * Double.parseDouble(spinnX2.getValue().toString()));
					x2 = (- Double.parseDouble(spinnX.getValue().toString()) - Math.sqrt(delta)) / (2 * Double.parseDouble(spinnX2.getValue().toString()));
					String.format("%.2f", x1);
					lblResult.setText("x1 = " + String.format("%.4f", x1) + " and x2 = " + String.format("%.4f", x2));
				}
				panelResult.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnNewButton);
	}
}
