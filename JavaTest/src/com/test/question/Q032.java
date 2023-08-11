package com.test.question;

import java.util.Scanner;

public class Q032 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[들어온 시간]\n 시: ");
		
		int inHour = scan.nextInt();
		
		System.out.println("분: ");
		
		int inMinute = scan.nextInt();
		
		System.out.println("[나간 시간]\n 시: ");
		
		int outHour = scan.nextInt();
		
		System.out.println("분: ");
		int outMinute = scan.nextInt();
		
		int in = inHour*60+ inMinute;
		int out = outHour*60 + outMinute;
		
		int gap = out - in;
		
		int fee = ((gap-30)/10)*2000;
		
		System.out.printf("주차 요금은 %,d원입니다.",fee);
		
		
		
		
		
		
		
		
		
	}//main
}
