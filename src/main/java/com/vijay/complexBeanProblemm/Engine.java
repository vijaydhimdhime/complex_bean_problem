package com.vijay.complexBeanProblemm;

public class Engine {
	int capacity;
	int horcePower;
	String engineType;
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engine(int capacity, int horcePower, String engineType) {
		super();
		this.capacity = capacity;
		this.horcePower = horcePower;
		this.engineType = engineType;
	}
	
	public int getCapacity() {
		return capacity;
	}
	public Engine(String engineType) {
	super();
	this.engineType = engineType;
}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getHorcePower() {
		return horcePower;
	}
	public void setHorcePower(int horcePower) {
		this.horcePower = horcePower;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", horcePower=" + horcePower + ", engineType=" + engineType + "]";
	}
	
	
	
}
