package com.test.question;

import java.awt.List;

public class Q075 {
	
	public static void main(String[] args) {
		
		int[][] list = new int [5][5]; // 2차원 배열 
		
		int n = 1;
		
		for(int i=0; i<list.length-1; i++) {  
			for (int j=0; j<list.length-1; j++) {
				
				list[i][j] = n;
				list[i][4] += n;
				list[4][j] += n;
				list[4][4] += n;
				
				n++;
			}
		}

		printArray(list);
		
	}

	private static void printArray(int[][] list) {
		
		for (int i= 0; i<list.length; i++) {
			for (int j=0; j<list.length; j++) {
				System.out.printf("%5d",list[i][j]);
			}
			System.out.println();
		}
		
	}

}
