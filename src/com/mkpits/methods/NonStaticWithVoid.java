package com.mkpits.methods;

public class NonStaticWithVoid 
{
	int num=100;

	public static void main(String[] args) 
	{
		NonStaticWithVoid num=new NonStaticWithVoid();
		num.getData();
				
	}
	
   public void getData()//Non Static
	
	{
		//direct call non static variable in non static method
		System.out.println(num);
	}

}
