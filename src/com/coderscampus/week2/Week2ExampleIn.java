package com.coderscampus.week2;

import java.util.Scanner;

public class Week2ExampleIn {
		
	public static void main  (String[] args)  {
		
		// This is just for teaching purposes /////////
		// With respect to imports / packages   ///////
		// java.lang is by default imported for us ////
		//java.lang.String aString = "Hello World!"; //
		//String anotherString = "Another String";   //
		///////////////////////////////////////////////
		
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Type in any input:");
		//String userInput = scanner.nextLine();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number between 50 and 300");
		String userInput = scanner.nextLine();
		Integer convertedInput = Integer.parseInt(userInput);
		
			
		
			if (convertedInput >= 50 && convertedInput <= 300)	{
				System.out.println("Yes!");
			} else if (convertedInput < 50) {
				System.out.println("No!");
			} else if (convertedInput > 300) { 
				System.out.println("No!");
			} 
			
	}
}
