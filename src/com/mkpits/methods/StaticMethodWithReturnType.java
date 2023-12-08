package com.mkpits.methods;

public class StaticMethodWithReturnType
{

	
	
	
	public static void main(String[] args) 
	{
		//Direct Access
		System.out.println(getDetails());
	
		//call using classname
		System.out.println(StaticMethodWithReturnType.getDetails());
		
		//using Object Reference/Instance of Class
		StaticMethodWithReturnType name=new StaticMethodWithReturnType();
		name.getDetails();
	

	}
	
	
	public static String getDetails()
	{
		String name="Shivani";
		return name;
	}
	

	

}
