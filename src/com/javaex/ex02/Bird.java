package com.javaex.ex02;

public abstract class Bird {
	//필드
    private String name;

    //기본생성자(생략)

	//메소드-getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void fly();
	
	public abstract void sing();
	
	public abstract void showName();
   
}
