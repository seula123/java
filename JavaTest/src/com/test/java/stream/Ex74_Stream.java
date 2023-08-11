package com.test.java.stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.data.Data;
import com.test.data.Item;
import com.test.data.User;
import com.test.java.collection.Student;
import com.test.util.MyFile;

public class Ex74_Stream {
	
	public static void main(String[] args) {
		
		//Ex74_Stream.java
		
		/*
			자바 스트림
			1. 입출력 스트림
				- 콘솔 입출력, 파일 입출력, 네트워크 입출력...
			
			2. 스트림
				- Java 8(JDK 1.8)
				- 람다식 + 함수형 인터페이스
				- 배열(컬렉션)의 탐색(조작) 지원 > 핵심
				- 그 외 파일 입출력 지원, 디렉토리 탐색 지원도 가능
				
				
			배열, 컬렉션 탐색
			1. for문(루프변수)
			2. 향상된 for문
			3. Iterator
			4. Stream
			
			
			함수형 인터페이스
			1. Consumer
				- (매개변수) -> {구현부}
			2. Supplier
				- () -> {return 값}
			3. Function
				- (매개변수) -> {return 값}
			4. Operator
				- (매개변수) -> {return 값}
				- 매개변수와 반환값의 자료형이 동일
			5. Predicate
				- (매개변수) -> {return 값}
				- 반환값이 무조건 boolean
				
				stream()
				.filter(Predicate)
				.map(Function)
				.sorted(comparator)
				.distinct()
				\
				.count()/max()/average()/sum()
				.allMath()anyMath()/noneMath()
				.forEach()
		*/
		
		String path = "test.java";
		
		//개발자 자바 소스를 다른 개발자에게 전달하는 방식 > 배포
		//1. MyFile.java 소스 자체 전달 - 친한사람한테만 가능 
		//2. MyFile.class 컴파일한 실행 파일 전달 > 1개 파일로 압축 *.jar - 원본 소스를 알아내기 힘듬
		
		//import 안됨, 같은 프로젝트내에서만 가능
		MyFile mf = new MyFile();
		
		System.out.println(mf.getFileNameWithoutExtension(path));
		System.out.println(mf.getExtension(path));
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		m10();
		//m11();
		
		
	}private static void m11() {
		// TODO Auto-generated method stub
		
	}
	private static void m10() {
		// 집계, 통계, Reduce
		//- count(),max(),min(),sum(),avg()
		//- 최종 파이프
		//- 요소들을 가공해서 통계값
		
		System.out.println(Data.getIntList().stream().count());
//		Optional<Integer>
		System.out.println(Data.getIntList().stream().max((a,b)->a-b).get());
		
		System.out.println(Data.getIntList().stream().max((a,b)->a-b).get());
		
		
		int sum = Data.getIntList().stream()
						.mapToInt(n->n) //Stream<Integer>(x)  IntStream(o)
						.sum();
		System.out.println(sum);
		
		double avg = Data.getIntList().stream()
						.mapToInt(n->n)
						.average().getAsDouble();
		System.out.println(avg);
		
		
		
	}
	private static void m9() {
		// 매칭
		//- allMath(), anyMath(), noneMath()
		//- 최종 파이프
		//- 스트림 요소들이 제시한 조건을 만족 유무 판단?
		// a. boolean allMath(Predicate) :모든 요소가 조건을 100%로 만족해야함 (and)
		// b. boolean anyMath(Predicate) :일부 요소가 조건을 만족하면 된다 
		// c. boolean noneMath(Predicate):모든 요소가 조건을 만족하지 않았을때 true
		
		//요구사항] 배열을 만들어서 짝수만 들어있는지?
		
		int[] nums = {2,2,4,4,6};
		
		boolean result = false;
		
		for(int n : nums) {
			if(n%2 ==1) {
				result = true;
				break;
			}
		}
		if(result) {
			System.out.println("홀수 발견!!");
		} else {
			System.out.println("짝수 배열~");
		}
		
		
		System.out.println(Arrays.stream(nums).allMatch(n-> n%2 ==0)); //모든 애들이 짝수인지
		System.out.println(Arrays.stream(nums).anyMatch(n-> n%2 ==0)); //한놈이라도 짝수인지
		System.out.println(Arrays.stream(nums).noneMatch(n-> n%2 ==0)); //모든 애들이 짝수가 아닌지
		
	}
	private static void m8() {
		// 정렬
		// - sorted()
		// - 중간 파이프
		// - 배열/컬렉션의 sort()와 사용법이 동일 > Comparator 구현
		
		
		Data.getIntList(10)
			.stream()
			.sorted((a,b)-> b-a)
			.forEach(n->System.out.println(n));
	}

