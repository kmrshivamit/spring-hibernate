  package com.shivam.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load springg config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach=context.getBean("tennisCoach",Coach.class)
				;
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
		
		boolean result=(theCoach==alphaCoach);
		  
		//printt out the results
		System.out.println("\nPointing to the same object:"+result);
		System.out.println("\n Memory location for thecoach"+theCoach);
		System.out.println("\n Memory location for alphacoach"+alphaCoach+"\n"  );
		//Close the context
		context.close();
		
	}
}
