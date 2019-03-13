package com.xworkz.spring.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.beans.Triangle;

public class MainTest {

	public static void main(String[] args) {

		ApplicationContext app = new ClassPathXmlApplicationContext("resource/context.xml");
		Triangle tr = app.getBean(Triangle.class);
		tr.draw();
	}

}
