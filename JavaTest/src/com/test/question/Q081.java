package com.test.question;

import java.util.Scanner;

public class Q081 {

	public static void main(String[] args) {
		
		//이메일 주소를 입력받아 아이디와 도메인을 각각 추출하시오.
		
		String email ="";
		int index = -1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이메일: ");
		email = scan.nextLine();
		
		index = email.indexOf("@"); // "@" 기호가 처음으로 나타나는 인덱스를 찾아서 변수 index에 저장
		
		System.out.println("아이디: "+email.substring(0, index)); // 0부터 index 바로 전까지의 문자열을 추출
		System.out.println("도메인: "+email.substring(index+1)); //index 다음 인덱스부터 문자열의 끝까지 추출
		
	}

}
