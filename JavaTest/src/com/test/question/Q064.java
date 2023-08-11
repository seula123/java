package com.test.question;

import java.util.Arrays;

public class Q064 {

	
	public static void main(String[] args) {
		
		/*
		  
		 요구사항
		  1~20 사이의 난수를 담고 있는 배열을 생성하고 최댓값과 최솟값을 출력하시오.

		 조건..
		  난수를 20개 발생 후 배열에 넣는다.
		  난수는 1 ~ 20 사이

		  */
		
		
		int maxNum = 0;
		int minNum = 21;
		int[]randomNums = new int[20];
		
		for (int i=0; i<randomNums.length; i++ ) {
			
			randomNums[i] = (int)((Math.random()*20)+1); //1~20
		}
		for (int j=0; j<randomNums.length; j++) {
			if (maxNum < randomNums[j]) {  //반복문으로 모든 값을 넣어 최댓값을 찾는 반복문
				maxNum = randomNums[j];
			}
			
			if (minNum > randomNums[j]) {
				minNum = randomNums[j];
			}
		}//for
		
		
		System.out.printf("원본: %s \n",Arrays.toString(randomNums));  //문자열로 변환
		System.out.printf("최댓값: %d \n",maxNum);
		System.out.printf("최솟값: %d \n",minNum);
		
	}
}
