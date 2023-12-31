package com.test.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex63_HashSet {

	public static void main(String[] args) {
		/*
		 * 1.list
		 *  순서가 있는 데이터 집합
		 *  점자 방번호
		 *  데이터 중복을 허용
		 *  
		 *  2.set
		 * 순서가 없는 데이터 집합  
		   요소를 구분하는 식별자가 없음
		   데이터 중복을 허용하지 않음
		   
		   3.map
		    순서가 없는 데이터집합
		    키 + 값
		    데이터 중복을 활용
		 * 
		 * 
		 */
		
		
		//m1();
		//m2();
		m3();
		
		
	}

	private static void m3() {
		
		HashSet<String> name = new HashSet<String>();
		
		name.add("홍길동");
		name.add("홍길동");
		
		HashSet<Person> set = new HashSet<Person>();

		set.add(new Person ("홍길동",20));
		set.add(new Person ("아무개",25));
		set.add(new Person ("이순신",23));
		
		set.add(new Person("홍길동",20)); //set  중복값을 배제 > 동명이인
		
		System.out.println(set);
		System.out.println();
		
		//p1 과  p2를 같은 사람이라고 인식 > 수정 > 가끔식 구현
		Person p1 = new Person ("홍길동",20); 
		Person p2 = new Person ("홍길동",20);
		
		System.out.println(p1.equals(p2));   // 주소값 비교 false
		
		System.out.println("p1: " +p1.hashCode()); //1617791695
		System.out.println("p2: " +p2.hashCode()); //125993742
		
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍";
		s3 = s3 + "길동";
		
		
		System.out.println(s1.equals(s2)); //  주소값 비교
		System.out.println(s1==s3); 
		System.out.println(s1.equals(s3)); 
		
		
		System.out.println(s1.hashCode()); //54150062
		System.out.println(s2.hashCode()); //54150062
		System.out.println(s3.hashCode()); //54150062
	
	}

	private static void m2() {
		
		//중복값 제거 > 로또번호 > 중복되지않는 난수 생성
		
	      //Case 1. ArrayList
	      ArrayList<Integer> lotto = new ArrayList<Integer>();
	      
	      for (int i=0; i<6; i++) {
	         int n = (int)(Math.random() * 45) + 1;
	         boolean flag = false;
	         
	         //중복검사
	         for(int j=0; j<i; j++) {
	            if(lotto.get(j) == n) {
	               flag = true;
	               break;
	            }
	         }
	         
	         if (!flag) {
	            lotto.add(n);
	         } else {
	            i--;
	         }
	      }
	      System.out.println(lotto);
	      
	
	      
		
		//case 2. HashSet
		HashSet<Integer> lotto2 = new HashSet<Integer> ();
		
		while(lotto2.size()<6) {
			int n = (int)(Math.random()*45)+1;
			
			lotto2.add(n); //set -중복값 허용 안함
						
		}
		
	      //Set의 탐색
	      
	      for (int num : lotto2) { //내부에 Iterator 구현
	    	  System.out.println(num);
	      }
	      
	      System.out.println();
	      
	      //****** list,set  모두 지원 >iterator 지원 >탐색도구
	     Iterator<Integer>iter = lotto2.iterator();
	     
	     while(iter.hasNext()) {
	    	 System.out.println(iter.next());
	    	 
	     }
	     
//	    System.out.println(iter.hasNext());  //요소 존재 유무
//	    System.out.println(iter.next());  //요소를 가져오기
//		
//	    System.out.println(iter.hasNext()); 
//	    System.out.println(iter.next()); 
//
//	    System.out.println(iter.hasNext()); 
//	    System.out.println(iter.next()); 
//	    
//	    System.out.println(iter.hasNext()); 
//	    System.out.println(iter.next()); 
//	    
//	    System.out.println(iter.hasNext()); 
//	    System.out.println(iter.next()); 
//	    
//	    System.out.println(iter.hasNext()); 
//	    System.out.println(iter.next()); 
//	    
//	    System.out.println(iter.hasNext()); 
//	    System.out.println(iter.next()); 
	    
	    
	}

	private static void m1() {
		HashSet<String>set= new HashSet<String>();
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("강아지");
		list.add("고양이");
		list.add("거북이");

		set.add("강아지");
		set.add("고양이");
		set.add("거북이");
		
		System.out.println(list.size());
		System.out.println(set.size());
		
		System.out.println(list);
		System.out.println(set);
		
		list.add("고양이"); //중복
		System.out.println(list);
	
		set.add("고양이"); //중복 값을 가질수 없다.
		System.out.println(list);
		
		list.remove(1);
		list.remove("거북이");
		System.out.println(list);
		
		set.remove("거북이");
		System.out.println(list);
		
		System.out.println(set.contains("고양이"));
	}


}



class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}

	
	//값이 동일하면 객체가 동일하게 처리
	//1. HashCode() 오버라이드
	//2. equals() 오버라이드
	
	 public int hashCode () {
		 
		 //원래 > 자신의 메모리 주소값 반환
		 
		 //p1 > "홍길동", 20 > "홍길동,20" >100번지
		 //p2 > "홍길동", 20 > "홍길동,20" >200번지
		 //p3 > "홍길동", 20 > "홍길동,20" >100번지
		 
		 return (this.name + this.age).hashCode();
		 
		 
	 }
	 
	 @Override
	public boolean equals(Object obj) {
		
		 //p1.equals(p2)
		return this.hashCode() == obj.hashCode();
	}
}
