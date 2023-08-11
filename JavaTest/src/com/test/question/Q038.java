package com.test.question;

import java.util.Scanner;

public class Q038 {
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력 횟수: ");
		
		int count = scan.nextInt();
		
		
		int sum = 0;
		
		int oddsum =0; 
		
		int odd = 0;
		
		int evensum = 0;
		
		int even = 0; 
		
		for (int i=1; i<=count; i++ ) {
			
			System.out.println("숫자: ");
			
			int num =scan.nextInt();
			
			if (num %2 ==0) { even++; evensum += num;
			} else {
				odd++;
				oddsum +=num;
			}
		}

		System.out.printf("짝수 %,d개의 합: %,d\n",even,evensum);
		System.out.printf("홀수 %,d개의 합: %,d\n",odd,oddsum);
		
	
	}

}
