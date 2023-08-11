package com.test.question;

import java.util.Scanner;

public class Q083 {
	
		public static void main(String[] args) {
			
		    Scanner scan = new Scanner(System.in);
		      
		      int mp3 = 0, jpg = 0, java = 0, hwp = 0, doc = 0;
		      String file = "";
		      int index = -1; // -1을 설정한 이유는 파일명에 .이 없을 경우를 고려하기 위해
		      
		      for (int i=0; i<10; i++) {
		      
		      System.out.print("파일명: ");
		      file = scan.nextLine();
		 
		      index = file.lastIndexOf(".");//마지막으로 등장하는 .의 인덱스를 찾아서 index 변수에 저장
		      
		      if(file.substring(index).equals(".mp3")) {
		    	  mp3++;  //file.substring(index): file 문자열에서 index 위치부터 끝까지의 부분 문자열을 추출
		      } else if (file.substring(index).equals(".jpg")) {
		    	  jpg++;
		      }else if (file.substring(index).equals(".java")) {
		    	  java++;
		      }else if (file.substring(index).equals(".hwp")) {
		    	  hwp++;
		      }else if (file.substring(index).equals(".doc")) {
		    	  doc++;
		      }
		    
		    }//for
		      
		      System.out.printf("mp3: %d개\n",mp3);
		      System.out.printf("jpg: %d개\n",jpg);
		      System.out.printf("java: %d개\n",java);
		      System.out.printf("hwp: %d개\n",hwp);
		      System.out.printf("doc: %d개\n",doc);
		      
		      
		    
		}

}
