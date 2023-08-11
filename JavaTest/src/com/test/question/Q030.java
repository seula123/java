package com.test.question;

import java.util.Scanner;

public class Q030 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자: ");
		
		char c = scan.nextLine().charAt(0);
				
				
		if (c>='a'&&c<='z') {
			System.out.printf("'%c'의 대문자는 '%c'입니다",c,c-32);
		} else if (c>='A'&&c<='Z') {
			System.out.printf("'%c'의 소문자는 '%c'입니다",c,c+32);
		} else {System.out.println("영문자만 입력하시오");}
				
	
		
	}//main
}
