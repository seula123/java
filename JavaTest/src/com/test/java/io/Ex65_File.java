package com.test.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex65_File {
	
	public static final String FILE = "C:\\class\\code\\java\\file\\list.txt";
	public static void main(String[] args) {
		
		/*
		 
		 파일 입출력
		 -응용 프로그램 <- 데이터 -> 저장장치(*.txt)
		 
		 저장장치
		 - 데이터1,0으로 저장
		 - 데이터 자료형 존재x > 모두 다 문자
		 
		 인코딩 Encoding
		 - 문자코드 (자바 데이터)를 부호화(1,0) 시키는 작업
		 - 자바 프로그램("홍길동")을 텍스트 파일에 저장하려고함 이때(100100100110110)규칙에따라 바꿔야함
		 
		 디코딩 Decoding
		 - 부호화된 데이터를 문자코드로 변환하는 작업
		 - 텍스트 파일 (100100100110110) > 자바프뢰그램("홍길동")
		 
		 인코딩/디코딩 규칙
		 1. ISO -8859-1
		 2. EUC - KR
		 3. ANSI
		 4. MS949(CP949)
		 5. UTF-8
		 6. UTF-16	
		 7. ASCII
		 
		 ANSI (ISO-8859-1, EUC-KR, MS949)
		 1.영어(숫자,특수문자,서유럽): 1byte
		 2.한글(한자,일본어 등): 2byte
		 
		 UTF-8 (Unicode) ******무조건 이거를 사용 >국제표준
		 1. 영어:1byte
	 2. 한글:3byte
		 
		 UTF-16(Unicode)
		 1. 영어:2byte
		 2. 한글:2byte

		 
		 
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		m8();
		
	}

	   private static void m8() {
		try {
			//C:\class\code\java\JavaTest\src\com\test\java\Ex32_Array.java
			
			BufferedReader reader
			= new BufferedReader (new FileReader("C:\\class\\code\\java\\JavaTest\\src\\com\\test\\java\\Ex32_Array.java"));
			String line = null;
			int n = 1;
			while((line = reader.readLine())!= null) {
				
				System.out.printf("%3d: %s\n",n,line);
				n++;
			}
			
			reader.close();
		} catch (Exception e) {
			System.out.println("at Ex65_File.m8");
	         e.printStackTrace();
			
		}
		
		
		
	}

	private static void m7() {
		   
		   //메모장 쓰기
		   
		   try {
			   
			   Scanner scan = new Scanner(System.in);
			   
			   System.out.print("저장할 파일명: ");
			   String filename = scan.nextLine();
			   
			   BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file\\"+filename+".txt"));
			   
			   boolean loop = true;
			   
			   while(loop) {
				   
				   System.out.println("입력: ");
				   String line = scan.nextLine();
				   
				   if(line.equals("exit")){
				   		break;
				   }
				   	 
				   
				   writer.write(line); //한줄 입력(scan) > 한줄쓰기(writer)
				   writer.write("\r\n");
				   
			   }
			   
			   
			   writer.close();
			   System.out.println("입력 종료");
			   
			   
			   
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m7");
	         e.printStackTrace();
		}
		
	}

	private static void m6() {
	
		   try {
		         
		         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		         
		         BufferedReader reader2 = new BufferedReader(new FileReader("C:\\class\\code\\java\\file\\memo.txt"));
		         
		         
//		         String line = reader2.readLine();
//		         System.out.println(line);
	
		         String line = null;
		         while((line = reader2.readLine())!=null) {
		        	 System.out.println(line);
		         }
		         
		         reader.close();
		         
		         
		      } catch (Exception e) {
		         System.out.println("at Ex65_File.m6");
		         e.printStackTrace();
		      }
		
	}

	private static void m5() {
		   //쓰기 
		   //-FileOutputStream >FileWriter > BufferdWriter
		   
		   //읽기
		   //-FileOutputStream >FileReader >BufferdReader
		   
		   try {
			   
			   BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file\\member.txt"));
			   
			   writer.write("하나");
			   writer.write('A');
			   writer.write("\r\n");
			   writer.write("둘");
			   writer.newLine();
			   writer.write("셋");
			   
			   writer.close();
			   
			   System.out.println("종료");
	
			   
			   
		} catch (Exception e) {
			System.out.println("at Ex65_File.m5");
			e.printStackTrace();
		}

		
	}

	private static void m4() {
		// 읽기
		   try {
			   
		FileReader reader = new FileReader("C:\\class\\code\\java\\file\\member.txt");
			   
//		int code = reader.read();
//		
//		System.out.println((char)code);
		
		int code = -1;
		
		while((code = reader.read())!=-1) {
			System.out.print((char)code);
		}
		
		reader.close();
		
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m4");
			e.printStackTrace();
		}
		
	}

	private static void m3() {

		   //쓰기 
		   //-FileOutputStream >FileWriter
		   
		   //읽기
		   //-FileOutputStream >FileReader
		   
		   try {
			   FileWriter writer = new FileWriter("C:\\class\\code\\java\\file\\member.txt");
			   
			   //writer.write(65);
			   //writer.write("ABC");
			   writer.write("홍길동");
			   //닫기
			   writer.close();
			   //다시열기
			   writer = new FileWriter("C:\\class\\code\\java\\file\\member.txt");
			   writer.write("아무개");
			   writer.close();
			   
			   System.out.println("종료");
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m3");
			e.printStackTrace();
		}
	}
	   
	   
	   

	private static void m2() {
		try {
			
			//파일 읽기
			// - FileOutputStream
			// - FileInputStream
			
			//읽기 스트림 객체
			FileInputStream stream = new FileInputStream(Ex65_File.FILE);
			
			int code = -1;
			
			while ((code = stream.read()) !=-1) {
			System.out.println((char)code);
			}
			System.out.println();

			stream.close();
			
			
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m2");
		}
		
	}

	private static void m1() {
		      
		      //파일 쓰기
		      //- 스트림 객체
		      
		      //쓰기 스트림 객체
		   	  //1. 생성모드. Create mode > 덮어쓰기 **훨씬 더 자주쓴다
		      //-기본값
		   	  // a. 파일이 존재하지 않으면 자동으로 생성한다
		      // b. 파일이 존재하면 항상 덮어쓰기를 한다.
		   
		   	  //2. 추가 모드,Append mode > 기존내용에 이어쓰기
		   	  // a. 파일이 존재하지 않으면 자동으로 생성한다.
		      // b. 파일이 존재하면 항상 이어쓰기를 한다.
		   
		   
		      try {
		         File file = new File(Ex65_File.FILE);
		         
		         //스트림 객체 생성 > 스트림 열기'
		         //-바이트 단위 쓰기(1byte)
		         FileOutputStream stream = new FileOutputStream(file,true);
		         
		         stream.write('홍');  
		         stream.write('길');
		         stream.write('동');
		         
		         String txt = "Hello~ Hong!!";
		         
//		         for(int i=0; i<txt.length(); i++) {
//		        	 stream.write(txt.charAt(i));
//		         }
		         
		         
		       
		         
		         //스트림 닫기
		         //-저장이 안된다.
		         //-잠긴 파일이 된다.
		         stream.close();
		         
		         System.out.println("종료");
		         
		         
		      } catch (Exception e) {
		         
		         System.out.println("at Ex65_File.m1");
		         e.printStackTrace();
		      }
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
