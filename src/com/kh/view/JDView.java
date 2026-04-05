package com.kh.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.kh.controller.JDController;
import com.kh.model.JDDTO;

public class JDView {
	JDController ctrl = new JDController();
	Scanner sc = new Scanner(System.in);
	
	
	public void mainMenu() {
		while(true) {
		System.out.println("📖자바사전에 오신 것을 환영합니다.🔎");
		System.out.println("1. 사전 추가하기");
		System.out.println("2. 사전 전체 보기");
		System.out.println("3. 사전 수정하기");
		System.out.println("4. 사전 삭제하기");
		System.out.println("0. 자바 사전 종료");
		System.out.print("📖원하시는 메뉴 번호를 입력해주세요🔢 > ");
		
		try {
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num){
			case 0: System.out.println("자바사전을 종료합니다."); sc.close();
				return;
			case 1: jdCreate();
				break;
			case 2: jdReadAll();
				break;
			case 3:	jdUpdate();
				break;
			case 4:	jdDelete();
				break;
			default: System.out.println("정확한 메뉴 번호를 입력해주세요.");
				break;
			}
		} catch(InputMismatchException e){
			System.out.println();
			System.out.println("🚨⚠메뉴 번호를 아라비아 숫자로 입력해주세요.⚠🚨");
			System.out.println();
			sc.nextLine();
			}
		}
	}
	
	
	public void jdCreate() {
		
		System.out.println();
		System.out.println("📖사전 추가하기📝");
		
		System.out.println("추가하실 개념을 입력해주세요~");
	    System.out.print("개념명: ");
	    String name = null;
	    try {
	    name = sc.nextLine();
	    } catch (InputMismatchException e){
	    	System.out.println("입력하신 개념의 이름이 맞는지 확인해주세요.");
	    	jdCreate();
	    }
	    System.out.print("개념 정의: ");
	    String meaning = sc.nextLine();
	    
	    JDDTO dto = new JDDTO();
	    dto.setName(name);
	    dto.setMeaning(meaning);
	    
	    ctrl.jdCreate(dto);  
	    System.out.println("추가 완료!");
	    System.out.println("메인 화면으로 돌아갑니다.");
	    System.out.println();
	    
	}
	
		
	public void jdReadAll() { 
		
		System.out.println();
		System.out.println("📖사전 전체 보기🔎");
		
		ArrayList<JDDTO> list = ctrl.jdReadAll();
		for(JDDTO dto : list) { // 여기가 dto 선언 + list에서 꺼낸 객체를 dto에 대입하는 곳
	        System.out.printf("순번: %d | 개념명: %s | 정의: %s%n",
	            dto.getNum(), dto.getName(), dto.getMeaning());
	    }
		
		System.out.println();
	    System.out.println("전체 조회 완료!");
	    System.out.println("메인 화면으로 돌아갑니다.");
	    System.out.println();
	    
	}
	
	
	
		
	
	public void jdUpdate() {
	
		
		
	}

	
	public void jdDelete() {
	
		System.out.println();
		System.out.println("📖사전 삭제하기🗑️");
		System.out.print("📖삭제하실 개념의 이름을 입력해주세요🗑️ > ");
		
		JDDTO dto = jdGetByName();
		if(dto == null) return; 
		
		while(true) {
		System.out.println("정말 삭제하시겠습니까?(Y/N) >");
		char choice = sc.nextLine().toUpperCase().charAt(0);

			if(choice == 'Y') {
				ctrl.jdDelete(dto.getNum());  // num을 뽑아서 전달! => 삭제
				System.out.println("삭제 완료");
				break;
			} else if(choice == 'N') { 
				System.out.println("삭제를 취소하셨습니다.");
				break;
			} else {
				System.out.println("Y나 N으로 입력해주세요!");
			}
		}
		System.out.println();
	    System.out.println("메인 화면으로 돌아갑니다.");
	    System.out.println();
	}

	
	public JDDTO jdGetByName() {
		
		String name = sc.nextLine();
		JDDTO dto = ctrl.jdGetByName(name);
		
		if(dto == null) {
		    System.out.println();
		    System.out.println("🚨사전에 없는 개념입니다.🚨");
		    System.out.println("1. 다시 입력하기");
		    System.out.println("2. 사전 전체 조회");
		    System.out.print("원하시는 메뉴 번호를 입력해주세요 > ");

		    try {
		        int subChoice = sc.nextInt();
		        sc.nextLine();

		        if(subChoice == 1) {
		            return jdGetByName();  // jdGetByName()을 다시 수행해서 얻은 값을 return
		        } else if(subChoice == 2) {
		            jdReadAll();           // 전체 조회 수행.
		            return null;
		        } else {
		            System.out.println("1 또는 2를 입력해주세요.");
		            return null;
		        }

		    } catch(InputMismatchException e) {
		        System.out.println("숫자만 입력해주세요.");
		        sc.nextLine();
		        return null;
		    }
		}
		
		System.out.printf("순번: %d | 개념명: %s | 정의: %s%n",
			    dto.getNum(), dto.getName(), dto.getMeaning());
		
		return dto;
	}
	
	

}
