package com.test.question;

import java.io.File;

public class Q117 {

	public static void main(String[] args) {
		
	      //내용있는 폴더 삭제하기
	      File dir = new File("C:\\Users\\user\\Downloads\\파일_디렉토리_문제\\폴더 삭제\\delete");
	      
	      //탐색
	      delete(dir);
	      
	      System.out.println("종료");
	      
	   }
	   
	   //재귀 메소드
	   private static void delete(File dir) {
	      
	      File[] list = dir.listFiles();
	      
	      //파일인지 폴더인지 확인
	      for (File f : list) {
	         if(f.isFile()) { //파일임?
	            f.delete(); //폴더 안에 있는 모든 파일을 지움
	         }
	      }
	      
	      
	      for (File d : list) {
	         if (d.isDirectory()) { //폴더임?
	            delete(d);
	         }
	      }
	      
	      dir.delete(); //*** 빈 폴더임
	     
	      
	      
	}
}
