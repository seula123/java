
//주석,Comment
//-컴파일 작업 때 제외하는 영역

//단일 라인 주석. 엔터까지 주석 영역(한줄)

/*
 다중 라인 주석
 하나
 둘
 셋
 */

// 단축키 사용
// - 단일 라인:ctrl+/
// - 다중 라인:ctrl+shift+/, ctrl+shift+\


// 패키지 선언
// -현재 자바 파일이 어떤 패키지 내에 위치하는지 표현
package com.test.java;

//클래스,Class
//-코드의 집합
//-public class Ex01 : 클래스 선언부(Header)
//-{}: 클래스 몸통(Body),구현부

// "Ex01이라는 클래스입니다."

public class Ex01 {

	//메소드,Method
	//-코드의 집합
	public static void main(String[] args) {
		
		//명령어 > 문장 단위 구성
		
		//문장입니다.
		
		//자바의 문장 종결자: ';'
		
		//-System: 클래스
		//- '.' : 멤버 접근 연산자(Member Access Operator) 부모,자식
		//- out: 필드(field)
		//- println(): 메소드 호출
		//- "안녕하세요.": 문자열 리터럴
		
		System.out.println("안녕하세요");
		
		
		/*
		 
		 특수문자(영문표현)
		 - ~, !, @, #, $, %, ^(caret, xon), &, *, -, _, +, =
		 - ;, :, ", ', ?, /(slash), \(back slash),
		 -`(역따옴표, back quote, back tick)
		 -|(pipe, vertical bar, or)
		 - (): 소괄호  
		 - {}: 중괄호
		 - []: 대괄호
		 - <>: 화살표 괄호 
		 
		 
		 폰트 > 프로그래밍 폰트 추천
		 - 1, l, I, |, i
		 - 0, o, O, D
		 - ",''
		 
		 
		 이클립스> 코드 자동 완성> Ctrl+space
		 -현재 상태에서 사용 가능한 문법만 보여준다.(****)	 
		 
		 */
		
		//ctrl+alt+방향키(위/아래):복사
		//alt+방향키(위/아래) :이동
		System.out.println(100);
		System.out.println(200);
		System.out.println(200);
		
		//shift+방향키+(위,아래,좌우,home,end)
		//shift+Ctrl+방향키
		
		//Ctrl + D: 한줄 삭제
		
		//Ctrl + Shift + L 
		
		//Ctrl +F6 > Ctrl+tab
		
		
	}

}
