package com.test.question;

import java.util.Scanner;

public class Q052 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("행 입력: ");
		int input = scan.nextInt();
		
		for (int i=1; i<=input; i++ ) {
			
			for (int j=0; j<input-i; j++) {
				System.out.print(" ");
			}
			
			char c = 'a';
			
			for (int j=0; j<i; j++) {
				System.out.print(c);
				
				c++;
			}
			for (int j=0; j<i; j++) {
				c--;
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
