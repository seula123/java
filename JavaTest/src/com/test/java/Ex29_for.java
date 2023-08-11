package com.test.java;

import java.util.Scanner;

public class Ex29_for {
	
	public static void main(String[] args) {
		
		//Ex29_for.java
		
		//제어문 > 조건문
		//제어문 > 반복문
		
		/*
		
			반복문
			- 특정 코드를 개발자가 원하는 횟수만큼 반복 제어
			- 생산성 향상 + 유지보수성 향상
			
			for문
			
			for (초기식; 조건식; 증감식) {
				문장;
			}
		
		*/
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		m7();
		
	}//main

	private static void m7() {
		
		//요구사항] 구구단 출력
		/*
		
			5 x 1 = 5
			5 x 2 = 10
			5 x 3 = 15
			..
			5 x 9 = 45
		
		*/
		
		for (int i=1; i<=9; i++) {
			
			System.out.printf("5 x %d = %2d\n", i, 5 * i);
			
		}
		
		
		//요구사항] 사용자 원하는 단 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단: ");
		int dan = scan.nextInt();
		
		for (int i=1; i<=9; i++) {
			
			System.out.printf("%d x %d = %2d\n", dan, i, dan * i);
			
		}
		
	}

	private static void m6() {
		
		//요구사항] 사용자로부터 숫자 10개를 입력받아 누적?
		Scanner scan = new Scanner(System.in);
		
		int sum = 0; //누적변수
		
		for (int i=0; i<10; i++) {
			
			System.out.print("숫자: ");
			int num = scan.nextInt();
			sum += num; //사용자 입력 숫자 > 누적
			
		}
		
		System.out.println(sum);
		
	}

	private static void m5() {
		
		//요구사항] 1 ~ 사용자가 원하는 숫자까지의 합?
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		
		int num = scan.nextInt();
		
		int sum = 0; //누적 변수
		
		//몇회전: 컴파일(X), 런타임(O) > 지연된다.
		for (int i=1; i<=num; i++) {
			sum += i;
		}
		
		System.out.printf("1 ~ %d = %d\n", num, sum);		
		
	}

	private static void m4() {
		
		//요구사항] 1~10까지의 합 > 누적
		
		//누적하기
		//- 누적 변수(반드시 초기화)
		int sum = 0;
		
		for (int i=1; i<=10; i++) {
			
			System.out.println(i);
			
			//sum += i;
			sum = sum + i;
			
			//1 = 0 + 1
			//3 = (0 + 1) + 2
			//6 = (0 + 1 + 2) + 3
			//10 = (0 + 1 + 2 + 3) + 4
			//...
			//45 = (0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8) + 9
			//55 = (0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9) + 10
			
		}
		
		System.out.println(sum);
		
	}

	private static void m3() {
		
		//반복문 > 루프 변수?
		//2. 루프 변수의 역할 > 회전수 or 값
		
		//요구사항] 숫자 1~10까지 출력
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		System.out.println();
		
		int num = 1;
		
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println(num);
		num++;
		System.out.println();
		
		
		num = 1;
		
		for (int i=0; i<10; i++) {
			System.out.println(num + ":" + i);
			num++;
		}
		System.out.println();
		
		//루프변수 > 회전수 or 값
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		
		for (int i=1; i<=10; i+=2) {
			System.out.println(i);
		}
		System.out.println();
		
		for (int i=2; i<=10; i+=2) {
			System.out.println(i);
		}
		System.out.println();
		
		//수열
		
	}

	private static void m2() {
		
		//반복문 > 회전수?
		//1. 반복문의 실행 횟수를 내가 제어할 수 있는지?
		
		for (int i=1; i<=5; i++) {
			System.out.println("실행문");
		}
		System.out.println();
		
		
		for (int i=5; i<=9; i++) {
			System.out.println("실행문");
		}
		System.out.println();
		
		
		for (int i=1; i<=9; i=i+2) {
			System.out.println("실행문");
		}
		System.out.println();
		

		for (int i=5; i>0; i--) {
			System.out.println("실행문");
		}
		System.out.println();
		
	}

	private static void m1() {
		
		//요구사항] "안녕하세요" x 5회 출력
		
		//Case 1.
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println();
		
		//Case 2.
		hello();
		hello();
		hello();
		hello();
		hello();
		System.out.println();
		
		//Case 3.
		
		//1. int i=1
		//2. i<=5
		//3. 블럭(문장) 실행
		//4. i++
		//5. i<=5
		//6. 블럭(문장) 실행
		//7. i++
		//8. i<=5
		//9. 블럭(문장) 실행
		
		//초기식: 루프 변수(i)를 초기화하는 역할
		//조건식: 루프 지속 유무 조건
		//증감식: 루프 변수에 변화를 주는 역할 > 언젠가 루프 탈출(false)
		
		for (int i=1; i<=5; i++) {
			System.out.println("안녕하세요."); //x5회
		}
		
		
	}//m1
	
	public static void hello() {
		System.out.println("안녕하세요.");
	}

}













