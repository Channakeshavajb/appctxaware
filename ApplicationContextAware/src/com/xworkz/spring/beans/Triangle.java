package com.xworkz.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements  ApplicationContextAware, BeanNameAware {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	private ApplicationContext context =null;
	
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}
	
	public void draw() {
		System.out.println("PointA is:\t"+pointA.getX()+","+pointA.getY());
		System.out.println("PointA is:\t"+pointB.getX()+","+pointB.getY());
		System.out.println("PointA is:\t"+pointC.getX()+","+pointC.getY());
		System.out.println("PointA is:\t"+pointC.getX()+","+pointD.getY());
	}
	
	
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
		
	}
	@Override
	public void setBeanName(String beanName) {
		
		System.out.println("name of the bean:\t"+beanName);
	}
	
}
