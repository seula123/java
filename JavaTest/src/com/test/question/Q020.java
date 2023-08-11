package com.test.question;

import java.util.Calendar;

public class Q020 {
	
	
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();//현재시각
		
		
		now.add(Calendar.DATE,100);
		
		System.out.printf("백일: %tF",now);
		
		System.out.println();
		
		Calendar birthDay = Calendar.getInstance();
		
		birthDay.add(Calendar.YEAR, 1);
		
		System.out.printf("돌: %tF",birthDay);
		
		
		
		
		
		
	}

}
