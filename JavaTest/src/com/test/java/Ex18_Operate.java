package com.test.java;

import java.util.Scanner;

public class Ex18_Operate {
	
	public static void main(String[] args) {
	
//		Ex18_Operate.java
		
		
		//요구사항] 사용자로부터 문자 1개 입력하면 , 영어 소문자인지 아닌지 검사하고싶다
		//        > 유효성 검사 (Validation)
		
		
		/*
		  1. 스캐너 생성하기
		  2. 안내 메시지 출력
		  3. 문자 입력
		  4. 영어 소문자 검사 (문자 코드값)
		  5. 결과 출력
		  
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자: ");
		
		String input = scan.nextLine();
		
		//입력한 문자의 문자코드값?
	 // System.out.println((int)input);     //참조형이라 형변환하면 안됨
		
		
		System.out.println((int)input.charAt(0));  
		//문자열에서 캐릭터로 바뀜 "ABC"를 넣으면 첫번째"A"를 뽑아주는 역할 (input.charAt(0)); char로변햇으니까 (int)를 넣어서 형변환해줌
		
		/*앞에거라도 외우기
		 A(65) ~ Z(90)
		 a(97) ~ z(122)
		 0(48) ~ 9(57)  문자0일때,문자57일때
		 가(44032) ~ 힣(55203)
		 
		 한글
		 1.완성형 한글 = 가,강,곽,갑..
		 2.조합형 한글 = ㄱ,ㄴ,초성,중성,종성..
		 
		 */
		
		int code = (int)input.charAt(0);
		System.out.println(code >= 97 && code <= 122);
		
		
		
		System.out.printf("입력한 문자 '%c'는 소문자가 %s\n"
							, code
							, (code >= 97 && code <= 122) ? "맞습니다":"아닙니다");

		
		System.out.println(code >= 97 && code <= 122);  
		
		System.out.println(code >= (int)'a' && code <= (int)'z');  //암시적 변환

		System.out.println(code >= 'a' && code <= 'z');   //형변환 안해도됨
		
		
		
	}

}