	private static void m7() {
		
		//매핑
		//-map(),mapXXX()
		//-중간 파이프
		//-변환 작업
		
		List<String> list = Data.getStringList(10);
		System.out.println(list);
		System.out.println();
		
		list.stream()						//Stream<String>
			.filter(word->word.length()<=3) //Stream<String>
			.forEach(word->System.out.println(word));
		System.out.println();
		
		list.stream()					//Stream<String>
			.map(word->word.length())	//Stream<Integer>
			.forEach(num->System.out.println(num));
		System.out.println();
		
		String[] names = {"홍길동","아무개","이순신","권율","강감찬","연개소문","홍길동","이순신","남궁장군","연개소문"};
		
			//이름 추출
			Arrays.stream(names)
				 .map(name->name.substring(1))
				 .forEach(name-> System.out.println(name));
			System.out.println();
			
			List<Student> slist = new ArrayList <Student>();
			slist.add(new Student("가가가",100,92,80));
			slist.add(new Student("나나나",93,60,70));
			slist.add(new Student("다다다",59,84,90));
			slist.add(new Student("라라라",100,75,89));
			slist.add(new Student("마마마",84,72,78));
			
			slist.stream()
				.map(s->{
					if((s.getKor()+s.getEng()+s.getMath())>=100){
						return s.getName()+"합격";
					}else {
						return s.getName()+"불합격";
					}
				}) //stream<Student> -> Stream<String>
				.forEach(result->System.out.println(result));
			System.out.println();
			
			slist.stream()
					.map(s->{
						if((s.getKor()+s.getEng()+s.getMath())>=100) {
							
							Result r = new Result();
							r.setName(s.getName());
							r.setResult("합격");
							return r;
							
						}else {
							Result r = new Result();
							r.setName(s.getName());
							r.setResult("불합격");
							return r;
						}
							
					})
				.forEach(r -> {
					System.out.println("이름: "+r.getName());
					System.out.println("결과: "+r.getName());
					System.out.println();
				});
	}//m7

	//main

	private static void m6() {
		//중복 제거
		//-distinct()
		//-중간 파이프
		//-앞의 스트림에서 중복 요소를 제거하고 > 유일한 요소만 남은 새로운 스트림을 반환한다.

		List<Integer> list = Data.getIntList();
		
		System.out.println(list.size());
		
		//요구사항] 위의 배열에서 중복값 제거
		//Case1.
		Set<Integer> set1 = new HashSet<Integer>();
		
		for(int n : list) {
			set1.add(n); //중복값 제거
		}
		System.out.println(set1.size());
	
		//Case2
		Set<Integer> set2 = new HashSet<Integer>(list);
		System.out.println(set2.size());
		
		//Case3.
		//list.stream().distinct().forEach(n->System.out.println(n));
		System.out.println(list.stream().count());
		System.out.println(list.stream().distinct().count());
		System.out.println();
		
		
		String[] names = {"홍길동","아무개","이순신","권율","강감찬","연개소문","홍길동","이순신","남궁장군","연개소문"};
		
		Arrays.stream(names)
			  .distinct()
			  .filter(name->name.length()==3)
			  .forEach(name->System.out.println(name));
		System.out.println();
		System.out.println();
		
		List<Cup> clist = new ArrayList<Cup>();
		
		clist.add(new Cup(Cup.BLACK,200));
		clist.add(new Cup(Cup.BLUE,300));
		clist.add(new Cup(Cup.RED,400));
		clist.add(new Cup(Cup.WHITE,500));
		clist.add(new Cup(Cup.YELLOW,600));
		clist.add(new Cup(Cup.BLACK,700));
		clist.add(new Cup(Cup.BLUE,800));
		clist.add(new Cup(Cup.RED,900));
		clist.add(new Cup(Cup.WHITE,500));
		clist.add(new Cup(Cup.YELLOW,600));
		
		
		//Set, distinct() > 중복 객체를 제거하려면?
		//1. hashCode() 재정의
		//2. equals() 재정의
		clist.stream()
			 .distinct()
			 .forEach(cup->System.out.println(cup));
		System.out.println();
		System.out.println();
		
		
	}

