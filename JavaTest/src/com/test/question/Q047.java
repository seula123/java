package com.test.question;

import java.util.Scanner;

public class Q047 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		for (;;) {
			System.out.println("=================");
			System.out.println("      자판기");
			System.out.println("=================");
			System.out.println("1. 콜라 : 700원");
			System.out.println("2. 사이다 : 600원");
			System.out.println("3. 비타500 : 500원");
			System.out.println("=================");
			System.out.printf("금액 투입(원) : ");
			int inputMoney = scan.nextInt();
			System.out.println("=================");
			System.out.printf("음료 선택(번호) : ");
			int inputChoice = scan.nextInt();
			String juice = "";
			int price = 0;
			if (inputChoice == 1 && inputMoney >= 700) {
				juice = "콜라";
				price = 700;
			}else if(inputChoice == 2 && inputMoney >= 600) {
				juice = "사이다";
				price = 600;
			}else if(inputChoice == 3 && inputMoney >= 500){
				juice = "비타500";
				price = 500;
			}else {
				System.out.printf("잘못된 음료를 선택하셨거나 잔액이 부족합니다.\n");
			}
			if (juice != "") {
				System.out.printf("+%s를 제공합니다.\n", juice);
				System.out.printf("+잔돈 %d원을 제공합니다.\n",inputMoney - price);
			}
			
			System.out.printf("계속하시려면 엔터를 입력하세요.");
			scan.nextLine();
			String inputEnd = scan.nextLine();

			if (inputEnd ==  "\r\n") {
				break;
			} else {
				continue;
			}
		}
		
	}

}
