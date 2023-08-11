package com.test.java;

import java.util.Scanner;   //***

public class Ex12_Scanner {
	
	
	public static void main(String[] args) {
		
		//Ex12_Scanner.java
		
		
		Scanner scan = new Scanner(System.in);  //Wrapper Class
		
		/*
		System.out.println("문자열: ");
		
		String line = scan.nextLine(); //reader.readLine()
		System.out.println(line);
		
		System.out.println("숫자: ");
		int num = scan.nextInt();     //Integer.parseInt("100") 을 안해도 된다 
		System.out.println(num);
		*/
		
		
		//숫자 2개 입력해서 연산
		
		System.out.println("첫번째 숫자: ");
		
		//아까햇던거 String input = reader.readLine();
		//int num = Integer.parseInt(input); 로 했던걸 간결하게 표한할 수 잇다 
		
		double num1 = scan.nextDouble();
		
		System.out.println("두번째 숫자: ");
		
		double num2 = scan.nextDouble();
		
		
		System.out.printf("%.1f + %.1f = %.1f\n", num1, num2, num1+num2 );
		
		
		
		//BufferedReader 보다 간결하고 throws Exception 문장위에 이걸 쓰지않아도된다 보통 Scanner을 주로 씀
		
		
	
	
	
	}

}
