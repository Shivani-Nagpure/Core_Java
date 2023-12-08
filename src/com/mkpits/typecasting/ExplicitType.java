package com.mkpits.typecasting;

public class ExplicitType 
{

	public static void main(String[] args)
	{
		short n1=20;
		short n2=20;
		
	short n3=(short)(n1+n2);
	System.out.println(n3);
	
	getStringtoFloat();
    
	}
	
	public static void getStringtoFloat()
	{
		String price="40.10";
		
		float f1=Float.parseFloat(price);
		System.out.println(f1);
		
	}
	
	
	

}
