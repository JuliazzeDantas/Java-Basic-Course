package counterjoptionpane;

import javax.swing.JOptionPane;

public class CounterJOptionPane {

	public static void main(String[] args) {
		
		int number;
		
		int counter = 0, pair = 0, odd = 0, average = 0, biggerThan100 = 0;
		
		do {
			number = Integer.parseInt(JOptionPane.showInputDialog(null, "Digit some number: \n (Digit 0 to finish it)"));
			if(number != 0) {
				counter++;
				pair += (number%2 == 0)? 1:0;
				odd += (number%2 != 0)? 1:0;
				biggerThan100 += (number - 100 > 0)? 1:0;
				average += number;
			}	
		}while(number != 0);
		
		if(counter != 0)
			average /= counter;
		
		JOptionPane.showMessageDialog(null, "Result \n\n quantity: " + counter + "\n even numbers: " + pair + "\n odd numbers: " + odd +
				"\n bigger than 100: " + biggerThan100 + "\n average: " + average);

	}

}
