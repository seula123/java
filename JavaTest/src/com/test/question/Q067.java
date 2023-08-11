package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q067 {
	
	public static void main(String[] args) {
		
		/*조건..
		 배열 길이: 10
		 마지막 요소는 우측으로 옮겨질 공간이 없으면 삭제된다.
		 
		 입력..
		 삽입 위치: 2 
		 값: 100 
		 
		  */
		
		Scanner scan = new Scanner(System.in);
		
		int[] nums = {5,6,1,3,2,8,7,4,10,9};
		
		System.out.println("삽입 위치: ");
		int place = scan.nextInt();
		
		System.out.println("값: ");
		int input = scan.nextInt();
		
		System.out.println(Arrays.toString(nums));
		
			for (int i=nums.length-1; i>place; i--) { //뒤에서부터
				nums[i] = nums[i-1];  //한 칸 앞에 숫자를 뒤에 복사
				
			}
	
		nums[place] = input; ///삽입 위치에 입력 값 넣기
		System.out.println(Arrays.toString(nums)); //문자열
	}

}