	private static void m5() {
		/*
		 스트림
		- 데이터 소스로부터 탐색/조작 가능한 도구
		- list.stream().forEach()
		
		파이프,pipe
		-스트림 객체 메소드
		1.중간 파이프
			-반환값 o + 스트링 반환
		
		2.최종 파이프
			-반환값 x + void
			-반환값 o + 다른 자료형 반환
		
		요소처리
		- forEach()
		- 최종 파이프
		- Consumer
		
		필터링
		- filter()
		- 중간 파이프
		- Predicate
		
		*/
		
		List<Integer> list = Data.getIntList(20);
		System.out.println(list);
		
		//요구사항] 짝수만 출력
		for(int n:list) {
			if(n%2 == 0) {
				System.out.printf("%4d",n);
			}
		}
		System.out.println();
		
		list.stream().forEach(num ->{
			if(num%2==0) {
				System.out.printf("%-4d",num);
			}
		});
		System.out.println();
		
		list.stream().filter(num->num%2==0).forEach(num->{
			System.out.printf("%-4d",num);
		});
		System.out.println();
		System.out.println("======================");
		
		Data.getStringList().stream()
			.filter(word -> word.length()>=5)
			.forEach(word->System.out.println(word));
		System.out.println();
		
		Data.getUserList().stream()
		.filter(user->user.getWeight()>=70&&user.getGender()==1)
		.forEach(user->System.out.println(user));
		System.out.println();
		System.out.println();
		
		Data.getUserList().stream()
		.filter(user->user.getWeight()>=70)
		.filter(user->user.getGender()==1)
		.filter(user->user.getHeight()>=180)
		.forEach(user->System.out.println(user));
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		
	}//m5

	private static void m4() {
		
		//스트림을 얻어오는 방법
		//1. 배열로 부터
		//2. 컬렉션으로 부터
		
		
		//3. 숫자범위로 부터
		//4. 파일로 부터
		//5. 디렉토리 부터
		
		//1. 배열
		int[] nums1 = {10,20,30};
		
		Arrays.stream(nums1).forEach(num -> System.out.println(num));
		System.out.println();
		
		//2. 컬렉션
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		nums2.add(100);
		nums2.add(200);
		nums2.add(300);
		
		nums2.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		//3.숫자범위로부터
		
//		Stream<Integer>:범용 스트림 > forEach >Consumer<Integer>
//		IntStream      :전용 스트림 > forEach >IntConsumer
		
		IntStream.range(1, 10).forEach(num->System.out.println(num));
		
		System.out.println();
		
		try {
			
			//4.파일로부터
			//- 스트림 >파일읽기
			
			//java.io > 버전업 > java.nio
			
			Path path = Paths.get(".\\data\\number.txt");
			
			Files.lines(path).forEach(line->System.out.println(line));
			System.out.println();
			
			//5. 디렉토리부터
			//- 목록보기 > dir/listFiles()
			Path dir = Paths.get("C:\\class\\dev\\eclipse");
			
			Files.list(dir).forEach(p ->{
				System.out.println(p.getFileName());
				System.out.println(p.toFile().isFile());
				System.out.println();
				
			});
			
		} catch (Exception e) {
			System.out.println("at Ex74_Stream.m4");
			e.printStackTrace();
		}
		
		
		
	}

