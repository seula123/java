package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q062 {

	public static void main(String[] args) {
		
		/*
		  요구사항
			학생의 이름을 N개 입력받아 아래와 같이 출력하시오.

		  조건..
			이름을 오름차순 정렬하시오.
		  */
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생 수: ");
		int count = scan.nextInt();
		scan.nextLine(); 	//메서드는 정수를 읽은 후에 줄 바꿈 문자를 남겨두므로, 
							// 제거하기 위해 빈 문자열을 읽어서 버립니다.
		
		String[] names = new String[count];  //배열 선언
		for(int i = 0; i<names.length; i++) {
			System.out.println("학생명: ");
			names[i] = scan.nextLine(); 
		}
		
		Arrays.sort(names); //오름차순 정렬
		
		System.out.printf("입력한 학생은 총 %d명입니다. \n",count);
		for(int j = 0; j<names.length; j++) {
			System.out.printf("%d. %s",j+1,names[j]);
		}
	}
}
