package com.test.question;

import java.util.Scanner;

public class Q051 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("행: ");
		int input = scan.nextInt();
			
		for (int i=1; i<=input; i++) {
			
			for (int j=0; j<input-i; j++) {
				System.out.printf(" ");
			}
			
			for (int j=0; j<i*2-1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
