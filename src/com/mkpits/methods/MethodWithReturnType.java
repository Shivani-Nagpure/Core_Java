package com.mkpits.methods;

public class MethodWithReturnType 
{
	//Only one return used in one method

	public static void main(String[] args) 
	{
       MethodWithReturnType returntype=new MethodWithReturnType();
    		   
       System.out.println( returntype.getDetails());//1nd way
    		  
       String Name=returntype.getDetails();//2nd way
       System.out.println(Name);
       
       System.out.println(returntype.getData());

       
	}
	
	public String getDetails()
	{
	   	String Name="Shivani";
	   	return Name;
	   	
	   	
	}
	
	public Long getData()
	{
		Long Mob=7083521409L;
		return Mob;
	}

}
