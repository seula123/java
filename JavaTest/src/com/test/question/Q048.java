package com.test.question;

import java.util.Scanner;

public class Q048 {
	
	
	public static void main(String[] args) {
		
		
		int evenSum = 0;
		int oddSum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int num = scan.nextInt();
		
		
		while (num>0) {
			
			if (num%10%2 == 0) {
				evenSum = (evenSum+num) %10;
			} else {
				oddSum = (oddSum+num) %10;
			}
			
			num/=10;
			
		}
		
		System.out.printf("짝수의 합: %d\n",evenSum);
		System.out.printf("홀수의 합: %d\n",oddSum);
	
	
	}

}
