package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q021 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("태어난 년도: ");
		
		int year = scan.nextInt();
		
		Calendar now = Calendar.getInstance();
		
		int age = now.get(Calendar.YEAR) - year;
		
		System.out.println("나이 :" + age +"세" );
		
		
		
		
		
	}

}
