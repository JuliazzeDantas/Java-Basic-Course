package testingjoptionpane;

import javax.swing.JOptionPane;

public class UsingInputJOptionPane {
	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog(null,"Digit something:"));
		JOptionPane.showMessageDialog(null, "You Digited: " + number);
	}
}
