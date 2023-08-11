package com.test.java;

public class Ex14 {
	
	public static void main(String[] args) {
		
		char gender = 'm';
		int score = 87;
		
		System.out.println("and 연산");
		
		System.out.println(gender =='f' && (score%0)==0);
		
		
		System.out.println("or 연산");
		
		System.out.println(gender =='m'||score<=80);
		System.out.println(gender =='f'||score>=80);
		System.out.println(gender =='m'|| (score%0)==0);
	}

}
