package com.game.rps;

public class Winner {

public void compareInputs(String computerInput , String userInput){
		
		if (userInput.equals("Rock")){
			if(computerInput.equals("Rock")){
				System.out.println("Tie");
			}
			if(computerInput.equals("Paper")){
				System.out.println("Computer Wins");
			}
			if(computerInput.equals("Scissor")){
				System.out.println("User Wins");
			}
		}
		
		if (userInput.equals("Paper")){
			if(computerInput.equals("Paper")){
				System.out.println("Tie");
			}
			if(computerInput.equals("Rock")){
				System.out.println("User Wins");
			}
			if(computerInput.equals("Scissor")){
				System.out.println("Computer Wins");
			}
		}
		
		if (userInput.equals("Scissor")){
			if(computerInput.equals("Scissor")){
				System.out.println("Tie");
			}
			if(computerInput.equals("Paper")){
				System.out.println("User Wins");
			}
			if(computerInput.equals("Rock")){
				System.out.println("Computer Wins");
			}
		}
	}
}
