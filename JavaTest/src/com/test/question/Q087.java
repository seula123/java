package com.test.question;

import java.util.Scanner;

public class Q087 {
	
	public static void main(String[] args) {
		
		String word = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("합성어: ");
		word = scan.nextLine();
		
		for(int i=0; i<word.length(); i++) {
			char c = word.charAt(i); //합성어에서 현재 인덱스 i에 해당하는 문자를 가져와 c 변수에 저장
			
			if(c>='A'&& c<='Z'&&i!=0) {
				//현재 문자 c가 대문자이고, 인덱스 i가 0이 아니라면 (첫 단어가 아니라면) 실행
				System.out.print(" ");
				// 공백을 출력하여 대문자로 시작되는 단어 사이에 공백을 추가
			}
			System.out.print(c);
		}
	
	}

}
