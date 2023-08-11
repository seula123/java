package com.test.question;

public class Q018 {
	
	public static void main(String[] args) {
		
		
		int count = 0;
		
		 positive(10);
		
		count = positive(10, 20);
		System.out.println("양수:"+count+"개");
		count = positive(10, 20, -30);
		System.out.println("양수:"+count+"개");
		count = positive(10, 20, -30, 40);
		System.out.println("양수:"+count+"개");
		count = positive(10, 20, -30, 40, 50);
		System.out.println("양수:"+count+"개");
	}



	private static void positive (int n1) {
		
		int count=0;
		
		count = (n1>0) ? ++count : count;
		
		System.out.printf("양수:%d개\n",count);
		
	}
	
	
	private static int positive(int n1, int n2) {
		
		int count = 0;
		
		count = (n1>0) ? ++count : count ;
		count = (n2>0) ? ++count : count ;
		
		return count;
	}

	
	private static int positive(int n1, int n2, int n3) {
		
		int count = 0;
		
		count = (n1>0) ? ++count : count ;
		count = (n2>0) ? ++count : count ;
		count = (n3>0) ? ++count : count ;
		

		return count;
	}
	
	private static int positive(int n1, int n2, int n3, int n4) {
		
		int count = 0;
		
		count = (n1>0) ? ++count : count ;
		count = (n2>0) ? ++count : count ;
		count = (n3>0) ? ++count : count ;
		count = (n4>0) ? ++count : count ;
		

		return count;
	}
	

	private static int positive(int n1, int n2, int n3, int n4, int n5) {
		
		int count = 0;
		
		count = (n1>0) ? ++count : count ;
		count = (n2>0) ? ++count : count ;
		count = (n3>0) ? ++count : count ;
		count = (n4>0) ? ++count : count ;
		count = (n5>0) ? ++count : count ;
		

		return count;
	}

	
}
