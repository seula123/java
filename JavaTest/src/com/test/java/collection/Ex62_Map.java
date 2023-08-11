package com.test.java.collection;

import java.util.HashMap;
import java.util.Set;

public class Ex62_Map {
	
	public static void main(String[] args) {
		
	
	/*
	 
	  
	  ArrayList
	  - 요소 접근 > 첨자(index) 사용
	  - 순서가 있는 데이터 집합(방번호 == 요소의 순서)
	  ex) 강의실 6개 > 1강의실,2강의실,3강의실..6강의실
	  - 스칼라 배열 (Scalar Array)
	  - 요소 일관 접근 > 루프(for)
	  - 요소끼리 구분이 힘들다 > 방번호 > 의미가 없다
	  - 첨자(index)는 유일하다.
	  - 값(value)은 중복이 가능하다.>방번호가 유일하기때문에
	  
	  HashMap
	  - 요소 접근 할 때 방 번호가 없고 키(key)를 사용
	  - (방번호가 없다는 뜻은) 순서가 없는 데이터 집합
	   ex) 강의실 6개 > 햇님반, 달님반, 별님반
	  - 키(key) -> 값(value)
	  - 맵(Map),딕셔너리(Dictionary) = 사전 구조
	  - 연관 배열
	  - 요소 일관 접근 > 불가능
	  - 식별자(key)를 사용하므로 방의 의미가 명확해져서 요소끼리구분이용이함(가독성 높음)
	  - 키(key)는 유일하다
	  - 값(value)은 중복이 가능하다.>방번호가 유일하기때문에
	  
	  
	  blue > 파란 색상을 나타내는 말
	 
	 
	 */
	
	//String - key 자료형 > 방이름
	//Integer - value 자료형 > 데이터
	HashMap<String,Integer>map = new HashMap<String,Integer>();
	
	//1. 요소 추가
	//- V put (K key, V value)
	
	map.put("국어",100); //int 국어 = 100
	map.put("영어",90);
	map.put("수학",80);

	
	//2. 요소 개수
	//- int size()
	System.out.println(map.size());
	
	
	//3.요소 읽기
	//- V get(K key)
	System.out.println(map.get("국어"));
	System.out.println(map.get("영어"));
	System.out.println(map.get("수학"));
	
	//4. 일괄 탐색 > 불가능 > 존재 o
	
	//5. 요소 수정
	// -V put (K key, V value)
	
	map.put("국어", 95); //추가(x) 수정(o) 이유? key가 유일하기 때문에
	
	System.out.println(map.get("국어"));
	
	
	
	//6. 요소 검색
	//-boolean containsKey (K key)
	//-boolean containsValue (K value)
	
	System.out.println(map.containsKey("국어"));  //배열 안에 국어 점수가 있니?
	System.out.println(map.containsKey("국사"));  //배열 안에 국사 점수가 있니? false
	
	System.out.println(map.get("국사")); //null
	
	System.out.println(map.containsValue(90)); // 90점 맞는 과목이 있나? true
	System.out.println(map.containsValue(100)); // false
	
	
	
	//7. 요소 삭제
	//- V remove(K key)
	map.remove("국어");
	
	System.out.println(map.size());
	System.out.println(map.get("국어"));
	
	
	
	//8. 초기화
	map.clear();
	
	System.out.println(map.size());
	
	
	
	
	map.put("국어", 100);
	map.put("영어", 90);
	map.put("수학", 80);
	
	Set<String> set = map.keySet();
	
	System.out.println(set);
	
	for(String key : set) {
		System.out.println(key+":"+map.get(key));
	}
	
	
	
	
	
	//교실
	HashMap<String,String> list = new HashMap<String,String>();
	
	list.put("반장", "홍길동");
	list.put("부반장", "아무개");
	list.put("미화부장", "하하하");
	
	
	}
}
