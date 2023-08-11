package com.test.question;

import java.util.Arrays;

public class Q063 {
	
	public static void main(String[] args) {
		
		/*
		 요구사항
		 	int 배열을 매개변수로 받아 내용을 문자열로 반환하는 dump 메소드를 구현하시오.

		 조건..
			String dump(int[] list)
		  
		  */
		
		
		int[] list = new int[4]; 

		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;

		String result = dump(list); //dump 메서드 
		System.out.printf("nums = %s\n", result);
	}

	private static String dump(int[] list) {
		
		return Arrays.toString(list);  //int형 배열 -> 문자열로 변환해서 반환
	}
	
		

}
