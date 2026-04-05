package com.kh.model;

import java.util.ArrayList;

public class JDService {
	
	private JDDAO dao = new JDDAO();
	
	public void jdCreate(JDDTO dto) {
	    dao.jdCreate(dto);
	}
	
	public ArrayList<JDDTO> jdReadAll() {
	    return dao.jdReadAll();
	}
	
	public void jdUpdate(int num, String name, String meaning) {
		dao.jdUpdate(num, name, meaning);
	}
	
	public void jdDelete(int num) {
	    dao.jdDelete(num);
	}
	
	public JDDTO jdGetByName(String name) {
		return dao.jdGetByName(name);
	}
	

}
