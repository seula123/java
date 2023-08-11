package com.test.question;

public class Q071 {
	public static void main(String[] args) {
		
		int[][] list = new int [5][5]; //5x5 크기
		
		int n = 25;  //배열에 채워질 숫자
		
		for (int i=0; i<list.length; i++) {
			for( int j=0; j<list[i].length; j++) {
				list [i][j] = n; 
				n--;
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
