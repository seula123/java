package com.test.question;

import java.util.Scanner;

public class Q025 {

	
	
	public static void main(String[] args) {
		
		int max = 0;
		int min = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		
		int num1 = scan.nextInt();
		
		System.out.println("두번째 숫자: ");
		
		int num2 = scan.nextInt();
		
		if (num1>num2) {
			 max = num1;
			 min = num2;
		}else {
			 max = num2;
			 min = num1;
		}
		
		int gap = max-min;
			
		if (max != min){
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d가 차이납니다.\n",max,min,gap);		
		} else { System.out.print("두 숫자는 동일합니다.");
		
		}
	
	}
		
		
		
}
	

