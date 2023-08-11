package com.test.question;

import java.util.Scanner;

public class Q045 {
	
	
	public static void main(String[] args) {
		
		int max = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("최대 숫자: ");
		
		max = scan.nextInt();
		
		if (max < 1000) {
			
			for (int i = 1; i<=max; i++) {
				
				System.out.println(checkClap(i)+"");
			}
			
		}//if
		
		else {
			System.out.println("1000이하만 가능합니다.");
		}
		
		
		
		
	}//main

	private static String checkClap(int i) {
		
		String temp = "";
		int n = i;
		
		for (n=i; n>0;) {
			
			if (n%10%3 == 0&& n%10 !=0) {
				
				temp+="짝";
				
			}
			
			n/=10;
		}
		
		if (temp.equals("")) {
			
			return i + "";
		} else {
			return temp;
		}
		
	}

}//끝
