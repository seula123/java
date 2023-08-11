package com.test.question;

import java.util.Scanner;

public class Q049 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("행: ");
		int input = scan.nextInt();
		
		for(int i=1; i<=input; i++) {
			
			for(int j =input; j>=i; j-- ) {
				
				System.out.printf("*");
			}
		
			
			
			System.out.println();
			
			for(int k=1; k<=i; k++) {
				System.out.printf(" ");
			}
		
		}
		
	}

}
