package com.test.java;

public class Ex08 {
	
	public static void main(String[] args) {
		
		System.out.println("교환 전 ");
		
		int javaScore = 83;
		int pythonScore = 100;
		
		System.out.println("javaScore : " + javaScore);
		System.out.println("pythonScore : " + pythonScore);
		
		System.out.println("교환 후 ");
		
		int temp=javaScore;
		
		javaScore = pythonScore;
		pythonScore = temp;
		
		System.out.println("javaScore : " + javaScore);
		System.out.println("pythonScore : " + pythonScore);
	}

}
