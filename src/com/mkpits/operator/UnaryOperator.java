package com.mkpits.operator;

public class UnaryOperator 
{

	public static void main(String[] args)
	{
		getIncrement();
		getDecrement();
	}

	

	private static void getIncrement() 
	{
		int a=10;
		System.out.println(a++);
		
	    System.out.println(a++);
	    
	    System.out.println(a++);
	    
	    System.out.println(++a);
	    
	    System.out.println(a++);
	    
	    System.out.println(a++);
		
		
		
	}

	private static void getDecrement() 
	{
		
		int a=10;
		System.out.println(a--);
		
	    System.out.println(a--);
	    
	    System.out.println(a--);
	    
	    System.out.println(--a);
	    
	    System.out.println(a--);
	    
	    System.out.println(a--);
		
		
	}
}
