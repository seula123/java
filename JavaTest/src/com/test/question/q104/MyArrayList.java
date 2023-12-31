package com.test.question.q104;

import java.util.Arrays;

public class MyArrayList {
		
	private String[] list;
	
	//1. 현재 요소를 대입할 방번호
	//2. 현재까지 대입된 요소의 개수
	private int index;
	
	public MyArrayList() {
		this.index = 0;
		this.list = new String[4];
	}
	
	
	//개발할 때 유용하게 사용 > toString()
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("length: %d\n", this.list.length));
		sb.append(String.format("index: %d\n", this.index));
		sb.append(Arrays.toString(this.list) + "\n");
		
		return sb.toString();
	}


	public void add(String value) {
		
		if (checkLength()) {
			doubleList();
		}
		
		this.list[this.index] = value;
		this.index++;
		
	}


	private void doubleList() {
		
		String[] temp = new String[this.list.length * 2];
		
		//깊은 복사
		for (int i=0; i<this.list.length; i++) { //루프 > 짧은 배열 길이
			temp[i] = this.list[i];
		}
		
		this.list = temp; //배열 교체
		
	}


	private boolean checkLength() {
		
		if (this.list.length == this.index) {
			//방이 꽉 찼습니다.
			return true;
		}
		
		//방이 여유가 있습니다.
		return false;
	}


	public String get(int index) {
		
		if (index < 0 || index >= this.index) {
			
			//없는 방번호를 요청 > IndexOutOfBoundException 발생
			throw new IndexOutOfBoundsException();			
		}
		
		return this.list[index];
	}


	public int size() {
		
		return this.index;
	}


	public void set(int index, String value) {
		
		if (index < 0 || index >= this.index) {
			
			throw new IndexOutOfBoundsException();			
		}
		
		this.list[index] = value;		
	}


	public void remove(int index) {
		
		//요소 삭제 > 우측의 모든 요소 > 왼쪽으로 1칸 이동 > Left Shift
		for (int i=index; i<this.list.length-1; i++) {
			this.list[i] = this.list[i+1];
		}
		
		this.index--;
		
	}


	public void add(int index, String value) {
		
		if (index < 0 || index >= this.index) {
			
			throw new IndexOutOfBoundsException();			
		}
		
		if (checkLength()) {
			doubleList();
		}
		
		//요소 삽입 > 우측의 모든 요소 > 오른쪽으로 1칸 이동 > Right Shift
		for (int i=this.list.length-2; i>=index; i--) {
			this.list[i+1] = this.list[i];
		}
		
		this.list[index] = value;
		this.index++;
		
	}


	public int indexOf(String value) {
		
		for (int i=0; i<this.index; i++) {
			if (this.list[i].equals(value)) {
				
				return i;
			}
		}
		
		return -1;
	}
	
	public int indexOf(String value, int beginIndex) {
		
		for (int i=beginIndex; i<this.index; i++) {
			if (this.list[i].equals(value)) {
				
				return i;
			}
		}
		
		return -1;
	}


	public int lastIndexOf(String value) {
		
		for (int i=this.index-1; i>=0; i--) {
			if (this.list[i].equals(value)) {
				
				return i;
			}
		}
		
		return -1;
	}
	
	public int lastIndexOf(String value, int beginIndex) {
		
		for (int i=beginIndex; i>=0; i--) {
			if (this.list[i].equals(value)) {
				
				return i;
			}
		}
		
		return -1;
	}


	public boolean contains(String value) {
		
		for (int i=0; i<this.index; i++) {
			if (this.list[i].equals(value)) {
				return true;
			}
		}
		
		return false;
	}


	public void clear() {
		
//		for (int i=0; i<this.index; i++) {
//			this.list[i] = null;
//		}
//		
//		this.index = 0;
		
		
//		this.list = new String[4]; //새로운 배열 교체
//		this.index = 0;
		
		
		this.index = 0;
		
		
	}
	
}





















