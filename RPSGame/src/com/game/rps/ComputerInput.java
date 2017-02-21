package com.game.rps;

import java.util.Random;

public class ComputerInput {

	public String getComputerInput(){
		String[] inputArray = {"Rock" , "Paper" , "Scissor"};
		Random generator = new Random();
		int randomIndex = generator.nextInt(inputArray.length) ;
		return inputArray[randomIndex];
	}
}
