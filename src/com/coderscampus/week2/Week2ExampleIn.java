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
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in Your Name:");
		String name = scanner.nextLine();
		System.out.println("Type in Your Age:");
		String age = scanner.nextLine();
		
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Type a number between 50 and 300");
		//String userInput = scanner.nextLine();
		//Integer convertedInput = Integer.parseInt(userInput);
		
			//if (convertedInput >= 50 && convertedInput <= 300)	{
			//	System.out.println("Yes!");
			//} else if (convertedInput < 50) {
			//	System.out.println("No!");
			//} else if (convertedInput > 300) { 
			//	System.out.println("No!");
			//} 
			
		if (name.equals("Trevor") 
				&& age.equals("36")
				|| name.equals("TJ")) {
			System.out.println("Holy cow it's me!");
		} else {
			System.out.println("Hello: " + name);
		}
		
		scanner.close();
	}
}
