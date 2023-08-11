package com.test.question;

import java.util.Scanner;

public class Q043 {
	
	public static void main(String[] args) {
		
		int userNum = 0;
		int i=1;
		int computerNum = (int)(Math.random()*10)+1;
		
		
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.\n");
	
		Scanner scan = new Scanner(System.in);
		
		for (i=1; i<=10; i++) {
		
		System.out.println("숫자: ");
		userNum = scan.nextInt();
		
		if (computerNum == userNum) {
			System.out.println("맞았습니다.");
			break;
		} else {
			System.out.println("틀렸습니다.");
		}
			
		
		System.out.println();
			
		}
		
		System.out.println("컴퓨터가 생각한 숫자는"+computerNum+"입니다.\n");
		
		if (computerNum == userNum) {
			System.out.printf("정답을 맞추는데 시도한 횟수는 %d회 입니다.\n",i);
		} else {
			System.out.println("모든 기회를 실패했습니다.");
		}
	
		System.out.println("프로그램을 종료합니다.");
	
	}
		
		
		
	}


