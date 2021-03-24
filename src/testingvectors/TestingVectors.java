package testingvectors;

import java.util.Arrays;

public class TestingVectors {

	public static void main(String[] args) {
		
		int v1[] = new int[6];
		
		v1[0] = 1;
		v1[1] = 5;
		v1[2] = 7;
		v1[3] = 0;
		v1[4] = 11;
		v1[5] = 9;
		
		System.out.println(v1);
		for(int i = 0; i < v1.length - 1; i++) {
			System.out.println(v1[i]);
		}
		System.out.println();
		
		int v2[] = {2,4,8,12,10};
		
		System.out.println(v2);
		for(int i = 0; i < v2.length - 1; i++) {
			System.out.println(v2[i]);
		}
		System.out.println("v2.length: "  + v2.length);
		System.out.println();
		
		
		System.out.println();
		System.out.println("For It");
		for(int i : v1) { //only vectors
			System.out.println(i);
		}
		
		System.out.println();
		Arrays.sort(v1);
		System.out.println("For It after Arrays.sort()");
		for(int i : v1) { //only vectors
			System.out.println(i);
		}
		
		
		System.out.println();
		System.out.println("Arrays.binarySearch(v2, 8) => " + Arrays.binarySearch(v2, 8));
		
		System.out.println();
		System.out.print("Vector x = ");
		for(int i = 0; i < v1.length - 1; i++) {
			System.out.print(v1[i] + " ");
		}
		Arrays.fill(v1, 0);
		System.out.print("===> Arrays.fill(x, 0) ===> ");
		System.out.print("Vector x = ");
		for(int i = 0; i < v1.length - 1; i++) {
			System.out.print(v1[i] + " ");
		}
		
		System.out.println();
		
		
	}

}
