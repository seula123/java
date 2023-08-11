package com.test.java;

public class Ex19_Method {

	/*
	  main 메소드 :public static void main(String[] args)
	  -특수 메소드
	  -이름이 예약어:main
	  -프로그램이 시작되면 자바가 자동으로 호출하는 메소드
	  -프로그램의 시작점(Entry Point) 이라고 부른다
	  
	  -프로그램의 시작점이자 종착점(End Point)이다
	 */
	
	
	public static void main(String[] args) {
		
		//Ex19_Method.java 책5.6에 있다
		
		/*
		  메소드, Method
		  - 함수(Function), 프로시저(Procedure), 서브루트. (Sub Routine)
		  - 코드의 집합
		  - 행동의 단위
		  - 같은 목적을 가진 코드의 집합
		  - 코드 재사용의 단위
		  
		  변수 사용 절차
		  1. 변수 선언
		  2. 변수 사용
		  
		  메소드 사용 절차
		  1. 메소드 선언
		  2. 메소드 사용(호출) == 실행
		  
		  
		 */
		
		
		//요구사항] "안녕하세요." 출력 x 5회
		//수정사항] "반갑습니다." 수정
		
		//비용? 10 x 5 = 50
		System.out.println("반갑습니다");  //작성
		System.out.println("반갑습니다");  
		System.out.println("반갑습니다");
		System.out.println("반갑습니다");
		System.out.println("반갑습니다");
		System.out.println();
		
		
		/*메소드 사용 목적
		 1. 코드의 분리 - 목적 맞는 코드를 각각 따로 관리
		 2. 코드의 재사용 
		*/
		
		//메소드 호출(실행)
		hello();
		hello();
		hello();
		hello();
		hello();
		
		
		//요구사항] 숫자를 한글로 1~10까지 출력
		printNumber();
		printNumber();
		printNumber();
		
		
		
		
	}//main
	
	/*
	  메소드 선언
	  1. class 내부
	  2. 메소드간의 순서 무관
	
	
	  메소드 선언 구문
	  
	  public static void hello() {
	  
	  }
	
		- public static void hello() :선언부(header) /특징,성격을 나타냄
		- {} : 구현부(body) /내용물
	      
	      public : 접근 지정자(제한자) Access Modifier
	      static : 정적 키워드
	      void : 반환값의 자료형
		  hello : 메소드명 (개발자 명명)
		  () : 인자 리스트
		  
	*/
	
	//특정한 목적을 가지는 코드의 집합
	public static void hello () {
		
		//해당 메소드가 하려는 업무 구현 (선언)
		System.out.println("안녕하세요");
		
	}
	
	public static void printNumber() {
		
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덟");
		System.out.println("아홉");
		System.out.println("열");
		System.out.println();
	}
	
	
}//class
