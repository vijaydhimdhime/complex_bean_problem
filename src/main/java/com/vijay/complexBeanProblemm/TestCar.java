package com.vijay.complexBeanProblemm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanComplexProblem.xml");
		Car car = (Car)context.getBean("car");
		System.out.println("car :"+car);
		Car car1 = (Car)context.getBean("car");
		System.out.println("car1 :"+car1);
		//System.out.println("Car : "+car);
		System.out.println(car == car1);
		System.out.println(car.getEngine() == car1.getEngine());
	}

}
