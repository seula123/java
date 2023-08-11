package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q069 {
	
	public static void main(String[] args) {
		
		/*
		 요구사항
		  배열의 요소를 순차적으로 2개씩 더한 결과를 배열로 생성한 뒤 출력하시오.

		 조건..
		  원본 배열 길이: 사용자 입력
		  원본 배열 요소: 난수(1~9)
		  결과 배열 길이: 사용자 입력 / 2
		  
		  입력..
		   배열 길이: 10 
		  
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("배열 길이: ");
		int input = scan.nextInt();
		
		int[] nums = new int[input];
		int[] result = new int[input/2];
		
		for (int i=0; i<input; i++) {
			nums[i] = (int)(Math.random()*9)+1; // 난수
		}
		
		System.out.printf("원본: %s \n",Arrays.toString(nums));
		

		for(int i=0; i<(input+1)/2; i++) {
			if (input%2 ==0) {
				result[i] =nums[i*2] + nums[i*2+1];
			}
			else {
				if((i*2)+1 ==input) {
					result[i] = nums[i*2];
				}
				else {
					result[i] = nums[i*2]+nums[i*2+1];
				}
			}
		}
		
			System.out.printf("결과: %s \n",Arrays.toString(result));
		
		
		
		
	}

}
