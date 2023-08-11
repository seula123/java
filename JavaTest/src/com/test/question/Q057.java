package com.test.question;

public class Q057 {
	
	public static void main(String[] args) {
		
		sum();
	}

	private static void sum() {
		
		int sum = 0;
		
		for(int i=10; i<=100; i=i+10) {
			
			sum=0;
			
			for (int j=1; j<=i; j++) {
				sum = sum+j;
			}
			System.out.printf("1~%3d: %4d\n",i,sum);
		}
		
	}

}
