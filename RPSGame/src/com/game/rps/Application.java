package com.game.rps;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
	
	
	public static void main(String[] args){
		
		System.out.println("Lets play Rock Paper Scissor !!");
		UserInput usrInput = new UserInput();
		ComputerInput compInput = new ComputerInput();
		Winner win = new Winner();
		String ans = "Y";
		BufferedReader br = null ;
	//	do{
			
			String userInput = usrInput.enterUserInput();
			String computerInput = compInput.getComputerInput();
			System.out.println("Computer Input is " + computerInput);
			win.compareInputs(computerInput, userInput);
			
//			try {
//				br = new BufferedReader(new InputStreamReader(System.in));
//				System.out.println("Do you wish to continue (Y/N) ? ");
//				ans = br.readLine();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}finally{
//				if(br != null){
//					try {
//						br.close();
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		}while(ans.equals("Y") || ans.equals("y"));
	
	}

}
