package com.test.question;

public class Q058 {

	
	public static void main(String[] args) {
		
			
			sum();
		}

		private static void sum() {
			
			int sum = 0;
			
			for(int i=10; i<=100; i=i+10) {
				
				for (int j=i-9; j<=i; j++) {
					sum = sum + j;
				}
				System.out.printf("%d~%3d: %4d\n",i-9,i,sum);
				sum = 0; 
	}
}
}
