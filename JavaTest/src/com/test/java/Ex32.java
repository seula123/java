package com.test.java;

public class Ex32 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		while (i<=10) {
			if (i%2==0) {
				System.out.println(i);
				sum = sum +i;
			}
			i++;
		}
		System.out.println(sum);
	
	}
}
