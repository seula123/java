package com.test.question;

public class Q084 {
	
	public static void main(String[] args) {
		
		String content = "안녕~ 길동아~ 잘가~ 길동아~";
		String word = "길동";
		int count = 0;
		int index = -1;
		
		while(true) {
			index = content.indexOf(word,index);
			
			if(index>-1) {
				count++;
				index = index + word.length();
			}else {
				break;
			}
		}
		
		System.out.printf("%s을 총 %d회 발견했습니다\n",word,count);
		
		
	}

}
