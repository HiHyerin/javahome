package com.sist.main;

public class Car {
	String owner;
	String level;
	String status;
	
	public Car(String status, String owner, String level) {
		this.owner = owner;
		this.level = level;
		this.status = status;
	}
	
	@Override
	public String toString() {
		return String.format("%s의 주인은 %s이고, 정도는 %s 입니다.", this.status, this.owner, this.level);
		
	}
}
