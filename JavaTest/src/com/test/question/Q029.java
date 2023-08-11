package com.test.question;

import java.util.Scanner;

public class Q029 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		
		int n1 = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		
		int n2 = scan.nextInt();
		scan.nextLine();
		
		System.out.print("연산자: ");
		
		
		String op = scan.nextLine();
		
		
		if (op.equals("*")) {
			System.out.printf("%d%s%d=%d",n1,op,n2,(n1*n2));
		} else if (op.equals("/")) {
			System.out.printf("%d%s%d=%d",n1,op,n2,(n1/n2));
		} else if (op.equals("+")) {
			System.out.printf("%d%S%d=%d",n1,op,n2,(n1+n2));
		} else if (op.equals("-")) {
			System.out.printf("%d%s%d=%d",n1,op,n2,(n1-n2));
		} else if (op.equals("%")) {
			System.out.printf("%d%s%d=%.1f",n1,op,n2,(double)n1%n2);
		} else {
			System.out.println("연산이 불가능합니다");	}
		
		
		
		
		
		
		
		
		
	}//main
	
	
	
	

}
