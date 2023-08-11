package com.test.question;

import java.io.File;

public class Q119 {
	
	public static void main(String[] args) {
		
		//파일을 폴더로 분류 이동 하시오
		
		File dir = new File("C:\\Users\\sla62\\OneDrive\\문서\\카카오톡 받은 파일\\파일_디렉토리_문제\\직원");
	
		File[] list = dir.listFiles();
		
		for(File f : list) {
			
			//아무개_2014_17.txt
			//아무개_2016_67.txt
			
			String[] temp = f.getName().split("_");
			
			String name = temp[0];
			String year = temp[1];
			
			File nameDir = new File(dir.getAbsolutePath()+"\\"+name);
			nameDir.mkdir();
			
			File yearDir = new File(dir.getAbsolutePath()+"\\"+name+"\\"+year);
			
			yearDir.mkdir();
			
			File dest = new File(dir.getAbsolutePath() + "\\" + name + "\\" + year + f.getName()); //이동한 결과
	         
	         f.renameTo(dest);
			
			
			
		}//for
	}//main

}//class
