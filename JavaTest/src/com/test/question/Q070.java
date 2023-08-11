package com.test.question;

public class Q070 {
	
	public static void main(String[] args) {
		
		int[][] list = new int [5][5];  //2차원 배열 5x5크기
		
		int n =1;  //배열에 채워질 숫자
		
		for(int i=0; i<list.length; i++ ) {
			
			if (i%2 == 0) {   //짝수일 경우 (0,2,4)
				for (int j=0; j<list[i].length; j++) {  //순서대로 
					list[i][j] = n; 
					n++;
				}
			} else {
				for (int j =list[i].length-1; j>=0; j--) {  //홀수일 경우 역순으로 (1,3)
					list[i][j] = n;
					n++;
				}
			}
		}
		
		printArray(list);
			
		
	}

	private static void printArray(int[][] list) {
		
		for (int i=0; i<5; i++) {
			   for(int j=0; j<5; j++) {
			      System.out.printf("%5d", list[i][j]);
			   }
			   System.out.println();
			}
		
	}

}
