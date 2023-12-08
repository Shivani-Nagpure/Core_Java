package com.mkpits.typecasting;

public class PrimitiveToObjectCasting 
{

	public static void main(String[] args)
	{
		int pincode=273673;
		Integer i=new Integer(pincode);//Wrapper class
		System.out.println(i);
		
		char name='S';
	   Character UName=new Character(name);
		System.out.println(UName);
		
		int num=10;
		double d1=new Double(num);
		System.out.println(d1);
		
		//not converted
		/*double num1=20.00;
		long l1=new Long(num1);
		System.out.println(long);*/
		
	}

}
