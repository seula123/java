package com.test.question;

import java.util.Scanner;

public class Q050 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("행: ");
		int input = scan.nextInt();
		
		for (int i =1; i<=input; i++) {
			
			for(int j=1; j<=input-i; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
