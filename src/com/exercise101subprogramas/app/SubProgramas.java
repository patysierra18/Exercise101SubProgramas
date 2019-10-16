package com.exercise101subprogramas.app;

import java.util.Scanner;

public class SubProgramas 
{

	public static void main(String[] args) 
	{
		//Variables declaration
		int num1=0;
		int num2=0;
		int result=0;
		
		//Objetcs declaration
		Scanner input= new Scanner(System.in);
		
		System.out.println(ShowTunnedMessage("Ale"));
		
		ShowMessage();
		
		//		System.out.println("Input a number:");
		num1= input.nextInt();
		
		System.out.println("Input another number");
		num2= input.nextInt();
		
		result=num1+num2;
		
		System.out.println("Result is:" +result);
		
	}
	//Methods to ask number
	public static void ShowMessage()
	{
		System.out.println("Input a number:");
	}
	
	//Methods to show a tunned message
		public static String ShowTunnedMessage(String message)
		{
			return "Hola " + message;
		}
	
	//Method to add numbers
		public int AddNumbers(int num1, int num2)
		{
			return num1+num2;
		}
}
