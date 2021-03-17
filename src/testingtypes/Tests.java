package testingtypes;

public class Tests {
	
	public static void main (String args[]) {
		
		int number = 30;
		String valor = "";
		
		//it doesn't work
		//valor = number;
		//valor = (int) number;
		//valor = (String) number;
		
		//it do work 
		valor = Integer.toString(number);
		
		System.out.println("STRING " + valor);
		
		valor = "60";
		
		//it doesn't work
		//number = valor;
		//number = (int)valor;
	
		//it do work
		number = Integer.parseInt(valor);
		
		System.out.println("INTEGER " + number);
		
	}
}
