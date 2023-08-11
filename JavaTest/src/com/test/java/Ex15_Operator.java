package com.test.java;

public class Ex15_Operator {
	
	
	
	public static void main(String[] args) {
		
		
		//Ex15_Operator.java
		
		/*
		 
		 
		 연산자, Operator
		 - 수학 연산자의 대부분이 프로그래밍 연산자로 그대로 사용한다
		 - 피연산자를 대상으로 미리 정해진 행동을 하는것을 연산이라고한다.그 행동을 한 후 행동(연산)의 결과를 반환하는 요소
		 - 주로 기호를 많이 사용한다 + 단어도 많이 사용
		 
		 
		 1. 문장,Statement
		 2. 표현식, Expression
		 3. 연산자, Operator
		 4. 피연산자, Operand
		 5. 연산자 우선 순위
		 6. 연산자 연산 방향
		 
		 문장 Statement
		 - 1개 이상의 표현식이 모여서 문장을 만든다.
		 - int sum = 10 +20;
		 
		 표현식, Expression
		 - 문장의 구성하는 최소단위 > 하나의 완성된 문장을 만들 수 있는 최소 표현
		 - int sum (변수하나를 선언하는것)
		 - 10+20
		 - sum = 30
		 
		 연산자, Operator
		 - +
		 - =
		 
		 피연산자, Operand
		 - +: 10, 20
		 - =: sum, 30
		 
		 
		 연산자 우선 순위
		 -하나의 문장 안에 속해있는 연산자들 중에 누가 먼저 실행하는지에 대한 규칙
		 - 1+2*3
		 
		 연산자 연산 방향
		 -하나의 문장에 속해있는 연산자들 중에서 우선순위가 동일하면 누구부터 실행해야하는지에 대한 규칙
		 - 대부분: 왼쪽에서 오른쪽으로 
		 - 1+2+3
		 
		 
		 
		 연산자 종류
		 
		 1. 행동(목적)
		 	a. 산술 연산자
		 	b. 비교 연산자
		 	c. 논리 연산자
		 	d. 대입 연산자
		 	e. 증감 연산자
		 	f. 조건 연산자
		 	g. 비트 연산자
		 	
		 2. 용법(피연산자 개수)
		 	a. 1항 연산자
		 	b. 2항 연산자
		 	c. 3항 연산자
		 
		 
		 산술 연산자
		 - +, -, *, / %(mod,나머지)
		 - 2항 연산자
		 - 피연산자를 숫자형을 가진다. (정수,실수)
		 
		 
		 */
		
		int a = 10;
		int b = 3;
		
		System.out.printf("%d + %d = %d\n", a,b,a+b); //10 + 3 = 13
		System.out.printf("%d - %d = %d\n", a,b,a-b); //10 - 3 = 7
		System.out.printf("%d * %d = %d\n", a,b,a*b); //10 * 3 = 30
		System.out.printf("%d / %d = %d\n", a,b,a/b); //10 / 3 = 3 (몫)
		System.out.printf("%d %% %d = %d\n", a,b,a%b); //10 % 3 = 1 (나머지)
		
		
		
		
		
		double c = 10;
		double d = 3;
		
		System.out.printf("%f / %f = %f\n",c,d,c/d);
		System.out.println();
		
		System.out.println(10 / 3);     //정수/정수 = 정 3
		System.out.println(10.0 / 3.0); //실수/실수 = 실 3.33333333333
		System.out.println(10.0 / 3);   //실수/정수 = 실 3.33333333333
		System.out.println(10 / 3.0);   //정수/실수 = 실 3.33333333333
		
//		System.out.println(100/0);
		System.out.println(-100/0.0);
		
		
		//**** 모든 산술 연산자의 결과 자료형은
//		두피연산자의 자료형 중 더 범위가 큰 자료형으로 반환된다.
		System.out.println(10/3);   // int/int = int
		System.out.println(10.0/3); // double/int = double
		System.out.println(10/3.0); // int/double = double
		System.out.println(10.0/3.0); // double/double = double
	    System.out.println();
		
		int e = 1000000000;
		int f = 2000000000;
		
		System.out.println( e + f ); //30억이 아니라 -1294967296 이 나왔다. int 30억이 되므로 오버플로우가 됨 내책임큰일난다고하심ㅜㅜ
		System.out.println((long) e + f );  //long으로 바꿈
		
		e = 300000;
		f = 500000;
		
		System.out.println(e*f);   //-323855360
		System.out.println(e*(long)f);  // e나 f 둘 중 하나에만 해도됨
		
		
		e=-2100000000;
		f=100000000;
		
		System.out.println( e - f); // 2094967296 (나누기나 나머지는 오버플로우가 발생할일이 없다)
		
		
		byte b1 =10;
		byte b2 =20;
		byte b3;
		/*
		 예외)
		 b3 = b1 +b2;
		 byte + byte = byte 인데 Type mismatch: cannot convert from int to byte 오류가남
		 byte + byte = byte (x)
		 byte + byte = int  (o)
		 sort + short = short (x)
		 sort + short = int (o)
		*/
		
		//byte로 명시적 형변환을 해줘야함
		b3 = (byte)(b1 + b2);
		
		// 위와 같은 이유로 정수 사용할때 byte,short를 거의 사용 안하고 int를 사용함
		
		System.out.println();  //공간
		System.out.println(10 % 3);
		System.out.println(10 % 4);
		System.out.println(10 % 5);
		System.out.println(10 % 10);
		System.out.println(10 % 11);
		
		/*
		 나머지 연산자 특징
		 -패턴 만들 때 잘쓴다
		 패턴: 달력,
		 */
		
		
		
		
		
	}

}
