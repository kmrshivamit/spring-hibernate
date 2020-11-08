package com.luv2code.springdemo;
import com.luv2code.springdemo.Coach;

public class CricketCoach implements Coach {
 private String emailAddress;
 private String team;
 
	public String getEmailAddress() {
	return emailAddress;
}

public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}

public String getTeam() {
	return team;
}

public void setTeam(String team) {
	this.team = team;
}

	//create a no-arg constructor
	public CricketCoach()
 {
	 System.out.println("CricketCoach: inside no-arg constructor");
 }private FortuneService fortuneService;
//our setter method
	public void setFortuneService(FortuneService fortuneService)
	{        System.out.println("CricketCoach: inside setter method-setFortuneService");
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bolling ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
