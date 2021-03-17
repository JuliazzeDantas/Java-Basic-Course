package systemin;

import java.util.Scanner;

public class BasicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the student's name: ");
		String name = read.nextLine();
		
		System.out.print("Enter the student's grade: ");
		float grade = read.nextFloat();
		
		System.out.printf("%s's grade is %.2f", name, grade );
	}

}
