package com.test.question;

import java.util.Scanner;

public class Q001 {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("태어난 년도: ");
	
		int year = scan.nextInt(); 
		
		int age = 2023 - year + 1;
		
		System.out.printf("나이: %d세",age );
		

		
		
	}
}
