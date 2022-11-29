package com.simpli;

public class BasicArithmatic 
{
	public int addNumbers(int first,int second)
	{
		int sum=first+second;
		return sum;
	}
	
	public int subtractNumbers(int minuend,int subtrahend)
	{
		int difference=minuend-subtrahend;
		System.out.println(difference);
		return difference;
		
	}
	public int multiplication(int x,int y )
	{
		int result=x*y;
		return result;
		
	}
	
	//number which is getting divided here is called the dividend
	//number which divides a given number is the divisor
	// number which we get as a result is known as the quotient
	//The divisor which does not divide a number completely 
	//produces a number, which is referred to as remainder
	public double divide(int dividend,int divisor)
	{
		
		int quotient;
		int remainder;
		int temp;
		quotient=dividend/divisor;
		remainder=dividend%divisor;
		do{
			if(remainder!=0)
			{
				if(remainder<10)
				{
				temp=Math.floorDiv((remainder+10), divisor);
				//remainder=
				System.out.println(temp);
				System.out.println("testing git");
				break;
				}
				else 
					break;
			}
			
		}while(remainder>0);

			
		int x=Math.floorDiv(dividend, divisor);
		System.out.println(x);
		return quotient;
		
	}




}
