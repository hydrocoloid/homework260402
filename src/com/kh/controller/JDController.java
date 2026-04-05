package com.kh.controller;

import java.util.ArrayList;
import com.kh.model.JDDTO;
import com.kh.model.JDService;

public class JDController {
	
private JDService svc = new JDService();
	
	public void jdCreate(JDDTO dto) {
		svc.jdCreate(dto);
	}
	
	public ArrayList<JDDTO> jdReadAll() {
	    return svc.jdReadAll();
	}
	
	public void jdUpdate(int num, String name, String meaning) {
		svc.jdUpdate(num, name, meaning);
	}
	
	public void jdDelete(int num) {
		svc.jdDelete(num);
	}
	
	public JDDTO jdGetByName(String name) {
		return svc.jdGetByName(name);
	}

}
