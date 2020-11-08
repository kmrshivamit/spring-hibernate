package com.luv2code.springdemo;

public class TrackCoach implements Coach {
private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
	super();
	this.fortuneService = fortuneService;
}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	public TrackCoach() {
		super();
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it"+fortuneService.getFortune();
	}
//add an init method
	public void doMyStartupStaff()
	{System.out.println("TrackCoach: indisde method doMyStartup Stuff");
	
		
	}
	//add a destroy method
	public void doMyCleanupStuffYoYo()
	{
		System.out.println("TrackCoach: Inside method doMyStartupStaff");		
	}
}
