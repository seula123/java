package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q022 {
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("남자 이름: ");
		String name1 = scan.nextLine();
		
		System.out.println("여자 이름: ");
		String name2 = scan.nextLine();
		
		System.out.println("만난날(년) ");
		int year = scan.nextInt();

		System.out.println("만난날(월): ");
		int month = scan.nextInt();

		System.out.println("만난날(일): ");
		int date = scan.nextInt();
		
		Calendar anniversary = Calendar.getInstance();
		anniversary.set(year,month-1,date);
		
		
		System.out.printf("'%s'과(와)'%s'의 기념일 \n", name1,name2);
		
		anniversary.add(Calendar.DATE, 100);
		
		System.out.printf("100일: %tF \n",anniversary);
		
		anniversary.add(Calendar.DATE, 100);
		
		System.out.printf("200일: %tF \n",anniversary);
		
		anniversary.add(Calendar.DATE, 100);
		
		System.out.printf("300일: %tF \n",anniversary);

		anniversary.add(Calendar.DATE, 200);
		
		System.out.printf("500일: %tF \n",anniversary);
		
		anniversary.add(Calendar.DATE, 500);

		System.out.printf("1000일: %tF \n",anniversary);
		
	}

}
