package com.test.question;

public class Q072 {
	
	public static void main(String[] args) {
		
		int[][] list = new int [5][5];  //5x5 배열
		
		int n = 1; 
		
		for(int i=0; i<list.length; i++) {
			for(int j=0; j<list[0].length; j++) {
				list[j][i] =n;       ////00,10,20,30,40,50 01,11,22,33... 이 될수 있도록
				n++;
			}
		}
		
		printArray(list);	
		
	}//main

	private static void printArray(int[][] list) {
		
		for (int i=0; i<5; i++) {
			   for(int j=0; j<5; j++) {
			      System.out.printf("%5d", list[i][j]);
			   }
			   System.out.println();
			}
		
	}
	
	
}
