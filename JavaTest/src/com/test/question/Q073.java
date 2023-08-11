package com.test.question;

public class Q073 {
	
	public static void main(String[] args) {
	
		
		int[][] list = new int [5][5];
		
		int n = 1;
		
		for (int i=0; i<list.length; i++) {
			for (int j=0; j<list.length-i; j++) {  //빈 0의 값을 만들기 위해
				list [i][j] = n;
				n++;
			}
		}
	
		printArray(list);
	
	}//main

	private static void printArray(int[][] list) {
		
		for (int i=0; i<5; i++) {
			   for(int j=0; j<5; j++) {
			      System.out.printf("%3d", list[i][j]);
			   }
			   System.out.println();
			}
		
	}
}
