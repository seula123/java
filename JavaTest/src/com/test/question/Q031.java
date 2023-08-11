package com.test.question;

import java.util.Scanner;

public class Q031 {
	
		public static void main(String[] args) {
			
			
		Scanner scan = new Scanner(System.in);
		
		int odd = 0;
		int even = 0;
		
		System.out.println("숫자입력: ");
		int num = scan.nextInt();
 
		if (num%2 == 0) { ++even;
			}else { ++odd;}
		
		
		System.out.println("숫자입력: ");
		num = scan.nextInt();
		
		if (num%2 == 0) { ++even;
		}else { ++odd;}
		
		
		System.out.println("숫자입력: ");
		 num = scan.nextInt();
		 
		 if (num%2 == 0) { ++even;
		 }else { ++odd;}

		 
		 
		 System.out.println("숫자입력: ");
		 num = scan.nextInt();
		 
		 if (num%2 == 0) { ++even;
		 }else { ++odd;}
		 
		 
		 
		 
		 System.out.println("숫자입력: ");
		num = scan.nextInt();
		
		if (num%2 == 0) { ++even;
		}else { ++odd;}
		
		
		
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n 홀수가 짝수보다 %d개 더 많습니다.",even,odd,odd-even);
		
		}
		
		
		
		
}
