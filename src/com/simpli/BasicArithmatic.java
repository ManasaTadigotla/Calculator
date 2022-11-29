package com.simpli;

public class BasicArithmatic 
{
	public float addNumbers(float first,float second)
	{
		float sum=first+second;
		return sum;
	}
	
	public float subtractNumbers(Float minuend,Float subtrahend)
	{
		float difference=minuend-subtrahend;
		System.out.println(difference);
		return difference;
		
	}
	public float multiplication(float x,float y )
	{
		float result=x*y;
		return result;
		
	}
	
	//number which is getting divided here is called the dividend
	//number which divides a given number is the divisor
	// number which we get as a result is known as the quotient
	//The divisor which does not divide a number completely 
	//produces a number, which is referred to as remainder
	public float divide(int dividend,int divisor)
	{
		int count=0;
		int quotient;
		int remainder;
		float result;
		int temp=0;
		int decimalValue=0;
		quotient=dividend/divisor;
		remainder=dividend%divisor;
		do{
			if(remainder!=0)
			{
								
				temp=Math.floorDiv((remainder*10), divisor);				
				remainder=(remainder*10)%divisor;
				//count++;
				decimalValue=(decimalValue*10)+temp;
				
				count++;
				System.out.println(temp);
							
					
			}
			
		}while(remainder>0 &&count<5);
		System.out.println(quotient+"."+decimalValue);
		result=Float.parseFloat((quotient+"."+decimalValue));
		System.out.println(result);
		return result;	
		
	}




}
