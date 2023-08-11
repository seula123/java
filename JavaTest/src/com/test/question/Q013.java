package com.test.question;

import java.util.Scanner;

public class Q013 {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어: ");
		
		int kor = scan.nextInt ();
		
		
		System.out.println("영어: ");
		
		int eng = scan.nextInt();
		
		
		System.out.println("수학: ");
		
		int math = scan.nextInt();
		
		
		String result = test(kor,eng,math);
		
		
		
		System.out.printf("%s입니다." , result);
	}

	public static String test (int kor, int eng, int math) {
		
		
		String result = ((kor+eng+math)/3>=60)? "합격":"불합격";
			result = (kor <40 || eng < 40 || math < 40)? "불합격":result;
				
		return result;
	}
	
