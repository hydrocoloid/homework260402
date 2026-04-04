package com.kh.model;

public class JDDTO {
	private Integer num;
	private String name;
	private String meaning;
	
	public JDDTO() {
	}

	public JDDTO(Integer num, String name, String meaning) {
		this.num = num;
		this.name = name;
		this.meaning = meaning;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	
	
	

}
