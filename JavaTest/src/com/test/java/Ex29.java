package com.test.java;

public class Ex29 {
	

	public static void main(String[] args) {
		
		int sum = 0;
		int oddCount = 0;
		
		for (int i = 1; i<=10; i++) {
			if(i%2 != 0) {
				sum = sum+i;
				oddCount++;
			}
		}
	System.out.println("홀수의 갯수"+oddCount);
	System.out.println("홀수의 합"+sum);
	}
}