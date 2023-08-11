package com.test.java;

import java.util.Scanner;

public class Ex28_switch {

	
	public static void main(String[] args) {
		
		//Ex28_switch.java
		
		/*
		  
		  switch문, switch case문
		 - 조건이 boolean이 아닌 일반 값이다. ->정수,문자열 열거형(enum)만 올 수 있다 실수나,char오면 에러난다.
		 - if문보다 활용도가 떨어진다
		 - if문보다 가독성이 높다
		  switch(조건) {
		   
		   case 값: 
		   		문장;
		   		break;
		    [case 값: 
		   		문장;
		   		break;]xN
		  
		    [default: 
		   		문장;
		   		break;]
		  
		  
		  }
		  
		  */
		
		//m1();
		//m2();
		//m3();
		m4();
		
	}//main

	private static void m4() {
		
		Scanner scan = new Scanner(System.in);
		
		
//		nextLine() vs 나머지()
//		-nextLine():
//		 - 입력된 버퍼에서 개행문자를 만나기 전까지 읽기
//		- 위의 개행문자를 버퍼에서 제거한다.
//		- nextXXX()
//		-입력된 버퍼에서 개행문자를 만나기 전까지 읽기
//		-위의 개행문자를 버퍼에서 제거하지 않는다.
//		
		
		
		//2.문자열 입력
		//1.숫자 입력
		
		System.out.println("숫자: ");
		int num = scan.nextInt();
		System.out.println(num);
		
//		=scan.skip("\r\n");   //남기고간 엔터를 버린다.
		scan.nextLine();
		
		
		System.out.println("문자열: ");
		String txt = scan.nextLine();
		System.out.println(txt);
		
		System.out.println("종료");
	}

	private static void m3() {
		
		
		//요구사항] 사용자가 월을 입력> 해당월의 마지막 일?
		
		int lastDay = 0; //마지막 일
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("월: ");
		
		int month = scan.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			lastDay = 31;
			break;
		case 2: 
			lastDay = 28;
			break;
		case 4: case 6: case 9: case 11:
			lastDay = 30;
			break;
			
		
		}
	
		System.out.printf("입력한 %d월의 마지막 날짜는 %d일입니다. \n", month,lastDay);
	}

	private static void m2() {
		
		
		//요구사항] 자판기
//		- 메뉴 출력하고 음료를 선택하면 가격을 알려줌
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("================");
		System.out.println("     자판기");
		System.out.println("================");
		System.out.println("1.콜라");
		System.out.println("2.사이다");
		System.out.println("3.박카스");
		System.out.println("----------------");
		System.out.println("선택(번호입력): ");
		
		int input = scan.nextInt();
		
			
		//값: >Label (표시판)
		
		
		switch(input) {
		case 1:
			//System.out.print("700원입니다.");
			//break; 케이스값이 똑같을때 (중복되는 코드는) 공유가된다.
		case 2:
			System.out.print("600원입니다.");
			break;
		case 3:
			System.out.print("500원입니다.");
			break;
			
		default: 
			System.out.println("잘못된 선택");
			break;
			
		}
				
				
	}

	//1입력 => "하나"
	
	
	private static void m1() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자: ");
		int num = scan.nextInt();
		
		if(num == 1) {
			System.out.println("하나");
		} else if (num==2) {
			System.out.println("둘");
		} else if (num==3) {
			System.out.println("셋");
		}	
		
		//Cannot switch on a value of type double. Only convertible int values, strings or enum variables are permitted
		//문자나 정수
		switch (num) {
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		case 3:
			System.out.println("셋");
			break;
		}
		
		
		
		
	}
}
