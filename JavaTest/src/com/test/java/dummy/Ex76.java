package com.test.java.dummy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Ex76 {
	
	public static void main(String[] args) {
		
		//OpenAPI Open Application Programming Interface
		// - 공개된 프로그래밍 기능
		// - 공공 데이터 포털
		// - 구글, 아마존, 네이버, 다음 등.. > 지도
		
		
		//OpenAPI > 데이터 확보 > 전부 진짜 데이터
		
		
		m1();
		
		//m2();
	}//main

	private static void m2() {
	/*	
	 
	
	 	{
			"name" : "홍길동",
			"age" : 20,
			"tel" : ["010-1111-1111", "010-2222-2222", "010-3333-3333" ]
		};
		
		
		
		
		*/
		
		String json = "{\r\n"
				+ "			\"name\" : \"홍길동\",\r\n"
				+ "			\"age\" : 20,\r\n"
				+ "			\"tel\" : [\"010-1111-1111\", \"010-2222-2222\", \"010-3333-3333\" ]\r\n"
				+ "		}";
			
		
		org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
		try {
			
			JSONObject obj = (JSONObject)parser.parse(json);
			//System.out.println(obj);
			System.out.println(obj.get("name"));
			System.out.println(obj.get("age"));
			
			JSONArray arr = (JSONArray)obj.get("tel");
			
			for (Object t :arr) {
				System.out.println(t);
			}
			
		} catch (Exception e) {
			System.out.println("at Ex76.m2");
			e.printStackTrace();
		}
	}

	private static void m1() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("[지하철 정보 검색]");
		
		System.out.print("역 검색:");
		String name =scan.nextLine();
		
		//1. 요청 URL 만들기
		String url = "http://apis.data.go.kr/1613000/SubwayInfoService/getKwrdFndSubwaySttnList?";
		
		url += "ServiceKey=KR3zML8fqFwMSbhNWhNuz4HTnIVaLYv85yFsk4shGCx3qqqp3ct6lZiDgrFpDDjAq1cqYV7E1zIMtFAjbMeDKg%3D%3D";
		
		url += "&_type=json"; //XML or JSON
		
		url += "&numOfRows=10";
		
		url += "&pageNo=1";
		
		url += "&subwayStationName=" + URLEncoder.encode(name);
		
		//System.out.println(url);
		
		//http://apis.data.go.kr/SttnList?키=데이터&키=데이터&키=데이터
		
		//URL 객체 생성
		try {
			URL obj_url = new URL(url);
			
			
			//URL와 연결하는 객체 생성 > 브라우저 대신 접속3
			HttpURLConnection conn = (HttpURLConnection)obj_url.openConnection();
			
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Cotent-type", "application/json");
			
			BufferedReader reader = null;
			
			if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
				reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			
			//reader > 검색 결과 읽기 가능
//			String line = null;
//			
//			while ((line = reader.readLine()) != null) {
//				System.out.println(line);
//			}
			
			JSONParser parser = new JSONParser();
			
			JSONObject root = (JSONObject)parser.parse(reader);
					
			JSONObject response = (JSONObject)root.get("response");
			
			JSONObject body = (JSONObject)response.get("body");
			
			JSONObject items = (JSONObject)body.get("items");
			
			
			ArrayList<String> temp = new ArrayList<String>();
			
			if (items.get("item") instanceof JSONObject) {
				
				JSONObject item = (JSONObject)items.get("item");
				
				System.out.println("1.");
				System.out.println("역명: " + item.get("subwayStationName"));
				System.out.println("호선: " + item.get("subwayRouteName"));
				
				temp.add(item.get("subwayStationId").toString());
				
			} else {
				JSONArray arr = (JSONArray) items.get("item");
				
				int n = 1;
				
				for (Object obj : arr) {
					JSONObject item = (JSONObject) obj;
					
					System.out.println(n + ".");
					System.out.println("역명: " + item.get("subwayStationName"));
					System.out.println("호선: " + item.get("subwayRouteName"));
					System.out.println("-----------------------------");
					n++;
					
					temp.add(item.get("subwayStationId").toString());
				}
			}
					
			reader.close();
			conn.disconnect();
			
			
			System.out.print("역 선택: ");
			String sc1 = scan.nextLine();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}	
		
		
	}

}






















