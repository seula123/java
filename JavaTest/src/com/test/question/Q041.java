package com.test.question;

public class Q041 {
	
	public static void main(String[] args) {
				
		int sum=0;
		
		for(int i=1; ; i++) {
			
			System.out.print(i);
			System.out.print(" + ");
			
			sum+=i;
			
			if(sum>1000) {
				System.out.print(i);
				break;
			}
		}
		System.out.printf("= %d\n",sum);
		
	}

}
