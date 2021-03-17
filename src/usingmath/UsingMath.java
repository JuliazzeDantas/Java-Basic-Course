package usingmath;

public class UsingMath {
	public static void main(String[] args) {
		
		int a,b,c;
		
		a = 10;
		b = 3;
		c = 7;
		
		System.out.println("A = " + a + ", B = " + b + ", C = " + c);
		
		a++;
		b--;
		
		System.out.println();
		
		System.out.println("A = " + a + ", B = " + b + ", C = " + c);
		
		c = a + b++;
		
		System.out.println("A = " + a + ", B = " + b + ", C = " + c);
		
		c = a + ++b;
		
		System.out.println("A = " + a + ", B = " + b + ", C = " + c);
		
		a = 16;
		
		System.out.println();
		
		System.out.println("Math.sqrt(16) = " + Math.sqrt(16));
		
		System.out.println("Math.cbrt(15) = " + Math.sqrt(15));
		
		System.out.println("Math.pow(3, 2) = " + Math.pow(3, 2));
		
		System.out.println();
		
		System.out.println("Math.abs(-23) = " + Math.abs(-23));
		System.out.println("Math.floor(2.8) = " + Math.floor(2.8));
		System.out.println("Math.ceil(9.3) = " + Math.ceil(9.3));
		System.out.println("Math.round(6.4) = " + Math.round(6.4));
		
		System.out.println();
		
		System.out.println("Math.random() = " + Math.random());
		
	}
}
