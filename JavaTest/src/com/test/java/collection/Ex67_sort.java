package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Ex67_sort {
	
	public static void main(String[] args) {
		
		//Ex67_sort.java
		
		//배열 or 컬렉션
		//- 오름차순 정렬, 내림차순 정렬
		//1. 직접 알고리즘 구현
		//2. JDK 제공 기능
		
		//2 + 1 > JDK 제공 + 커스터마이징 + 익명 클래스 사용(선택)
		
	//	m1();
		//m2();
//		m3();
//		m4();
		m5();
		
	}//main

	private static void m5() {
		// 컬렉션의 정렬
		//1. ArrayList >0
		//2. HashMap > x
		//3. Queue > x
		//4. Stack > x
		//5. HashSet > x
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++) {
			list.add((int)(Math.random()*100)); //0!99
		}
		
		System.out.println(list);
		
//		Collections.sort(list); //Arrays.sort()
//		Collections.sort(list, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// 
//				return o2-o1;
//			}
//			
//		});
		
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1-o2;
			}
			
			
		});
		
		
		System.out.println(list);
		
		
	}

	private static void m4() {
	
		// 객체 정렬
		
		Score[] list = new Score[5];
		
		list[0] = new Score("홍길동",100,90,80);
		list[0] = new Score("아무개",98,70,90);
		list[0] = new Score("유재석",78,96,100);
		list[0] = new Score("박명수",80,92,82);
		list[0] = new Score("이순신",99,76,77);
		
		System.out.println(Arrays.toString(list));
		
		//이름순으로
		Arrays.sort(list, new Comparator<Score>() {

			@Override
			public int compare(Score o1, Score o2) {
				
//				return o1.getName().compareTo(o2.getName());
//				return o2.getKor()-o1.getKor();
				return (o2.getKor() + o2.getEng()+o2.getMath())
						- (o2.getKor() + o2.getEng()+o2.getMath());
			}
		});
		System.out.println(Arrays.toString(list));
		
		
		
	}

	private static void m3() {
		// 날짜 시간
		Calendar[] dates = new Calendar[5];
		
		for(int i=0; i<dates.length; i++) {
			dates[i] = Calendar.getInstance();
		}
		
		dates[0].add(Calendar.DATE, 7);
		dates[1].add(Calendar.DATE, -2);
		dates[2].add(Calendar.DATE, 1);
		dates[3].add(Calendar.DATE, 0);
		dates[4].add(Calendar.DATE, 3);
		
		for(int i=0; i<dates.length; i++) {
			System.err.printf("%tF\n",dates[i]);
			
		}
		System.out.println();
		
		Arrays.sort(dates);
		
		for(int i=0; i<dates.length; i++) {
			System.err.printf("%tF\n",dates[i]);
			
		}
		System.out.println();
		
		Arrays.sort(dates, new Comparator<Calendar>() {

			@Override
			public int compare(Calendar o1, Calendar o2) {
				
//				return (int)(o2.getTimeInMillis()-o1.getTimeInMillis());
				//return o2.compareTo(o1);
			
				//일요일(1)~ 토요일(7) 
				return o1.get(Calendar.DAY_OF_WEEK)-o2.get(Calendar.DAY_OF_WEEK);
				
			}
		});
		
		for(int i=0; i<dates.length; i++) {
			System.err.printf("%tF %tA\n",dates[i],dates[i]);
			
		}
		System.out.println();
		
		
		
	}

	private static void m2() {
		
		// 자료형별 정렬
		// 1. 숫자형
		// 2. 문자(열) > 문자코드값 > 숫자
		// 3. 날짜시간 > 숫자
		// 4.객체(*******)
		
		String txt1 = "홍길동";
		String txt2 = "아무개";
		
//		System.out.println(txt1 > txt2);
		//문자열 > 문자열 : 불가능(참조값)
		// 문자 > 문자 : 가능(값)
		
//		System.out.println('A'>'B');
		int n = 0;
		
		for(int i=0; i<3; i++) {
			char c1 = txt1.charAt(i);
			char c2 = txt1.charAt(i);
			
			if(c1>c2) {
				n = 1;
				break;
			}else if (c1<c2) {
				n = -1;
				break;
			}
		}
		
		System.out.println(n);
		
		System.out.println(txt1.compareTo(txt2)); //위에 메소드랑 똑같이 만들어주는 compareTo 
		System.out.println(txt1.compareToIgnoreCase(txt2)); //영어일 때 대소문자 구분없이 비교해서 판단(abc = ABC는 같다)
		
		
		String[] names = {"홍길동","아무개","유재석","박명수","강호동","이순신","훈","김철"};
		
		//가나다 순으로 정렬
		
		System.out.println(Arrays.toString(names));
		
		//Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				//문자 코드값비교: 가나다
//				return o1.compareTo(o2); //오름차순
				//return o2.compareTo(o1); //내림차순
				
//				return o1.length() - o2.length(); //글자수 비교(훈, 김철 ....)
				
				if (o1.length()>o2.length()) {
					return 1;
				} else if(o1.length()<o2.length()) {
					return -1;
				} else {
					
					//2자 정렬 기준
					return o1.compareTo(o2);
					
				}
			}
		});
		
		
		System.out.println(Arrays.toString(names));
		
		
	}

	private static void m1() {
		//int[] nums 
		Integer[] nums = {1, 5, 2, 4, 3};
		
		System.out.println(Arrays.toString(nums));
		
		//오름차순 정렬
		//Arrays.sort(nums); //Quick sort
		
		System.out.println(Arrays.toString(nums));
		
		//sort는 내림차순 정렬 따로 지원 안함, 직접 구현
		//Arrays.sort(배열, Comparator);
		Arrays.sort(nums,new MyComparator());
		System.out.println(Arrays.toString(nums));
		
		//쓸모 없음....
		MyComparator mc1 = new MyComparator();
		System.out.println(mc1.compare(10,20));
		
		Double[]nums2 = {2.5, 7.1, 3.8, 9.2, 8.9};
		
		Arrays.sort(nums2, new Comparator<Double>(){

			@Override
			public int compare(Double o1, Double o2) {


//				if( o1<o2) {
//					return 1;
//				}else if(o1>o2) {
//					return -1;
//				} else {
//					return 0;
//				}
				return (int)Math.ceil((o2-o1)*10);
//				return (int)(o2-o1);
			}
		});
		
		System.out.println(Arrays.toString(nums2));
	}
	
}

//정렬 때문에 선언한 클래스
class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) { //정렬을 위해 o1과 o2를 비교해라
		
		//o1 vs o2
		//1. 오름차순
		// a. o1이 더 크면 양수를 반환 (1일 때가 많음
		// b. o2가 더 크면 음수를 반환 (-1일 때가 많음
		// c. 같으면 0을반환
		
		//2. 내림차순
		// a. o1이 더 크면 음수를 반환 (-1일 때가 많음
		// b. o2가 더 크면 양수를 반환 (1일 때가 많음
		// c. 같으면 0을반환
		
		if(o1>o2) {
			return 1;
		} else if (o1<o2) {
			return -1;
		} else {
			return 0;
		}

	}
	
}


class Score {
	
	private String name;
	private int kor;
	private int eng;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	private int math;
	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
}
