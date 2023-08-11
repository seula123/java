package com.test.question;

import java.util.Arrays;

public class Q066 {

	public static void main(String[] args) {
		
		/*
		  요구사항
		   중복되지 않는 임의의 숫자 6개를 만드시오.(로또)
		   
		  조건..
			숫자의 범위: 1 ~ 45
			오름차순 정렬
		 */
		
		
		int[] randomNums = new int [6];
		
		for (int i=0; i<randomNums.length; i++) {
			
			randomNums[i] = (int)((Math.random()*45)+1); //랜덤 생성
		
		for (int j=0; j<i; j++) {
			
			if (randomNums[j]==randomNums[i]) {
				i--;    //새로 생성한 값과 기존의 값이 중복될경우 상쇄하여 다시실행
				continue;
			}
		}
		
		Arrays.sort(randomNums);  //오름차순
		System.out.println(Arrays.toString(randomNums));
		
		
		
		}
		
	}
}
