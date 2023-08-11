package com.test.java;

public class Ex14_Casting {

	
	public static void main(String[] args) {
		
		// Ex14_Casting.JAVA
		
		// 정수형 리터럴은 int이다.
		// 실수형 리터럴은 double이다.
		
		
		//byte (작은형1byte) => int (큰형 4)
		byte b1 = 10;   ///서비스 문법 문법에 맞지않지만 암시적 형변환
		
		//short (작은형 2) => int (큰형4)
		short s1 = 10;
		
		//int = int
		int n1 =10;
		
		//long(큰형8) => int (작은형 4)
		//(long)10; - (long)이 생략되어있음
		long l1 = 10;
		
		
	    //float = double
		//작은형 (4) = 큰형(8)
		//명시적 형변환을 대신해서 뒤에 F가 붙음
		float f1 = 3.14F;
				
		double f2 = 3.14D;
		
		
		
		
		
		//--------------------------
		
		
		// 정수를 실수로 바꿈
		
		int n2 = 100; //원본 4byte
		float n3;     //복사본 4byte 
		
		//형변환
		//float = int
		//4byte = 4byte
		//암시적 형변환 -안전 (왼쪽이크고 오른쪽이 작다)
		n3 = n2;
		
		System.out.println(n3);
		
		
		int n4;           //복사본
		float n5 = 100;  //원본
		
		
		//형변환
		//int = float
		//4byte = 4byte
		//명시적 형변환이다 앞에 (int)  / (오른쪽이 크고 왼쪽이 더 작다)
		n4 =(int)n5;
		
		System.out.println(n4);
		
		
		/* * 정수와 실수간의 크기 비교는 단순하게 byte로 하는것이 아니라
		 	실제 표현 가능한 숫자의 범위로 비교해야한다
			
			int(4) < float(4)
			long(8) < float(4)
		 	
		 	-크기정리
		 	byte(1) < short(2) < int(4) < long (8) <<< float(4) < double(8)
		 	
		 	
		 	*/
		
		//char - 겉보기는 문자, 속으론 숫자 - 프로그램입장에서는 숫자 취급을 한다
		
		char m1;  //2byte
		
		short m2; //2byte
		
		
		m1 = '가';  //44035
		
		//형변환
		//short = char
		// 2byte = 2byte
		m2 = (short)m1;
		
		System.out.println(m2);
		
		
		
		char m3;
		short m4;
		
		m4 = 65;
		
		//형변환
		//char = short
		//2byte = 2byte
		m3 = (char)m4;
		
		System.out.println(m3);
		//char short 어긋나는 부분이 많아서 오류가 많음
		
		
		
		
		int m5;
		char m6;
		
		m5 = 44032;
		
		System.out.println((char)m5);
		
		//반대로
		
		m6 = '가';
		
		System.out.println((int)m6);
		
		
		
		// *** 값형끼리 형변환  (string이없음)
		// *** 값형과 참조형끼리는 형변환이 절대 불가능
		// *** boolean 형변환 불가능
		// 정수 -> 정수
		// 실수 -> 실수
		// 정수 -> 실수
		// 실수 -> 정수
		// 문자 -> 정수
		// 정수 -> 문자
		
		
		/*
		 값형 <-(형변환o)-> 값형
		 값형 <-(형변환x)-> 참조형
		 */
		
		//참조형을 값형으로 별도의 수단을 통해서 가능하기는 하다
		String a1 = "100";
		int a2;
		
		//"100" -> 100 string을 int로 바꾸려고함
		
		a2 = Integer.parseInt(a1); // 바꿀수는 있지만 형변환이라고 부르지 않는다.
		
		System.out.println(a2);
		
		
		//100 -> "100" 값형을 문자형으로 변환
		
		String a3;
		int a4;
		
		a4 = 100; //원본
		
		//  String.valueOf(값형 데이터) - 잘 안쓴다. 
		//왜냐면 a3 = a4 + "";으로 많이 쓰기 때문에 100 + "" => "100" + "" => "100"
		a3 = String.valueOf(a4); // 100 > "100"
		
		
		
		
		
		
		
	}
}






