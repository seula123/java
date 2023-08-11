package com.test.question;

public class Q074 {
	
	public static void main(String[] args) {
		int[][]	nums= new int[5][5];
		int n = 1;
		int s = nums.length/2;//배열의 중앙에서 부터 시작하기 위한 초기값
		for(int  i=0;i<nums.length; i++) {
			if (s >= 0) { //s의 값이 배열을 벗어나지 않았을때
				for (int j=s; j<nums.length-s; j++) {
					nums[i][j] = n;
					n++;
				}
			} else { //s의 값이 배열이 벗어난 경우
				for (int j=(s*-1); j<nums[0].length-(s*-1); j++) {
					nums[i][j] = n;
					n++;
				}
			}
			s--;//좌우로 한칸씩 증가 or 감소 시키기 위한 식
		}
		
		//출력
		for(int  i=0;i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	}
	
}
