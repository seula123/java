package com.test.question;

import java.util.Scanner;

public class Q088 {
	
	public static void main(String[] args) {
		
		String txt ="";
		String[]word = {"바보","멍청이"}; //금지어 목록 배열 선언
		int count = 0; //금지어 발견 카운트
		int index = -1;  //금지어 검색할 때 시작 위치
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력: ");
		txt = scan.nextLine();
		
		for(int i=0; i<word.length; i++) {
			while ((index = txt.indexOf(word[i],index))>-1) {
				count++;
				index = index + word[i].length();
			}
		}
		for (int i=0; i<word.length; i++) {
			txt = txt.replace(word[i], getMaskedText(word[i]));
		}
		System.out.println(txt);
		System.out.printf("금지어를 %d회 마스킹했습니다 \n",count);
		
		scan.close();
	}

	private static String getMaskedText(String word) {
		
		String temp = "";
		
		for(int i=0; i<word.length(); i++) {
			temp += "*";
		}

		return temp;
	}


}
