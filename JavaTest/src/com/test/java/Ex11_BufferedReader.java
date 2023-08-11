package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex11_BufferedReader {
	
	public static void main(String[] args) throws Exception {
		
		//Ex11_BufferedReader.java
		
		//BufferedReader 클래스
		
		//Ctrl + Shift + O
		
		//int a;
		
		//reader > 콘솔 입력 도구
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		//System.out.println("문자 입력: ");
		
		//int code = reader.read();	
		//System.out.printf("%c\n",code);
		
		//String line = reader.readLine();
		//System.out.println(line);
		
		
		//System.out.print("이름 입력: ");
		
		//readLine() : 입력 버퍼에서 처음부터 ~ 엔터(\r\n)를 만나기 전까지 모두 읽어오는 메소드
		// - 엔터는 자동으로 삭제
		//String name = reader.readLine();
		
		
		//System.out.printf("안녕하세요. %s님\n",name);
		
		
		//Wrapper Class (Utility Class)
		//- 원시형 데이터를 도와주는 기능을 제공하는 클래스
		//byte > Byte 클래스
		//short > Short 클래스
		//int > Integer 클래스  ********
		//long > Long 클래스  *******
		//float > Float 클래스
		//double > Double 클래스 *******
		//boolean > Boolean 클래스
		//char > Character 클래스
		
		

		//System.out.print("숫자 입력: ");
		
		//String num = reader.readLine();  //100 > "100" 숫자를 넣어도 문자열로 나옴
		
		//int num2 = Integer.parseInt(num); //"100"을 int타입으로 바꿔줌 > 100
		
		//double num2 = Double.parseDouble(num);
		
		//System.out.println(num2 * 2);
		
		
		
		
		
		
		
		//요구사항] 숫자 2개 입력 >  + 더하기 연산 > 연산 과정과 결과를 모두 출력
		
		//숫자1: 5 
		//숫자2: 3
		//5 + 3 = 8

		/*
		System.out.println("첫번째 숫자: ");
		String input1 = reader.readLine();   //"5" 문자열
		
		System.out.println("두번째 숫자: ");
		String input2 = reader.readLine();   //"3"  문자열
		
		
		int n1 = Integer.parseInt(input1);  // "5" -> 숫자 5
		int n2 = Integer.parseInt(input2);  // "3" -> 숫자 3 으로 바뀜
		
		System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
		*/
		
		
		
		System.out.println("숫자: ");

		String input = reader.readLine();
		
		int num = Integer.parseInt(input);
		
		//java.lang.ArithmeticException: / by zero
		// 피제수 / 제수
		// 제수는 0이 될 수 없다.
		System.out.println(100 / num);		
		
		
		//throws Exception 잊지않기!
		
		/* 
		 
		 에러,Error
		 -오류 버그 예외 등..
		 
		 1. 컴파일 에러
		  	- 컴파일 작업 중에 발생하는 에러(번역하다가 발생)
		  	- 컴파일러가 발견! (javac.exe가 번역하다 문법이 틀려서 발견)
		  	- 발견을 하면 모든 컴파일(번역) 작업을 중단 > 프로그램을 생성 불가 (프로그램을 못만듬)> 반드시 해결해야한다
		 	- 이클립스 연동 > 빨간 밑줄
		 	 - 난이도 가장 낮음 = 컴파일러가 알려주니까 발견이 쉽고 고치기도 쉽다
			- 오타! 일 경우가 가장 많음
		 
		 
		 2. 런타임 에러
		 	- 런타임 (Runtime) 프로그램이 실행중  /동작 중에 나는 오류
		 	- 컴파일 작업 중에는 에러가 없음 > 하지만 실행 중에 발생하는 에러
		 	- ex) 100을 0으로 나눔
		 	- 문법에는 오류가 없고 다른 원인에서 발생하는 에러
		 	- 이러한 상황을 예외 (Exception)라고 부른다
		 	- 발견을 할 수도 못 할 수도 있기 때문에 난이도는 중간 = 잠재적 에러, 복불복
		 	- 충분히 사전에 테스트를 거쳐야한다
		 	- ex) 게임 출시 > 클로즈드 알파,클로즈드 베타 -> 오픈 알파,오픈 베타 (런타임 에러 잡는 방법)
		 
		 
		 3. 논리 에러
		 	- 컴파일 성공!, 실행 성공! -> 그런데 결과가 이상
		 	- ex) int a = 3 int b= 5; 더하기를 해야하는데 syso(a-b) 빼기를 해서 결과값이 다르게 나옴
		 	- 발견,수정이 어려움 난이도 최악! 
		 
		 
		 
		 
		 
		 * 
		 */
		
		
		
	}//main

}