	private static void m3() {

		//함수형 프로그래밍은 의식의 흐름대로 코드 생성 - 가독성이 안좋음
		Data.getIntList().stream().forEach(num -> System.out.printf("%4d", num));
		System.out.println();
	
		
		Data
		.getIntList()
		.stream()
		.forEach(num -> System.out.printf("%4d", num));
		System.out.println();
		
		Data.getUserList().stream().forEach(user -> {
			System.out.println("[회원정보]");
			System.out.println("이름: " + user.getName());
			System.out.println("나이: " + user.getAge());
			System.out.println("성별: " + user.getGender());
			System.out.println();
		});
		
		Data.getItemList().stream().forEach(item -> {
			System.out.println(item.getName());
			System.out.println(item.getColor());
			System.out.println();
		});
	
	}

	private static void m2() {
		
		//배열(컬렉션) 탐색
		List<String> list = Data.getStringList(10);
		
		//1. for
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println();
		
		//2. 향상된 for문
		for (String word : list) {
			System.out.print(word + " ");
		}
		System.out.println();
		System.out.println();
		
		//3. Iterator
		Iterator<String> iter =  list.iterator();
		
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		System.out.println();
		
		
		//4. Stream
		Stream<String> stream = list.stream();
		
		Consumer<String> c1 = str -> System.out.print(str + " "); //Consumer을 구현한 오브젝트
		
		//forEach 메소드
		//1. stream으로부터 얻어낸 데이터를 1개씩 가져온다.(향상된 for문 유사)
		//2. 가져온 데이터를 Consumer.accept() 메소드의 인자 전달 후 메소드 호출
		//3. 반복 x 요소만큼
		stream.forEach(c1); //이미 요소를 끝까지 소요했음
//		stream.forEach(c1); //더이상 읽을 요소가 없어서 끝남
		
		//재사용 하고싶으면 list 다시 호출
		stream = list.stream();
		stream.forEach(c1); 
		
		//코드 요약
		//메소드 체이닝 > 함수형 프로그래밍 방식
		list.stream().forEach(str -> System.out.println(str));
		
	}

	private static void m1() {
		
		//선생님이 미리 만들어서 주신 데이터 불러오기(import 필수)

		int[] nums1 = Data.getIntArray();
		
		System.out.println(Arrays.toString(nums1));
		System.out.println(nums1.length);
		
		int[] nums2 = Data.getIntArray(5); //5개만 출력
		System.out.println(Arrays.toString(nums2));
		
		//List<Integer>
		List<Integer> nums3 = Data.getIntList();
		System.out.println(nums3.size()); 
		
		List<Integer> nums4 = Data.getIntList(5); //5개만 출력
		System.out.println(nums4);
		
		String[] txt = Data.getStringArray();
		System.out.println(Arrays.toString(txt));
		
		Item[] items = Data.getItemArray();
		System.out.println(Arrays.toString(items));
		
		User[] list = Data.getUserArray();
		System.out.println(Arrays.toString(list));
	}
	
	 
	//이전에 Set 수업할 때 하던 거
	class Cup {
	   
	   public final static int BLACK = 1;
	   public final static int WHITE = 2;
	   public final static int RED = 3;
	   public final static int YELLOW = 4;
	   public final static int BLUE = 5;
	   
	   
	   private int color; //객관식 > 빨강, 파랑... 선택(열거 값)
	//   private String color2; //주관식 > color = "white", 오타 유효성 검사 필 
	   
	   private int size;
	   
	   public Cup(int color, int size) {
	      this.color = color;
	      this.size = size;
	   }
	   
	   public int getColor() {
	      return color;
	   }
	   
	   public void setColor(int color) {
	      this.color = color;
	   }
	   
	   public int getSize() {
	      return size;
	   }
	   
	   public void setSize(int size) {
	      this.size = size;
	   }
	   
	   @Override
	   public String toString() {
	      return "Cup [color=" + color + ", size=" + size + "]";
	   }

	   //개발자의 의도대로 객체를 비교하려면 hashCode, equals 재정의
	   @Override
	   public int hashCode() {
	      return ("" + this.color + this.size).hashCode();
	   }
	   
	   @Override
	   public boolean equals(Object obj) {
	      return this.hashCode() == obj.hashCode();
	   }
	   
	}
}
	
	
	
	class Result{
		private String name;
		private String result;
	
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getResult() {
			return result;
		}
		public void setResult(String result) {
			this.result = result;
		}
		
		
		
	}