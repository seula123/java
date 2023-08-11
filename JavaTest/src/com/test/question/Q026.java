package com.test.question;

import java.util.Scanner;

public class Q026 {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수: ");
		
		int score= scan.nextInt();
		
		String grade = "";
		
		if (score>=0 && score<=100) {
		
		if (score>=90) {
			grade = "A";
		}  else if (score>=80) {
			grade = "B";
		}  else if (score>70) {
			grade = "C";
		}  else if (score>=60) {
			grade = "D";
		} else {grade = "F";}
		
		
		System.out.printf("입력한 %d점은 성적 %s입니다",score,grade);
		
		}
		else {System.out.println("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.");
		
			}
		}
	}

