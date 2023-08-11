package com.test.java.collection;

import java.util.TreeMap;
import java.util.Vector;

public class Ex71_TreeMap {
	
	public static void main(String[] args) {
		
		//TreeMap
		//-Tree > 이진 탐색 트리 > 자동정렬
		//-Map >키+값 > 연관배열
		
		TreeMap<String,String> map = new TreeMap<String,String>();
		
		map.put("white", "흰색");
		map.put("black", "검정");
		map.put("red","빨강");
		map.put("yellow","노랑");
		map.put("blue","파랑");
		map.put("orange","주황");
		map.put("green","초록");	
		
		System.out.println(map.size());  //7
		
		System.out.println(map);
		
		System.out.println(map.get("green"));
		
		map.put("green", "녹색");
		
		System.out.println(map.get("green")); //녹색
		
		
		System.out.println(map.firstKey()); //black
		System.out.println(map.lastKey()); //yellow
		
		System.out.println(map.headMap("m"));
		System.out.println(map.tailMap("m"));
		System.out.println(map.subMap("r","y"));

		Vector<Integer> list = new Vector<Integer>();
		
		list.add(10);
		System.out.println(list.get(0));
		
		
		/*
		 
		  List
		  - ArrayList > 배열이 필요할 때 /삽입,삭제(x) *****
		  - LinkedList > ArrayList 대체제 / 삽입,삭제(x)
		  - Stack > 스택 구조 필요
		  - Queue > 큐 구조 필요
		  - Vector 
		  
		  Set
		  - HashSet > 중복값 배제, 유일한 집합 *****
		  - TreeSet > HashSet + 정렬
		  
		  Map
		  - HashMap > 키/값 연관 배열이 필요할 때 *****
		  - TreeMap > HashMap + 정렬
		  - HashTable
		  
		  - Properties > JSON, XML 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 
		  
		 */
		
	}
}
