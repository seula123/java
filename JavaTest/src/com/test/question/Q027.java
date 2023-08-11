package com.test.question;

import java.util.Scanner;

public class Q027 {
	
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자: ");
		
		String input = scan.nextLine();
		
		String result = "";
		
		if (input.equals("f") || input.equals("F")) {
			result = "Father";
		} else if (input.equals("s") || input.equals("S")){
			result = "Sister";
		} else if  (input.equals("m") || input.equals("M")) {
			result = "Mother";
		} else if (input.equals("b") || input.equals("B")) {
			result = "Brother";
		} else {System.out.println("입력한 문자가 올바르지 않습니다");}
		
		System.out.println(result);
		
		
	}//main

}
