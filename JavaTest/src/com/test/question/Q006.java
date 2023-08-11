package com.test.question;

import java.util.Scanner;

public class Q006 {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("한달 수입 금액(원): ");
		
		int income = scan.nextInt();
		
		double afterTaxAmount = income * 0.967;
		
		double tax = income * 0.033;
		
		System.out.printf("세후 금액(원): %,.0f원 \n ", afterTaxAmount,tax);
		
		System.out.printf("세금(원): %,.0f원", tax);
		
		
		
		
	}

}
