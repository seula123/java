package com.test.java;

import java.util.Scanner;

public class Ex18_Operator {
	
	public static void main(String[] args) {
		
		//Ex18_Operator.java
		
		//요구사항] 사용자로부터 문자 1개 입력 요청 후 그 값이 영소문자인지 검사?
		//									 > 유효성 검사(Validation)
		
		//1. 스캐너 생성하기
		Scanner scan = new Scanner(System.in);
		
		//2. 안내 메시지 출력
		System.out.println("문자: ");
		
		//3. 문자 입력
		String input = scan.nextLine();
		
		//입력한 문자의 문자코드값을 구해야함 - int는 불가 : 참조형 값형은 변환 불가
		//4. 영어 소문자 검사(문자 코드값으로 비교)
		//5. 결과 출력
		System.out.println(input); //A만 나옴
		System.out.println(input.charAt(0)); //"ABC" 입력하면 앞(0) "A"가 'A'(char A)가 됨
		System.out.println((int)input.charAt(0)); //97
		
		/*
		* 외워야하는 문자코드
		1. A(65) ~ Z(90) 
		2. a(97) ~ z(122)
		3. 0(48) ~ 9(57)
		4. 가(44032) ~ 힣(55203)
			- 완성형 한글 : 가, 강, 곽, 갑..
			- 조합형 한글 : ㄱ, ㄴ, 초성, 중성, 종성..
		*/
		
		int code = (int)input.charAt(0);
		System.out.println(code >= 97 && code <= 122);
		
		System.out.printf("입력한 문자 '%c'는 소문자가 %s\n"
							, code
							,(code >= 97 && code <= 122) ? "맞습니다." : "아닙니다.");
		
		System.out.println(code >= 97 && code <= 122); //숫자만 있으면 문자가 뭔지 모름
		System.out.println(code >= (int)'a' && code <= (int)'z'); //직접 작성
		
		// int >= char, char 'a'는 숫자형 자료니까 형변환 필요없음
		System.out.println(code >= 'a' && code <= 'z'); 

	
		
		
		
		
	}

}
