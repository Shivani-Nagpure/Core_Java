package com.mkpits.constructor;

public class ConstructorOverloading
{

	public static void main(String[] args) 
	{
		ConstructorOverloading obj=new ConstructorOverloading();
		System.out.println(obj);

		
		ConstructorOverloading obj1=new ConstructorOverloading(10,10.1f);
		
		ConstructorOverloading obj2=new ConstructorOverloading(10.1f,8475858L);

		ConstructorOverloading obj3=new ConstructorOverloading(10,10.1f,"shivani");
	}
	
	public ConstructorOverloading()//No argument Constructor
	{
		System.out.println("Welcome");
	}
	
	public ConstructorOverloading(int a,float b)//Parameterized Constructor
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public ConstructorOverloading(float a,long b)
	{
		System.out.println(a);
		System.out.println(b);
		// System.out.println(+a " " +b);
	}
	
	public ConstructorOverloading(int a,float b,String name)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(name);
	}

}
