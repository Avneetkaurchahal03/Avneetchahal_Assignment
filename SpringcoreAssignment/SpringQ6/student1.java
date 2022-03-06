package com.avneet;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
@Service
public class student1 {
	private String name;
	private long regNo;
	
	
	public student1() {
		
	}
	public student1(String name, long regNo) {
		super();
		this.name = name;
		this.regNo = regNo;
	
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRegNo() {
		return regNo;
	}
	public void setRegNo(long regNo) {
		this.regNo = regNo;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", regNo=" + regNo + "]";
	}
	
}

