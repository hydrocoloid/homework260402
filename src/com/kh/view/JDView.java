package com.kh.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.controller.JDController;

public class JDView {
	
	JDController ctrl = new JDController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		while(true) {
		System.out.println("자바사전에 오신 것을 환영합니다.");
		System.out.println("1. 사전 추가하기");
		System.out.println("2. 사전 전체 보기");
		System.out.println("3. 사전 수정하기");
		System.out.println("4. 사전 삭제하기");
		System.out.println("0. 자바 사전 종료");
		System.out.print("원하시는 메뉴 번호를 입력해주세요 > ");
		
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
			default: System.out.println("메뉴 번호를 입력해주세요.");
				break;
			}
		} catch(InputMismatchException e){
			System.out.println("🚨⚠🚨⚠️🚨⚠️🚨⚠️🚨⚠️🚨⚠️🚨⚠️🚨⚠️");
			System.out.println("메뉴 번호를 아라비아 숫자로 입력해주세요.");
			System.out.println("⚠️🚨⚠️🚨⚠️🚨⚠️🚨⚠️🚨⚠️🚨⚠️🚨⚠️🚨");
			sc.nextLine();
			}
		}
	}
	
	
	public void jdCreate() {
		
	}
	
	
	public void jdReadAll() {
		
	}

	
	public void jdUpdate() {
	
	}

	
	public void jdDelete() {
	
	}

	
	

}
