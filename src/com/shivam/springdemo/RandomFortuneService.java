package com.shivam.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
private String[] data= {
		"Bewre of the wolf in sheep's cloth",
		"Diligenence is the mother of good luck",
		"The journey is the reward"
};   
//create a random number generator
private Random myRandom=new Random();

	@Override
	public String getFortune() {
		//pick a random string from the array 
		int index=myRandom.nextInt(data.length);
		String theFortune=data[index];  
		return theFortune;
		
	}
 
}
