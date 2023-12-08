package com.mkpits.typecasting;

public class ObjectToPrimitive 
{

	public static void main(String[] args) 
	{
	   String name="20.10";
	   int num=(int)Float.parseFloat(name);
	   System.out.println(num);
      StringtoFloat();
	}
	
	public static void StringtoFloat()
	{
		String name="20.10";
		   float n1 =Float.parseFloat(name);
		   System.out.println(n1);
		   
		   stringInt();

	}
	
	public static void stringInt() 
	{
		int x=90, y=80;
		int output=Integer.compare(x, y);
		System.out.println(output);
		
		
		String str1="10";
		String str2="23";
		
		int num1=Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);
		
		System.out.println(str1+str2);
		
		String input1="10.10";
		String input2="20.20";
		
		float f1=Float.parseFloat(input1);
		float f2=Float.parseFloat(input2);
		
		System.out.println(f1+f2);
		
		
		
	}
	}


