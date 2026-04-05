package com.kh.model;

import java.util.ArrayList;

public class JDDAO {
		private ArrayList<JDDTO> list = new ArrayList<>();
		//private int nextNum; // 미리 넣은 데이터가 1,2,3이니까 4부터 시작함.
		
		public JDDAO() {
	        list.add(new JDDTO(1, "생성자", "클래스로부터 객체를 생성할 때 자동으로 호출되는 특수한 메서드."));
	        list.add(new JDDTO(2, "메서드", "클래스 안에 정의된 동작(기능). 특정 작업을 수행하는 코드 블록."));
	        list.add(new JDDTO(3, "클래스", "객체를 만들기 위한 설계도. 필드, 생성자, 메서드를 포함하는 코드 블록."));
	    }
		
		
		public void jdCreate(JDDTO dto) {
		    int nextNum = list.size() + 1;   // 1) 먼저 순번 계산
		    dto.setNum(nextNum);             // 2) 계산한 순번을 dto에 넣기
		    list.add(dto);                   // 3) list에 추가
		}
		
		
		public ArrayList<JDDTO> jdReadAll() {
		    return list;
		}
		
		
		public void jdUpdate(int num, String name, String meaning) {
		    for (int i = 0; i < list.size(); i++) {
		        if (list.get(i).getNum() == num) {
		            list.get(i).setName(name);
		            list.get(i).setMeaning(meaning);
		            return;
		        }
		    }
		}
		
		
		public void jdDelete(int num) {
		    for (int i = 0; i < list.size(); i++) {
		        if (list.get(i).getNum() == num) {
		            list.remove(i);
		            return;
		        }
		    }
		}
		
		
		public JDDTO jdGetByName(String name) {
		    for (JDDTO dto : list) {
		        if (dto.getName().equals(name)) {
		            return dto;
		        }
		    }
		    return null;
		}

}
