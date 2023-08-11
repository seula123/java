package com.test.java;

public class Ex23 {
	
	public static void main(String[] args) {
		
		int javaScore = 50;
		
		if (javaScore>=60) {
			System.out.println(javaScore+"점은 합격입니다");
		}
		else { 
			if (javaScore<30) {
				System.out.println(javaScore+"점은 패널티입니다");
			}
			else {
				System.out.println(javaScore+"점은 불합격입니다");
			}
		}
	}
}
