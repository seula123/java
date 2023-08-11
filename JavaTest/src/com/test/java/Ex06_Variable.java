package com.test.java;

public class Ex06_Variable {
	
	public static void main(String[] args) {
		
		// Ex06_Variable.java
		
		// 목표 > 자료형 + 변수 + 리터럴
		
		//1. 주변의 데이터 검색! > 몸무게 > 저장할 변수 생성
		//2. 형태 + 길이 > 자료형 결정 > double
		//3. 변수 생성 + 값 대입
		//4. 출력
		
		
		//1회
		double myWeight;
		
		myWeight = 70.5;
		
		System.out.println("제 몸무게는 " + myWeight + "kg입니다.");
		
		
		//각 자료형(값형 8가지, String) x 10회 = 9x10회 과제
		
		//byte
		
		byte englishScore; //1
		
		englishScore = 80;
		
		System.out.println("제 영어점수는 " + englishScore + "입니다.");
		
		
		byte mathScore;  //2
				
		mathScore = 70;
		
		System.out.println("제 수학 점수는 " + mathScore + "입니다.");
		
		
		byte koreanScore;  //3
		
		koreanScore = 87;
		
		System.out.println("제 국어 점수는 " + koreanScore + "입니다.");
		
		
		byte scienceScore;  //4
		
		scienceScore = 70;
		
		System.out.println("제 과학 점수는 " +scienceScore + "입니다.");
		
		byte age;  //5
		
		age = 27;
		
		System.out.println("제 나이는 "+age+"살 입니다.");
		
		byte month;  //6
		
		month = 7;
		
		System.out.println("지금은 "+month + "월 입니다.");

		byte myDog;  //7
		
		myDog = 1;
		
		System.out.println("제가 키우는 강아지는 " + myDog + "마리입니다.");
		
		
		byte myCat;  //8
		
		myCat = 2;
		
		System.out.println("제가 키우는 고양이는 " + myCat + "마리입니다.");
		
		
		byte myHamster;  //9
		
		myHamster = 1;
		
		System.out.println("제가 키우는 햄스터는 " + myHamster + "마리입니다.");
		
		
		byte temperature;   //10
		
		temperature = 30;
		
		System.out.println("지금 온도는 " + temperature + "도 입니다.");
	
		
		
		
		//short
		short myMoney;  //1
		
		myMoney = 32767;
		
		System.out.println("제 지갑에는 " + myMoney + "원이 있습니다.");
		
		
		short tourist;  //2
		
		tourist = 12455;
		
		System.out.println("오늘 방문한 관광객은 총 " + tourist + "명입니다.");
		
	
		short classStudent;  //3
		
		classStudent = 30;
		
		System.out.println("이 학급에는 총 " + classStudent+ "명이 있습니다.");
		
		short level;  //4
		
		level = 350;
		
		System.out.println("현재 게임 레벨은 " + level + "입니다.");
		
		
		short cookiePrice;  //5
		
		cookiePrice = 5000;
		
		System.out.println("이 과자는 " + cookiePrice + "원 입니다.");
		
		
		short year;  //6
		
		year = 2023;
		
		System.out.println("올해 연도는 " + year + "년도 입니다.");
		
		short nextYear;  //7
		
		nextYear = 2024;
		
		System.out.println("내년 연도는 " + nextYear + "년도 입니다.");
		
		
		short quantity;  //8
		
		quantity = 190;
		
		System.out.println("상품 수량은 "+ quantity + "개입니다.");
		
		short members;  //9
		
		members = 200;
		
		System.out.println("모임 회원수는 " + members + "명입니다.");
		
		short pages;  //10
		
		pages = 1024;
		
		System.out.println("페이지 수는 총 " + pages + "장 입니다.");
		
		
		
		//int
		
		int baseballFans;  //1
		
		baseballFans = 43232;
		
		System.out.println("야구 관중은 총 " + baseballFans + "명이다.");
		
		int footballFans;  //2
		
		footballFans = 32768;
		
		System.out.println("축구 관중은 총 " + footballFans + "명이다.");
		
		int basketballFan;  //3
		
		basketballFan = 41353;
		
		System.out.println("농구 관중은 총 " + basketballFan + "명이다.");
		
		
		int seoulPopulation;  //4
		
		seoulPopulation = 650000;
		
		System.out.println("서울 인구 수는 대략 " +seoulPopulation +"명이다.");
		
		int koreaPopulation;  //5
		
		koreaPopulation = 51550000;
		
		System.out.println("대한민국 인구 수는 대략 " + koreaPopulation + "명이다.");
		
		int gymMember;  //6
		
		gymMember = 42353;
		
		System.out.println("헬스장 회원 수는 " + gymMember + "명입니다.");
		
		int accountBalance;  //7
		
		accountBalance = 2943029;
		
		System.out.println("현재 통장 잔고에는 " + accountBalance + "원이 있습니다.");
		
		
		int clothingPrice;  //8
		
		clothingPrice = 165442;
		
		System.out.println("이 옷의 가격은 " + clothingPrice + "원입니다.");
		
		int phonePrice;  //9
		
		phonePrice = 2000000;
		
		System.out.println("핸드폰 가격은 " + phonePrice + "원입니다.");
		
		int bagPrice;   //10
		
		bagPrice = 3000000;
		
		System.out.println("가방의 가격은 " + bagPrice + "원입니다.");
		
		
		// long
		
		long globalPopulation;  //1
		
		globalPopulation = 8000000000L;
		
		System.out.println("전세계 인구 수는 대략 " + globalPopulation + "명입니다." );
		
		long indiaPopulation;  //2
		
		indiaPopulation = 1400000000L;
		
		System.out.println("나라 인도의 인구 수는 대략 " + indiaPopulation + "명입니다.");
		
		long usaPopulation;  //3
		
		usaPopulation = 300000000L;
		
		System.out.println("미국 인구 수는 대략 " + usaPopulation + "명입니다.");
		
		
		long bookPages;  //4
		
		bookPages = 2521898023L;
		
		System.out.println("이 책의 페이지 수는 " + bookPages + "장입니다.");
		
		
		long salesVolume;  //5
		
		salesVolume = 3234872312L;
		
		System.out.println("제품의 누적 판매량은 총 " + salesVolume + "개입니다.");
		
		long jackpotAmount;  //6
		
		jackpotAmount = 5930215331L;
		
		System.out.println("복권 당첨 금액은 " + jackpotAmount + "원입니다");
		
		
		long rainbow; //7
		
		rainbow = 7;
		
		System.out.println("무지개 색은" + rainbow + "개입니다.");
		
		
		long phone; //8
		
		phone = 8;
		
		System.out.println("내 핸드폰 기종은 아이폰" + phone + "이다");
				
				
		
		long volume; //9
		
		volume = 100;
		
		System.out.println("현재 소리 크기는 " + volume + "입니다.");
		
		long day; //10
		
		day = 365;
		
		System.out.println("1년은 " + day + "일입니다.");
		
		
		
		
		//float
		
		float temperature2;  //1
		
		temperature2 = 36.5F;
		
		System.out.println("지금 온도가" + temperature2 + "입니다.");
		
		float mathAvg;  //2
		
		mathAvg = 89.31F;
		
		System.out.println("수학시험 평균 점수는" + mathAvg + "입니다.");
		
		float englishAvg;  //3
		
		englishAvg = 81.65F;
		
		System.out.println("영어시험 평균 점수는" + englishAvg + "입니다.");
		
		float koreanAvg; //4
		
		koreanAvg = 78.03F;
		
		System.out.println("국어시험 평균 점수는" + koreanAvg + "입니다.");
		
		float artAvg; //5
		
		artAvg = 92.12F;
		
		System.out.println("미술시험 평균 점수는 " + artAvg + "입니다.");
		
		float scienceAvg; //6
		
		scienceAvg = 76.23F; 
		
		System.out.println("과학시험 평균 점수는" + scienceAvg + "입니다.");
		
		float socialAvg; //7
		
		socialAvg = 92.76F;
		
		System.out.println("사회시험 평균 점수는" + socialAvg + "입니다");
		
		float myWeight2; //8
		
		myWeight2 = 76.43F;
		
		System.out.println("제 몸무게는 " + myWeight + "입니다.");
		
		float myHeight; //9
		
		myHeight = 190.23F; //10
		
		System.out.println("제 키는 " + myHeight + "입니다." );
		
		
		//double
		
		
		double distance; //1
		
		distance = 5.32;
		
		System.out.println("친구 집과 내 집 거리는 " + distance + "km 입니다.");
		
		double pi;  //2
		
		pi = 3.14;
		System.out.println("원주율은 약 " + pi + "입니다.");
		
		double dogWeight; //3
		
		dogWeight = 9.32;
		
		System.out.println("강아지의 몸무게는 " + dogWeight + "입니다");
		
		double catWeight; //4
		
		catWeight = 7.61;
		
		System.out.println("고양이의 몸무게는 " + catWeight + "입니다");
		
		double hamsterWeight; //5
		
		hamsterWeight = 3.12;
		
		System.out.println("햄스터의 몸무게는 " + hamsterWeight + "입니다.");
		
		double ageAvg; //6
		
		ageAvg = 25.32;
		
		System.out.println("이 모임의 평균 나이는 " + ageAvg + "입니다.");
		
		double gradeAvg; //7
		
		gradeAvg = 4.12;
		
		System.out.println("평균 학점은 " + gradeAvg + "입니다." );
		
		double file; //8
		
		file = 5.28;
		
		System.out.println("파일 크기는" + file + "KB입니다.");
		
		double heightAvg; //9

		heightAvg = 175.21;
		
		System.out.println("학급의 평균 키는" + heightAvg + "cm입니다.");
		
		
		double friendWeight; //10
		
		friendWeight = 45.2;
		
		System.out.println("친구의 몸무게는" + friendWeight + "kg입니다.");
		
		
		//char 
		
		char grade; //1
		
		grade = 'A';
		
		System.out.println("학점은 " + grade + "입니다.");
		
		char lastName; //2
		
		lastName = '이';
		
		System.out.println("제 성은 "+ lastName + "입니다");

		
		char alphabet; //3
		
		alphabet = 'A';
				
		System.out.println("알파벳 첫 글자는 " + alphabet + "입니다.");
		
		
		char rank1; //4
		
		rank1 = '일';
		
		System.out.println("ssg랜더스는 " + rank1 + "등입니다.");
		
		char rank2; //5
		
		rank2 = '이';
		
		System.out.println("두산베어스는 " + rank2 +"등입니다.");
		
		
		char day1; //6
		
		day1 = '월';
		
		System.out.println("일주일 중 가장 첫번째 요일은 " + day1 + "요일 입니다.");
		
		
		char day2; //7
		
		day2 = '화';
		
		System.out.println("일주일 중 두 번째 요일은 " + day2 + "요일 입니다.");
		
		
		char backNumber; //8
		
		backNumber = '7';
				
		System.out.println("제 유니폼 등번호는 " + backNumber + "입니다");
		
		char number;  //9
		
		number = '0'; 
		
		System.out.println("제가 좋아하는 숫자는 " + number + "입니다");
		
		char food; //10
		
		food = '빵';
		
		System.out.println("제가 좋아하는 음식은 " + food + "입니다.");
		
		
		//String
		
		
		String name;  //1
		
		name = "이슬아";
				
		System.out.println("제 이름은" + name + "입니다.");
		
		String sports; //2
		
		sports = "야구"; 
		
		System.out.println("제가 좋아하는 스포츠는 " + sports + "입니다.");
		
		String sportsTeam; //3
				
		sportsTeam = "SSG랜더스"; 
		
		System.out.println("제가 좋아하는 야구팀은" + sportsTeam + "입니다.");
	
		String singer; //4
		
		singer = "데이식스";
		
		System.out.println("제가 좋아하는 가수는" + singer + "입니다");
		
				
		String color;  //5
		
		color = "파란색";
		
		System.out.println("제가 좋아하는 색깔은 " + color + "입니다.");
		
		String food2;  //6
		
		food2 = "간장게장";
		
		System.out.println("제가 좋아하는 음식은 " + food2 + "입니다.");
		
		String coffee;  //7
		
		coffee = "라떼";
				
		System.out.println("제가 좋아하는 커피는 " + coffee +"입니다.");
		
		String fruit; //8
		
		fruit = "오렌지";
		
		System.out.println("제가 좋아하는 과일은 " + fruit + "입니다.");
		
		String season; //9
		
		season = "가을";
		
		System.out.println("제가 좋아하는 계절은 " + season + "입니다.");
		
		String mbti; //10
		
		mbti = "isfp";
		
		System.out.println("제 mbti는 " + mbti + "입니다");
		
	
		
		//boolean
		
		boolean age2; //1
		
		age2 = true;
		
		System.out.println("그녀의 나이는 20대 이다: " + age2 );
		
		
		boolean age3; //2
		
		age3 = false;
		
		System.out.println("그녀의 나이는 20대 이다: " + age3 );
		
		
		boolean gameScore1; //3
		
		gameScore1 = true;
		
		System.out.println("오늘 경기 결과는 승리하였다: " + gameScore1 );
		
		boolean gameScore2; //4
		
		gameScore2 = false;
		
		System.out.println("오늘 경기 결과는 승리하였다: " + gameScore1 );
		
		boolean month1;  //5
		
		month1 = true;
		
		System.out.println("6월은 여름이다: " + month1);
		
		boolean month2;  //6
		
		month2 = false;
		
		System.out.println("1월은 가을이다: " + month2);
		
		boolean month3; //7
		
		month3 = true;
		
		System.out.println("12월은 겨울이다: " + month3);
		
		boolean month4; //8
		
		month4 = true;
		
		System.out.println("3월은 봄이다: " + month4);
		
		boolean apple; //9
		
		apple = true;
		
		System.out.println("사과는 과일이다: " + apple);
		
		boolean tomato; //10
		
		tomato = false;
		
		System.out.println("토마토는 과일이다: " + tomato);
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		

	}

}
