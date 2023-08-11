package com.test.question;

import java.util.Scanner;

public class Q015 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("맑은 날: ");
		
		int sunny = scan.nextInt();
		
		System.out.println("흐린 날: ");
		
		int foggy = scan.nextInt();
		
		
		int result = getApple(sunny,foggy);
		
		System.out.printf("사과가 총 %d개 열렸습니다.",result);
		
		
	}

		public static int getApple(int sunny, int foggy) {
			
			int height = sunny*5+foggy*2;
					
			int result = height>=100? (height-100)/10:0;
			return result;
			
		}

}

