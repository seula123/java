package com.test.java;

import java.util.Scanner;

public class Ex17_Operator {
	
	
	public static void main(String[] args) {
		
		//x17_Operator.java
		
		/*
		 
		 논리 연산자
		 - &&(and), ||(or), !(not), ^(xor)
		 - 2항 연산자 (&&, ||, ^)
		 - 1항 연산자 (!)
		 - 피연산자를 대상으로 정해진 규칙에 따라 연산 결과를 반환해준다
		 - 피연산자의 자료형이 boolean이다.
		 - 연산의 결과가 boolean이다.
		 
		 
		 소개팅 > 남자 소개
		 1. 키 180cm 이상
		 2. 잘생길 것
		 
		 
		 
		 논리곱
		 A && B = ?
		 
		 T && T = T
		 T && F = F
		 F && T = F
		 F && F = F
		 
		 논리합
		 A || B = ?
		 
		 T || T = T
		 T || F = T
		 F || T = F
		 F || F = F
		 
		
		 부정  > 논리를 반대로 뒤집기
		 !A = ?
		 
		 !T = F
		 !F = T

		 
		 베타적 논리합
		 A ^ B = ?
		 
		 T ^ T = F
		 T ^ F = T
		 F ^ T = T
		 F ^ F = F
		 
		 
		 */
		
		System.out.println(true && true);  //쓸 일 없다
		
		int age = 20;
		
		System.out.println(age > 19 && age < 60);   //(age > 19)로 해도되고 괄호없이 age > 19로 해도된다
		
		
		
		
		
		/*
		 
		 대입 연산자,할당 연산자 
		 - =
		 - +=, -=, *=, /=, %= : 복합 대입 연산자
		 - LValue(변수)  =  Rvalue(상수,변수)
		 - LValue와 RValue의 자료형은 반드시 동일해야한다 (형변환을 해서)
		 - 대입 연산자는 모든 연산자들을 통틀어서 우선순위가 가장 낮다

		 
		 연산자 우선 순위
		 - 산술(*,/  +,-) > 비교 > 논리 > 대입
		 
		 
		 연산자 연산 방향
		 - 대입,증감 : 오른쪽부터 왼쪽
		 - 나머지 : 왼쪽에서 오른쪽
		 
		 

		 */
		
		int sum = 10 + 20 * 3;
		
		System.out.println(sum);
		
		
		
		int a1 = 10;
		int a2;
		int a3;
		
		a3=a2=a1;    //오른쪽에서 왼쪽
		
		
		
		//복합 대입 연산자
		
		int n = 10;
		
		//요구사항[ 기존 n에 1을 추가하기  **'누적'이라고 하고 자주 씀
		
		n= n + 1;
		
		System.out.println(n);  //11
		
		
		n += 1;   // n = n + 1 이랑 똑같은 내용 (선호도 문제)
		System.out.println(n);
		
		n+= 5;
		System.out.println(n);
		
		
		n = n - 2;
		System.out.println(n);
		
		n -= 2;   //n = n - 2;
		System.out.println(n);
		
		n = n*2;
		System.out.println(n);  
		
		n*= 2;   // n = n*2;
		System.out.println(n);
		
		n = n/5;
		System.out.println(n);
		
		n /= 5; //n = n/5;
		System.out.println(n);
		
		
		
		n = 10;
		n = n%3;
		System.out.println(n);
		
		n %= 3;    //n = n%3;
		System.out.println(n);
		
		
		
		
		/*증감 연산자
		- ++(증가) --(감소)
		- 1항 연산자
		- 피연산자는 숫자형을 가진다.
		- 누적 연산을 한다. 기존의 값을 1을 더하거나, 1을 뺀다 (2,3씩은 못뺌 무조건 1
		
		
		****** 연산자의 위치를 바꿀 수 있다 (연산자 우선 순위가 달라진다)
		1. ++n: 전위 배치(전치)  - 연산자 우선순위가 가장 높다. ()빼고
		2. n++: 후위 배치(후치)  - 연산자 우선순위가 가장 낮다. 대입 연산자 보다 밑으로 내려간다.
		=>** 증감연산자를 다른 연산자랑 섞어서 쓰지말기! 따로 빼서 쓰기
		*/
		
		n = 10;
		
		
		
		n = n+1; 
		n +=1;
		++n;      //3문장이 다 똑같다
		
		System.out.println(n);   //13
		
		
		n = n-1;
		n -= 1;
		--n;
		
		System.out.println(n);
		
		
		n = 10;
		
		//전치
		++n;
		System.out.println(n);
		
		//후치
		n++;
		
		System.out.println(n);
		
		
		n = 10;
		int result = 0;
		
		//result = 10 + ++n; (- +와 ++가 헷갈리기때문에 따로 빼서 두줄로 만들어주는게 좋음)
		
		++n;
		
		result = 10 +n;
		
		System.out.println(result);
		
		
		n = 10;
		result = 0;
		
		//result = 10 + n++;    (두 줄로 분리해서 가독성이 높아지고, n++;일 경우는 연산자가 하나(++)기 때문에 우선순위가 없어서 헷갈리지가 않는다)
		
		result = 10 +n;
		
		n++;
		
		System.out.println(result);  //20
		System.out.println(n);  //11
		
		
		int o = 10;
		
		System.out.println(--o-o--);
		
		
		/*
		  조건 연산자
		  - ?:
		  - A ? B : C
		  - 3항 연산자
		  - B,C: 상수,변수  =데이터
		  - A 조건이 참이면 B를 반환, 조건이 거짓이면 C를 반환
		 
		 
		 */
		
		boolean flag = false;
		
		String m1 = "참";
		String m2 = "거짓";
		
		String result2 = flag ? m1 : m2;
		
		System.out.println(result2);
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("나이: ");
		
		age = scan.nextInt();
		
		//19세 이상 60세 미만이면 통과 or 거절   ()묶어도 되고 안해도됨 ex(age >19 && age <60)
		
		result2 = (age >19 && age <60) ? "통과" : "거절";
		
		System.out.printf("입력한 나이 %d세는 %s입니다.\n"
				,age,result2);
		
		//3항 연산자 - if문 사용  /무조건 해야하는 연산자
		
		//비트연산자 (안필요함 그냥 쌤이 안하려다가 알려주심....)
		
		int a = 10;
		int b = 3;
		
		System.out.println(a & b);   //2
		System.out.println(a | b);    //11
		
		
		
		
		
		
		
		
	}//main

}
