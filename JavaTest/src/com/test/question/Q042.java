package com.test.question;

import java.util.Scanner;

public class Q042 {
	
	public static void main(String[] args) {

	      int result = 0;
	      
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("오늘(년): ");
	      int year = scan.nextInt();
	      System.out.print("오늘(월): ");
	      int month = scan.nextInt();
	      System.out.print("오늘(일): ");
	      int date = scan.nextInt();
	      
	      result = checkYear(year) + checkMonth(month) + date;
	      
	      System.out.printf("%d년 %d월 %d일은 %,d일째 되는 날이고 %s입니다.\n", year, month, date, result, week(result));
	      
	   }
	   
	   public static int checkYear(int year) {
	      year -= 1;
	      int leap = 0;
	      int result = 0;
	      
	      for (int i = 1; i <= year; i++) {
	         if (i % 4 == 0) {
	            if (i % 100 != 0) {
	               leap++;
	            }
	            else {
	               if(i % 400 == 0) {
	                  leap++;
	               }
	            }
	         }
	      }
	      
	      result = year * 365 + leap;
	      
	      return result;
	   }
	   
	   public static int checkMonth(int month) {
	      int result = 0;
	      
	      for (int i = 1; i < month; i++) {
	         switch(i) {
	            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	               result += 31;
	               break;
	            case 4: case 6: case 9: case 11:
	               result += 30;
	               break;
	            case 2:
	               result += 28;
	         }
	      }
	      
	      return result;
	   }
	   
	   public static String week(int date) {
	      String result = "";
	      
	      switch(date % 7) {
	         case 0:
	            result = "일요일";
	            break;
	         case 1:
	            result = "월요일";
	            break;
	         case 2:
	            result = "화요일";
	            break;
	         case 3:
	            result = "수요일";
	            break;
	         case 4:
	            result = "목요일";
	            break;
	         case 5:
	            result = "금요일";
	            break;
	         default:
	            result = "토요일";
	      }
	      
	      return result;

	}

}
