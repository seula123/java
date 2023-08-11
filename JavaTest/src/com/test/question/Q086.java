package com.test.question;

import java.util.Scanner;

public class Q086 {

	public static void main(String[] args) {
		
		String num = "";
		String result = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자: ");
		num = scan.nextLine();
		
		while(num.length()>=3) { //입력받은 숫자가 3자리 이상일 때까지 반복문을 실행
			result = ","+ num.substring(num.length()-3,num.length())+result;
			//입력받은 숫자에서 마지막 3자리를 추출하여 result 변수의 앞에 콤마를 추가
					num = num.substring(0, num.length()-3);
					//변수의 마지막 3자리를 제외한 나머지 부분을 다시 num 변수에 할당
		}
		
		System.out.println("결과: "+num + result);
		
		scan.close();
	}
}
