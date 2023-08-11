package com.test.question.q93;

public class Note {

	private String size;
	private String color;
	private int page;
	private String owner; // null
	private int price = 500;
	
	private String thickness;
	
	
	// setter, getter 구현
	public void setSize(String size) {
		
		//A3, A4, A5, B3, B4, B5
		if (size.equals("A3") 
				|| size.equals("A4") 
				|| size.equals("A5") 
				|| size.equals("B3") 
				|| size.equals("B4") 
				|| size.equals("B5")) {
			
			this.size = size;
			
			if (size.equals("A3")) {
				this.price += 400;
			} else if (size.equals("A4")) {
				this.price += 200;
			} else if (size.equals("B3")) {
				this.price += 500;
			} else if (size.equals("B4")) {
				this.price += 300;
			} else if (size.equals("B5")) {
				this.price += 100;
			}
			
		}
		
	}

	public void setColor(String color) {
		
		//검정색, 흰색, 노란색, 파란색
		if (color.equals("검정색") || 
			color.equals("흰색") || 
			color.equals("노란색") || 
			color.equals("파란색")) {
			
			this.color = color;
			
			if (color.equals("검정색")) {
				this.price += 100;
			} else if (color.equals("노란색") || color.equals("파란색")) {
				this.price += 200;
			}
			
		}
	}

	public void setPage(int page) {
		
		//if (page >= 10 && page <= 200) {
		//	this.page = page;
		//}
		
		if (page < 10 || page > 200) {
			return;
		} 
		
		//(+) 10~50(얇다), 51 ~ 100(보통), 101 ~ 200(두껍다)
		if (page >= 10 && page <= 50) {
			this.thickness = "얇은";
		} else if (page >= 51 && page <= 100) {
			this.thickness = "보통";
		} else {
			this.thickness = "두꺼운";
		}
		
		this.page = page;
		
		this.price += (page - 10) * 10;
	}

	public void setOwner(String owner) {
		
		//유효성 검사
		//- 검사할 기준 1개 > 무관
		//- 검사할 기준 N개 > 잘못된 것을 찾기!!
		
		//한글 2~5자 이내
		
		/*
		//글자수
		if (owner.length() >= 2 && owner.length() <= 5) {

			//한글
			boolean result = false; 
			
			for (int i=0; i<owner.length(); i++) {
				
				char c = owner.charAt(i);
				
				//홍A동
				if (c >= '가' && c <= '힣') {
					result = true;
				} else {
					result = false;
					break;
				}
				
			}//for
			
			if (result) {
				this.owner = owner;				
			}
			
		}
		*/
		
		
		if (owner.length() < 2 || owner.length() > 5) {
			return;
		}
		
		for (int i=0; i<owner.length(); i++) {
			
			char c = owner.charAt(i);
			
			if (c < '가' || c > '힣') {
				return;
			}
			
		}
				
		this.owner = owner;			
	}

	public String info() {
		
		String temp = "";
		
		// 문자열(null)
		// if (owner != null) > 연산자 사용 > 주소값 비교
		
		// 문자열("")
		// if (owner.equals("")) > 메소드 사용 > 값 비교
		
		if (this.owner != null) {
			temp += "■■■■■■ 노트 정보 ■■■■■■\n";
			temp += "소유자 : " + this.owner + "\n";
			temp += String.format("특성 : %s %s %s노트\n"
									, this.color, this.thickness, this.size);
			temp += String.format("가격 : %,d원\n", this.price);
			temp += "■■■■■■■■■■■■■■■■■■■■■■";
		} else {		
			temp += "■■■■■■ 노트 정보 ■■■■■■\n";
			temp += "주인 없는 노트\n";
			temp += "■■■■■■■■■■■■■■■■■■■■■■";
		}
		
		return temp;
	}

}









