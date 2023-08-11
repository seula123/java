package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q034 {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("년: ");
		
		int year = scan.nextInt();
		
		System.out.println("월: ");
		
		int month = scan.nextInt();
		
		System.out.println("일: ");
		
		int date = scan.nextInt();
		
		Calendar c = Calendar.getInstance(); //현재시각
		
		c.set(year,month-1,date);
		
		if (c.get(Calendar.DAY_OF_WEEK) !=1 && c.get(Calendar.DAY_OF_WEEK)!=7){
		
			System.out.println("입력하신 날짜는 '평일'입니다");
			System.out.println("해당 주의 토요일로 이동합니다.");
		
			c.add(Calendar.DATE,7-c.get(Calendar.DAY_OF_WEEK));
			
			System.out.printf("이동한 날짜는 '%tF'입니다. \n",c);
		
		} else {
			
			System.out.println("입력하신 날짜는 '휴일(토/일)'입니다.");
			System.out.println("결과가 없습니다.");
		}
		
		
		
		
		
		
		
	}

}
