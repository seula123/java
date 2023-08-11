package com.test.question;

import java.util.Scanner;

public class Q082 {
	
	public static void main(String[] args) {
		
		//숫자를 입력받아 각 자릿수의 수의 합을 구하시오.

		int sum = 0;
		String result = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자: ");
		
		String num = scan.nextLine();
		
		for(int i=0; i<num.length(); i++) {
			sum += Integer.parseInt(num.substring(i, i+1)); //Integer.parseInt = 정수변환, substring사용해서 i번째 숫자 추출
			result += num.substring(i,i+1); // substring사용해서 i번째 숫자 추출
			
			if(i<num.length()-1) {
				result += "+";  //처리 중인 숫자가 마지막 숫자가 아닌 경우, result 문자열에 + 기호를 추가
			}//if
		}//for
		
		System.out.printf("%s = %d \n",result,sum);
	}

}
