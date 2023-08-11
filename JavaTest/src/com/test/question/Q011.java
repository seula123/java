package com.test.question;

import java.util.Scanner;

public class Q011 {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자: ");
		
		int n1 = scan.nextInt ();
		
		System.out.println("두번째 숫자: ");
		
		int n2 = scan.nextInt ();
		
		
		String result = add(n1,n2);
		System.out.println(result);
		
		
		result = subtract(n1,n2);
		System.out.println(result);
		
		result = multiply(n1,n2);
		System.out.println(result);
		
		result = divide(n1,n2);
		System.out.println(result);
		
		result = mod(n1,n2);
		System.out.println(result);
		
	}
	
	
	public static String add (int n1, int n2) {
	
		int result = n1 + n2;
		String txt = n1 + "+" + n2 + "=" + result;
		
		return txt;
		
	}
	
	public static String subtract (int n1, int n2) {
		
		int result = n1 - n2;
		String txt = n1 + "-" + n2 + "=" + result;
		
		return txt;
	}
	
	public static String multiply (int n1, int n2) {
		
		int result = n1*n2;
		String txt = n1 + "*" + n2 + "=" + result;
		
		return txt;
	}
	
	public static String divide(int n1, int n2) {
		double result = (double)n1/n2;
	    String txt = String.format("%d / %d = %.1f",n1,n2, result);
		
		return txt;
	}
	
	public static String mod (int n1, int n2) {
	
	int result = n1 + n2;
	String txt = n1 + "%" + n2 + "=" + result;
			
	return txt;
	
	}
			
			

}
