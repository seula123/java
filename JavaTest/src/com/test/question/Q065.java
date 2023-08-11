package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q065 {
	
	public static void main(String[] args) {
		
		/*
		 조건..
		  난수를 20개 발생 후 배열에 넣는다.
		  난수는 1 ~ 20 사이
		  배열을 탐색하여 범위에 만족하는 숫자만 출력한다.
		  
		  입력..
		   최대 범위: 15 
		   최소 범위: 5
		   
		  출력..
		   원본: 10, 2, 3, 20, 15, 9, 5, 1, 3, 11, 15, 18, 9, 14, 18, 5, 8, 2, 1, 17
		   결과: 10, 15, 9, 5, 11, 15, 9, 14, 5, 8
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		
		String result = "";  //출력에서 결과값
		
		System.out.println("최대 범위: ");
		int maxNum = scan.nextInt();
		
		System.out.println("최소 범위: ");
		int minNum = scan.nextInt();
		
		int [] randomNums = new int[20];  //배열 선언
		
		for (int i=0; i<randomNums.length; i++) {
			
			randomNums[i] = (int)((Math.random()*20)+1);  //1~20 난수 생성
		}
		
		for (int j=0; j<randomNums.length; j++) {  
			
			if (randomNums[j]>minNum && randomNums[j]<maxNum) {  //최소 최대 범위 확인
				
				result = result + (randomNums[j]+",");  //
			}
			
		}
		
		System.out.printf("원본: %s \n",Arrays.toString(randomNums));
		System.out.printf("결과: %s \n",result);
		
		
	}

}
