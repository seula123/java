	package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q068 {
	
	public static void main(String[] args) {
		
		/*
		 조건..
		  배열 길이: 10
		  마지막 요소는 우측으로 옮겨질 공간이 없으면 삭제된다. 
		  
		 입력..
		   삽입 위치: 2 
		   값: 100 
		 
		  */

		Scanner scan = new Scanner(System.in);
		
		
		int[] nums = {5,6,1,3,2,8,7,4,10,9};
		
		System.out.print("삭제 위치: ");
		int place = scan.nextInt();
		
		System.out.println(Arrays.toString(nums));
		
		for (int i=place; i<nums.length-1; i++) {
			
			nums[i] = nums[i+1]; //뒤의 값을 앞에 복사
			
		}
		nums[nums.length-1] = 0; //마지막자리에 0 넣기

		System.out.println(Arrays.toString(nums));
	}

}
