package com.kh.model;

import java.util.ArrayList;

public class JDDAO {
	
		private ArrayList<JDDTO> list = new ArrayList<>();
		
		public JDDAO() {
	        list.add(new JDDTO(1, "생성자", "클래스로부터 객체를 생성할 때 자동으로 호출되는 특수한 메서드."));
	        list.add(new JDDTO(2, "메서드", "클래스 안에 정의된 동작(기능). 특정 작업을 수행하는 코드 블록."));
	        list.add(new JDDTO(3, "클래스", "객체를 만들기 위한 설계도. 필드, 생성자, 메서드를 포함하는 코드 블록."));
	    }
	
		public void jdCreate(JDDTO dto) {
		    list.add(dto);
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

}
