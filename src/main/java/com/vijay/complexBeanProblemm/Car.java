package com.vijay.complexBeanProblemm;

public class Car {
	String carName;
	String carType;
	Engine engine;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String carName, String carType, Engine engine) {
		super();
		this.carName = carName;
		this.carType = carType;
		this.engine = engine;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carType=" + carType + ", engine=" + engine + "]";
	}
	
	
	
	

}
