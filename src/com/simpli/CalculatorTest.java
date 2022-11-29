package com.simpli;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorTest 
{

	public static void main(String[] args)
	{
		int choice=0;
		char continueInput;		
			
		BasicArithmatic calculator;
		Scanner userInput=new Scanner(System.in);
		do
			{
			System.out.println("Calculator:Select from below");
			System.out.println("1.Addition"+"\n"+"2.Subtraction"+"\n"+"3.Multiplication"+"\n"+"4.Division"+"\n"+"5.Exit");
			if(userInput.hasNextInt())
			{
				choice=userInput.nextInt();
				//System.out.println(choice);
			}
			else
			{
				System.out.println("plz give proper choice (1-5)");
				choice=0;
				userInput.next();
				continue;
			}		
			
				switch(choice)
				{
				case 1:
					//double 
					float firstNumber=0;
					float secondNumber=0;
					float sum=0;
					try
					{
					System.out.println("Enter First Number");
					firstNumber=userInput.nextFloat();
					System.out.println("Enter Second Number");
					secondNumber=userInput.nextFloat();
					}
					catch (InputMismatchException ex) 
					{
						System.out.println("You should enter only numbers");
						userInput.next();
						continue;
						
					}
					calculator=new BasicArithmatic();
					sum=calculator.addNumbers(firstNumber,secondNumber);
					System.out.println("Sum is "+sum);
					break;
					
				case 2:
					float minuend=0;
					float subtrahend;
					float difference=0;
					try
					{
					System.out.println("(minuend)Enter the number which you want to subtract from:");
					minuend=userInput.nextFloat();
					System.out.println("(Subtrahend)Enter the number which you want to subtract");
					subtrahend=userInput.nextFloat();
					}
					catch(InputMismatchException ex)
					{
						System.out.println("Sorry!!You should enter only numbers.Plz try again");
						userInput.next();
						continue;
					}
					calculator=new BasicArithmatic();
					difference=calculator.subtractNumbers(minuend, subtrahend);
					System.out.println("Difference is "+difference);
					break;
					
				case 3:
					float Numberone=0;
					float Numbertwo=0;
					float total=0;
					try
					{
						System.out.println("Enter the First Number");
						Numberone=userInput.nextFloat();
						System.out.println("Enter the Second Number");
						Numbertwo=userInput.nextFloat();						
						
					}
					catch (InputMismatchException ex)
					{
						System.out.println("You should enter only  numbers.Please try again");
						userInput.nextLine();
						continue;
					
					}
					calculator=new BasicArithmatic();
					total=calculator.multiplication(Numberone, Numbertwo);
					System.out.println("The result is "+total);
					break;
				
				case 4:
					int dividend=0;
					int divisor=0;
					float quotient=0;
					
					System.out.println("Enter the dividend (dividend/divisor)");
					try
					{
					dividend=userInput.nextInt();
					System.out.println("Enter the divisor (dividend/divisor)");
					divisor=userInput.nextInt();
					}
					catch (InputMismatchException ex) 
					{
						System.out.println("You should enter only whole numbers");
						userInput.next();
						continue;
					}
					
					calculator=new BasicArithmatic();
					if(divisor>0)
					{
					quotient=calculator.divide(dividend, divisor);
					System.out.println("The Result is "+quotient);
					}
					else
					{
						System.err.println("The number can not be divided by zero");
						break;
					}
					
					break;
					
				case 5: 
					System.exit(0);
					break;
				}
				
			System.out.println("Do you want to perform another operation? Press 'y' to continue");
			if(!userInput.next().toLowerCase().contentEquals("y"))
			{
				System.out.println("Closing Calculator");
				break;
			//continueInput=userInput.next();	
			}	
			else
			{
				continue;
			}
			
			
		}while((choice>=0 && choice<6));
		//double result=calculator.divide(208,3);
		//System.out.println(result);
	}

}
