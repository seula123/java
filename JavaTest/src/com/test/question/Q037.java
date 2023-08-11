	package com.test.question;

import java.util.Scanner;

public class Q037 {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println("숫자: ");
		
		int num = scan.nextInt();
		
		for (int i=1; i<=num; i++) {
			
			sum = sum+i;
			
		}
		
		System.out.println(sum);
		
	}

}
