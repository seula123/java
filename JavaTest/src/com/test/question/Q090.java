package com.test.question;

import java.util.Scanner;

public class Q090 {

	public static void main(String[] args) {
		
		String txt = "";
		int sum = 0;
		int n = 0;
		char c = '\0';
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력: ");
		txt = scan.nextLine();
		
		for(int i =0; i<txt.length(); i++) {
			c = txt.charAt(i);
		//문자 '0'부터 '9'까지의 아스키 코드 값은 연속적으로 48부터 57까지입니다.
			//따라서 c에서 48을 빼면 해당 문자에 해당하는 숫자 값을 얻을 수 있다.
			//이 값을 sum에 더해 숫자들의 합을 계산
			if(c>='0'&&c<='9') {
				sum += c-48;
			}
		}
		
		System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다.\n",sum);
	}
}
