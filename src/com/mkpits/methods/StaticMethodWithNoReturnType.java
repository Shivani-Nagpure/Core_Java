package com.mkpits.methods;

public class StaticMethodWithNoReturnType 
{
 //Static Method
	public static void main(String[] args) 
	
	{
       //Direct Access/call
		getData();
		
	  //call using classname
		StaticMethodWithNoReturnType.getData();
		
	//using Object Reference/Instance of Class
		
		StaticMethodWithNoReturnType obj=new StaticMethodWithNoReturnType();
		obj.getData();
				
		
		
	}
	
	public static void getData()
	{
		String name="Shivani";
		System.out.println(name);
	
	}

}
