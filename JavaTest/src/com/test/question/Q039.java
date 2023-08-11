package com.test.question;

import java.util.Scanner;

public class Q039 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		String txt = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("시작 숫자: ");
		int begin = scan.nextInt();
		
		System.out.println("종료 숫자: ");
		int end = scan.nextInt();
		
		for(int i=begin; i<=end; i++) {
			
			 sum = sum + i;
			
			 txt = txt + i;
			
			if (i<end) {
				
				txt = (txt + "+");
			}
			
		}
		
		System.out.println(txt + "="+sum);
		
		
	}

}
