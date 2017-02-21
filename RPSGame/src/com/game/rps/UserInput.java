package com.game.rps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

	public String enterUserInput(){
		
		BufferedReader br = null ;
		String input = null ;
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter the data Rock or Paper or Scissor :");
			input = br.readLine();
			System.out.println("Input from User is " + input );
			System.out.println("\n");
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(br != null){
				try{
					br.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		return input;
	}
	
}
