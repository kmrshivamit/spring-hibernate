package com.shivam.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	public static void main(String[] args) {
		//read spring config file
ClassPathXmlApplicationContext context=
new ClassPathXmlApplicationContext("applicationContext.xml");
		//get the beam from spring container
Coach thecoach=context.getBean("tennisCoach",Coach.class);
//call a method on the bean
System.out.println(thecoach.getDailyWorkout());
//call method to get the daily fortune
System.out.println(thecoach.getDailyFortune());
		//close the context
context.close();
	}
}
