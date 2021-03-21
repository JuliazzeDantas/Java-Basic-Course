package testingloops;

public class TestingLoops {
	public static void main(String[] args) {
		
		int c = 0;
		System.out.println();
		System.out.println("While");
		
		while(c < 10) {
			c++;
			System.out.println(c);
		}
		
		c = 0;
		System.out.println();
		System.out.println("While: continue");
		
		while(c < 10) {
			c++;
			if(c == 3 || c == 7 || c == 9) {
				continue;
			}			
			System.out.println(c);
		}
		
		c = 0;
		System.out.println();
		System.out.println("While: break");
		
		while(c < 10) {
			if(c == 5) {
				break;
			}
			c++;
			System.out.println(c);
		}
		
		c = 0;
		System.out.println();
		System.out.println("Do While");
		
		do {
			c++;
			System.out.println(c);
		}while(c < 10);
		
		System.out.println();
		System.out.println("For");
		
		for(c = 0; c < 10; c++) {
			System.out.println(c);
		}
	}
}
