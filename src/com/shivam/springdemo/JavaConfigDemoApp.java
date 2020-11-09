package com.shivam.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
	public static void main(String[] args) {
		//read spring java class
AnnotationConfigApplicationContext context=
new AnnotationConfigApplicationContext(SportConfig.class);
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
