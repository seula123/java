package com.test.question;

import java.util.Scanner;

public class Q003 {

	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("너비(cm): ");
		
		int width = scan.nextInt();
		
		System.out.print("높이(cm): ");

		int height = scan.nextInt();
		
		int area = width*height;
		int culcumference = width*2 + height*2;
		
		System.out.printf("사각형의 넓이는 %dcm² 입니다.\n",area);
		System.out.printf("사각형의 둘레는 %dcm 입니다.",culcumference);
		
		
		
		
	}
}
