package com.test.question;

import java.util.Scanner;

public class Q061 {
	
	/*
	 
	  요구사항
		숫자를 5개 입력받아 배열에 담은 뒤 역순으로 출력하시오.
	  조건..
		int[] nums = new int[5];
	  
	 
	 * */
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] nums = new int[5];   //배열 선언
		
		for (int i=0; i<nums.length; i++) {  
		
			System.out.println("숫자: ");
			
			nums[i] = scan.nextInt();
	
		}//for
		
		
		for (int j=nums.length-1; j>=0; j--) {
			System.out.printf("nums[%d] = %d \n",j,nums[j]);
		}
		
		
		
	}//main
}
