package com.test.question;

public class Q059 {

	
	public static void main(String[] args) {
		
		
		int count = 0;
		int sum = 0;
		
		
			
		for (int i = 1; i < 100; i+=count) {
			sum += i;
			count += 1;
			System.out.printf("%d + ",i);
		}
		System.out.printf("= %d", sum);
	}
}
