package com.test.question;

import java.util.Scanner;

public class Q033 {
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("년도 입력: ");
		
		int year = scan.nextInt();
		
		if (year%4!=0) {
			System.out.println(year+ "년은 '평년'입니다. ");
		}
		
		else if (year%100!=0) {
			System.out.printf("%d년은 '윤년'입니다",year);
		}
		
		else if (year%400!=0) {
			System.out.println(year + "년은 '평년'입니다.");
		} else {System.out.println(year+ "년은 윤년입니다.");}
		
	}

}
