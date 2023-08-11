package com.test.question;

import java.util.Scanner;

public class Q002 {
	
	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);

		System.out.print("첫번째 숫자: ");
		
		int number1 = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		
		int number2 = scan.nextInt();
		
		System.out.printf("%d + %d = %,d \n", number1, number2, number1 + number2);
		System.out.printf("%d - %d = %,d \n", number1, number2, number1 - number2 );
		System.	out.printf("%d * %d = %,d \n", number1, number2, number1 * number2);
		System.out.printf("%d / %d = %,.1f \n", number1, number2, (double)(number1 / number2));
		System.out.printf("%d %% %d = %,d ", number1, number2, number1 % number2);
		
	
	
	
	
	}

}
