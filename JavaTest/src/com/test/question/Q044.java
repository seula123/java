package com.test.question;

import java.util.Scanner;

public class Q044 {
	
	public static void main(String[] args) {
		
		
		int sum = 0;
		int num = 0;
		String txt = "";
		
		Scanner scan = new Scanner(System.in);
		
		for(;;) {
			
			System.out.println("숫자: ");
			 num = scan.nextInt();
			
			if (num%2==0) {
				
				sum = sum + num;
				txt = txt + "+" +num;
				
			} else {
				
				sum = sum - num;
				txt = txt + "-" +num;
			}
			
			if (sum>=100) {
				break;
			}
			
		}//for
		
		
		System.out.println(txt + "=" + sum);
		
	}//main

}//끝
