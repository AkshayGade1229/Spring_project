package com.jut.Spring_IOC_1;

public class Employee {

	private int id;
	private String name;
	private int sal;
	private String Ads;
	public Employee(){}
	public Employee(int id, String name, int sal, String ads) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		Ads = ads;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getAds() {
		return Ads;
	}
	public void setAds(String ads) {
		Ads = ads;
	}
	
	

	
}
