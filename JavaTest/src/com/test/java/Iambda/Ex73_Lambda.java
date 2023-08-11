package com.test.java.Iambda;

import java.util.IntSummaryStatistics;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Ex73_Lambda {
	
	public static void main(String[] args) {
		
		/*
			람다식 : 익명 객체의 (구현된) 추상 메소드를 인터페이스 변수에 저장
			람다식은 반드시 인터페이스가 필요하다!!!
			
			함수형 인터페이스, Functional Interface
			- 람다식을 사용하기 위한 자격
			- 다른 용도로 사용 안함
			- 표준 API 함수형 인터페이스 > JDK 제공
			- 사용자 정의 함수형 인터페이스 > 개발자 선언
			
			표준 API 함수형 인터페이스
			1. Consumer : 매개변수 O, 반환값 X
				- Consumer<T>
				- BiConsumer<T>
				- IntConsumer<T>
				- ...
			
			2. Supplier : 매개변수 X, 반환값 O
				- Supplier<T>
				- ...
			
			3. Function : 매개변수 O, 반환값 O
				- Function<T,R>
				- BiFunction<T,U,R>
				- ...
				
			4. Operator : 매개변수 O, 반환값 O
				- BinaryOperator<T>
				- Function 하위셋
				- ...
			
			5. Predicate : 매개변수 O, 반환값 O
				- Predicate<T>
				- Function 하위셋
				- ...
		*/

//		Test t1 = () -> System.out.println("aaa");
//		t1.aaa();
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		m6();
		
		
	}//main

	private static void m6() {
		
		//표준 API 함수형 인터페이스 > 정적/디폴트 메소드
		//- 람다 객체들의 연산자 역할

		Student s1 = new Student("홍길동", 100, 90, 80);
		
		//업무 1. 학생의 총점을 출력
		Consumer<Student> c1 = s -> System.out.println("총점: " + s.getTotal());
		c1.accept(s1);
		
		//업무 2. 학생의 이름을 출력
		Consumer<Student> c2 = s -> System.out.println("이름: " + s.getName());
		c2.accept(s1);
		
		//업무 3. 업무1과 업무2를 동시에 실행요구
		
		//업무 4. 학생을 받아서 평균 출력
		Consumer<Student> c4 = s -> System.out.println("평균: " + s.getTotal() / 3.0);
		
//		c1.accept(s1);
//		c2.accept(s1);
		
		test(s1, c1, c2);
		
		//실제로 연산한 건 아니지만 consumer 2개를 test 하나로 합침(c1 + c2 = test)
	
		//메소드로 묶지않고 쉽게 할 수 있는 방법!
//		Consumer<Student> c3 = c1.andThen(c2);
//		c3.accept(s1);
		
		//4번 업무 추가해서 동시 실행 consumer 3개를 test 하나로 합침(c1 + c2 + c4 = test)
		
		//메소드로 묶지않고 쉽게 할 수 있는 방법!
		Consumer<Student> c3 = c1.andThen(c2).andThen(c4);
		c3.accept(s1);
		
		Function<Integer, Boolean> f1 = num -> num > 0;
		System.out.println(f1.apply(10));
		
		Function<Boolean, String> f2 = flag -> flag ? "성공" : "실패";
		System.out.println(f2.apply(true));
		
		//Function = Function + Function
		//f3 = f1 + f2;
		Function<Integer, String> f3 = f1.andThen(f2);
		System.out.println(f3.apply(10)); //양수면 true
		System.out.println(f3.apply(-10)); //음수면 false
		
		Function<Integer, String> f4 = num -> num > 0 ? "참" : "거짓";
		Function<String, Integer> f5 = str -> str.length();
		
		Function<Integer, Integer> f6 = f4.andThen(f5); //f4 + f5
		
		System.out.println(f6.apply(10)); // 1(참) 결과의 글자 길이 반환
		System.out.println(f6.apply(-10)); // 2(거짓) 결과의 글자 길이 반환
		
		Function<Integer, Integer> f7 = f5.compose(f4); //f5 + f4
		System.out.println(f7.apply(10)); // 1(참) 결과의 글자 길이 반환
		System.out.println(f7.apply(-10)); // 2(거짓) 결과의 글자 길이 반환
		
		
		//숫자 하나를 받아서 2의 배수인지 확인
		Predicate<Integer> p1 = num -> num % 2 == 0;
		
		//숫자 하나를 받아서 3의 배수인지 확인
		Predicate<Integer> p2 = num -> num % 3 == 0;
	
		int a = 10;
		System.out.println(p1.test(a));
		System.out.println(p2.test(a));
		
		
		//a가 2와 3의 공배수인지 확인
		System.out.println(p1.test(a) && p2.test(a));
		
		//p1 + p2(p1 and && p2)
		Predicate<Integer> p3 = p1.and(p2);
		System.out.println(p3.test(a));
		
		
		//or 확인
		System.out.println(p1.test(a) || p2.test(a));
		
		//p1 , p2(p1 or || p2)
		Predicate<Integer> p4 = p1.or(p2);
		System.out.println(p4.test(a));
		
		
		//true를 false로 false를 true로 변환
		System.out.println(!p1.test(a));
		
		Predicate<Integer> p5 = p1.negate();
		System.out.println(p5.test(a));
	}

	private static void test(Student s1, Consumer<Student> c1, Consumer<Student> c2) {
		c1.accept(s1);
		c2.accept(s1);
	}

	private static void m5() {
		
		//Predicate
		//- 매개변수를 전달하면 처리 후 반환값을 돌려주는 업무를 구현
		//- 매개변수 O, 반환값 O
		//- testXXX() 추상 메소드 제공
		//- Function 하위셋
		//- 매개변수와 반환값 타입이 같다.
		//- 매개변수를 전달받아 Boolean으로 반환
		
		Function<Integer, Boolean> f1 = num -> num > 0;
		Predicate<Integer>         p1 = num -> num > 0;
		
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-10));

		System.out.println(p1.test(10));
		System.out.println(p1.test(-10));
		
		BiPredicate<Integer, Integer> bp2 = (a, b) -> a > b;
		System.out.println(bp2.test(10, 20));
		System.out.println(bp2.test(20, 10));
	}

	private static void m4() {
		
		//Operator
		//- 매개변수를 전달하면 처리 후 반환값을 돌려주는 업무를 구현
		//- 매개변수 O, 반환값 O
		//- applyXXX() 추상 메소드 제공
		//- Function 하위셋
		//- 매개변수와 반환값 타입이 같다.
		
		//매개변수 2개, 반환 값 1개
		BinaryOperator<Integer> bo1 = (a, b) -> a + b;
		System.out.println(bo1.apply(10, 20));
		
		BiFunction<Integer, Integer, Integer> bf1 = (a, b) -> a + b;
		System.out.println(bf1.apply(10, 20));
		
		//매개변수 1개로 반환 값을 구할 수 있는 경우 사용
		UnaryOperator<Integer> uo1 = num -> num * num;
		System.out.println(uo1.apply(10));
	}

	private static void m3() {
		
		//Function(가장 많이 사용)
		//- 매개변수를 전달하면 처리 후 반환값을 돌려주는 업무를 구현
		//- 매개변수 O, 반환값 O
		//- applyXXX() 추상 메소드 제공
		
		Function<Integer, Boolean> f1 = num -> num > 0;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-10));
		
		Function<String, Integer> f2 = str -> str.length();
		System.out.println(f2.apply("홍길동"));
		System.out.println(f2.apply("안녕하세요"));
		
		Function<Student, Boolean> f3 = s -> {
			return s.getTotal() >= 180 ? true : false;
		};
		
		if (f3.apply(new Student("홍길동", 80, 75, 93))) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	
		//매개변수 2개, 반환 값 1개
		BiFunction<Integer, Integer, Integer> bf1 = (a, b) -> a + b;
		System.out.println(bf1.apply(10, 20));
		
		//매개변수를 double로 받아서 int로 반환
		DoubleToIntFunction f4 = num -> (int)num;
		System.out.println(f4.applyAsInt(3.14));
	}

	private static void m2() {
		
		//Supplier
		//- 매개변수 없이 반환값을 돌려주는 업무를 구현
		//- 매개변수 X, 반환값 O
		//- getXXX() 추상 메소드 제공
		
		Supplier<Integer> s1 = () -> 100;
		System.out.println(s1.get());
		
		Supplier<Double> s2 = () -> Math.random();
		System.out.println(s2.get());
		
		Supplier<String> s3 = () -> "홍길동";
		System.out.println(s3.get());
		
		Supplier<Student> s4 = () -> new Student("홍길동", 100, 90, 80);
		System.out.println(s4.get());
		
		IntSupplier s5 = () -> 200;
		System.out.println(s5.getAsInt());
	}

	private static void m1() {
		
		//일반적인 람다식
		MyConsumer m1 = num -> System.out.println(num * num);
		m1.test(10);
		
		
		//Consumer
		//- 매개변수를 받아서 소비하는 업무를 구현
		//- 매개변수 O, 반환값 X > 추상메소드
		//- acceptXXX() 추상 메소드 제공
		
		//Consumer 사용
		Consumer<Integer> c1 = num -> System.out.println(num * num);
		c1.accept(5);
	
		Consumer<String> c2 = str -> System.out.println(str.length());
		c2.accept("홍길동");
		c2.accept("안녕하세요");
		
		//한 줄이 아니니까 중괄호 생략X
		Consumer<Integer> c3 = count -> {
			for(int i=0; i<count; i++) {
				System.out.println(i);
			}
			System.out.println();
		};
		c3.accept(5);
		
		Consumer<Student> c4 = s -> {
			System.out.println("이름: " + s.getName());
			System.out.println("국어: " + s.getKor());
			System.out.println("영어: " + s.getEng());
			System.out.println("수학: " + s.getMath());
			System.out.println("총점: " + s.getTotal());
		};
		
		c4.accept(new Student("홍길동", 100, 90, 80));
		
		
		BiConsumer<String, Integer> bc1 = (name, age) -> {
			System.out.printf("이름: %s, 나이: %d세\n", name, age);
		};
		bc1.accept("홍길동", 20);
		
		IntConsumer ic1 = num -> System.out.println(num * num);
		ic1.accept(10);
	}
}

@FunctionalInterface
interface MyConsumer {
	void test(int num);
}

//람다식을 저장하는 목적의 인터페이스 vs 일반적인 인터페이스
//- 차이가 없다.

//functional interface, 함수형 인터페이스
//- 함수형 인터페이스는 추상 메소드를 딱 1개만 가질 수 있음, 
//- 그 1개의 추상 메소드가 곧 람다식이 되기 때문에

@FunctionalInterface 
interface Test {
	void aaa();
//	void bbb();
}

interface Test2 {
	
	//일반적인 인터페이스 멤버
	//- 추상 멤버
	void aaa();

	//자바의 인터페이스 멤버
	//- 추상 멤버
	//- 구현 멤버(***)
	
	//일반적인 객체 멤버는 절대 불가, 이게 있으면 인터페이스가 아님
//	public int a;
//	public void bbb() {
//		
//	}
	
	final public int b = 20;
	final static public int c = 30;
	
	public static void ccc() {
		
	}
	
	default void ddd() {
		
	}
}