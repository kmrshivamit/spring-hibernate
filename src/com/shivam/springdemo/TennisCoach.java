package com.shivam.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component//("thatSillyCoach")
//@Scope("prototype")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	 
	//define a default constuctor
	
	public TennisCoach()
	{
		System.out.println("Tennis Coach:"
				+ " Inside default constructor");
		
	}
	
	//define my init method
	
//	@PostConstruct
//	    public void doMyStarupStuff()
//	    {
//	    	System.out.println( ">>"
//	    			+ "TennisCoach: inside of doMyStartupStuff() ");
//	    	
//	    	
//	    }
//	// define my destroy method
//		@PreDestroy
//		public void doMyCleanupStuff() {
//			System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");		
//		}
//	
//	
	//define my destroy method

	//	
	@Autowired
	public void doSomeCrezyStuff(FortuneService theFortueService)
	{
		fortuneService =theFortueService;
		System.out.println(">> TennisCoach: inside doSomeCrezyStuff() method");
		fortuneService=theFortueService;
	}
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService=theFortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {		
		return "practice your backhand volley";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated  method stub
		return fortuneService.getFortune();
	}

}
