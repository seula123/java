package com.test.question;

import java.util.Scanner;

public class Q014 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("역의 개수: ");
		
		int station = scan.nextInt();
		
		System.out.println("환승역의 횟수: ");
		
		int change = scan.nextInt();
		
		System.out.println("시간대 1.평상시, 2.출근시, 3.퇴근시");
		
		int time = scan.nextInt();
		
		int result = getTime(station,change,time);
		
		System.out.printf("총 소요 시간은 %d분입니다",result);
		
		
	}
	
	
	public static int getTime(int station,int change,int time){
	
	
	
		int result = station*2 + change * ((time==1)? 3 :(time==2)? 4 : 5);
		
		return result;
	
		
	}

}
