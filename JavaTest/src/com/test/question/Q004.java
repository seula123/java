package com.test.question;

import java.util.Scanner;

public class Q004 {

	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("섭씨(℃): ");
		
		double tempC = scan.nextDouble();
		
		double tempF = tempC * 1.8 + 32;
		
		System.out.printf("섭씨 %.1f℃는 화씨 %.1f℉입니다.",tempC,tempF);
		
		
	}
}
