package com.test.question;

import java.util.Scanner;

public class Q036 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("시작 숫자: ");

		int start = scan.nextInt();
		
		System.out.println("종료 숫자: ");
		
		int end = scan.nextInt();
		
		System.out.println("증감치: ");
		
		int increment = scan.nextInt();
		
		
		for (int i = start; i<=end; i+=increment) {
			
			System.out.println(i);
			
		}
		
		
		
		
		
	}
}
