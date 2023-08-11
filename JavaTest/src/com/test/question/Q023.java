package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아빠 생일(년): ");
		
		int fyear = scan.nextInt();
		
		System.out.println("아빠 생일(월): ");
		
		int fmonth = scan.nextInt();
		
		System.out.println("아빠 생일(일): ");
		
		int fdate = scan.nextInt();
		
		
		
		System.out.println("딸 생일(년): ");
		
		int dyear = scan.nextInt();
		
		System.out.println("딸 생일(월): ");
		
		int dmonth = scan.nextInt();
		
		System.out.println("딸 생일(일): ");
		
		int ddate = scan.nextInt();
		
		
		Calendar father = Calendar.getInstance();
		
		father.set(fyear,fmonth,fdate);
		
		long fatherTick = father.getTimeInMillis();
		
		Calendar daughter = Calendar.getInstance();
		
		daughter.set(dyear,dmonth,ddate);
		
		long dautherTick = daughter.getTimeInMillis();
		
		long gap = dautherTick-fatherTick;
		
		System.out.printf("아빠는 딸 보다 총 %d일을 더 살았습니다",gap/1000/60/60/24);
		
		
		
		
		
		
		
	}

}
