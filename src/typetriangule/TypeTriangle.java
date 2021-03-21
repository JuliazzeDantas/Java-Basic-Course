package typetriangule;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class TypeTriangle extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TypeTriangle frame = new TypeTriangle();
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
	public TypeTriangle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 402, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLadoA = new JLabel("Lado A:");
		lblLadoA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLadoA.setBounds(12, 30, 80, 28);
		contentPane.add(lblLadoA);

		JLabel lblLadoB = new JLabel("Lado B:");
		lblLadoB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLadoB.setBounds(12, 71, 80, 30);
		contentPane.add(lblLadoB);

		JLabel lblLadoC = new JLabel("Lado C:");
		lblLadoC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLadoC.setBounds(12, 112, 80, 30);
		contentPane.add(lblLadoC);

		JLabel lblNumA = new JLabel("0");
		lblNumA.setForeground(Color.GRAY);
		lblNumA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumA.setBounds(315, 30, 57, 28);
		contentPane.add(lblNumA);

		JLabel lblNumB = new JLabel("0");
		lblNumB.setForeground(Color.GRAY);
		lblNumB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumB.setBounds(316, 72, 57, 28);
		contentPane.add(lblNumB);

		JLabel lblNumC = new JLabel("0");
		lblNumC.setForeground(Color.GRAY);
		lblNumC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumC.setBounds(316, 112, 57, 28);
		contentPane.add(lblNumC);

		JSlider sliderA = new JSlider();
		sliderA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				lblNumA.setText(String.valueOf(sliderA.getValue()));
			}
		});
		sliderA.setValue(0);
		sliderA.setBounds(104, 30, 200, 26);
		contentPane.add(sliderA);

		JSlider sliderB = new JSlider();
		sliderB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblNumB.setText(String.valueOf(sliderB.getValue()));
			}
		});
		sliderB.setValue(0);
		sliderB.setBounds(104, 71, 200, 26);
		contentPane.add(sliderB);

		JSlider sliderC = new JSlider();
		sliderC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblNumC.setText(String.valueOf(sliderC.getValue()));
			}
		});
		sliderC.setValue(0);
		sliderC.setBounds(104, 116, 200, 26);
		contentPane.add(sliderC);

		JPanel panelVerify = new JPanel();
		panelVerify.setBounds(12, 224, 360, 177);
		contentPane.add(panelVerify);
		panelVerify.setLayout(null);
		panelVerify.setVisible(false);

		JLabel lblTriangle = new JLabel("Triangle:");
		lblTriangle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTriangle.setBounds(0, 5, 348, 31);
		panelVerify.add(lblTriangle);
		lblTriangle.setFont(new Font("Tahoma", Font.PLAIN, 25));

		JLabel lblType = new JLabel("New label");
		lblType.setForeground(Color.RED);
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblType.setHorizontalAlignment(SwingConstants.CENTER);
		lblType.setBounds(0, 87, 348, 49);
		panelVerify.add(lblType);

		JButton btnVerify = new JButton("Verify");
		btnVerify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int a,b,c;

				a = sliderA.getValue();
				b = sliderB.getValue();
				c = sliderC.getValue();

				if(a == 0 || b == 0 || c == 0) {
					lblTriangle.setText("");
					lblType.setText("It is not a triangle");
				}
				else {
					if((a > b + c) || (b > c + a) || (c > a + b)) {
						lblTriangle.setText("");
						lblType.setText("It is not a triangle");
					}
					else {
						lblTriangle.setText("Triangle:");
						if((a == b) && (b == c)) {
							lblType.setText("Equilateral");				
						}
						else {
							if((a == b) || (b == c) || (c == a)) {
								lblType.setText("Isosceles");
							}
							else {
								lblType.setText("Scalene");
							}
						}
					}
				}	

				panelVerify.setVisible(true);
			}
		});
		btnVerify.setBounds(137, 181, 97, 25);
		contentPane.add(btnVerify);
	}
}
