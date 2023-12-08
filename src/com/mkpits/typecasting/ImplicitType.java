package com.mkpits.typecasting;

//smaller datatype value converted into larger datatype
//ex;int datatype value directly converted into long datatype
public class ImplicitType
{

	public static void main(String[] args) 
	{
		int x=10;
		long y=(long)x;
		System.out.println(y);
		getByteInt();
		getFloatDouble();
	   // getshort();//NOTE Short to Short not converted in Implicit 

	}
	
	public static void getByteInt()
	{
		byte num1=10;
		byte num2=20;
		
		int num3=num1+num2;
		System.out.println("Sum is:-" +num3);
		
		long num4=num3;
		System.out.println(num4);
	}
	
	public static void getFloatDouble()
	{
		float n1=20;
		float n2=20;
		
		double n3=n1*n2;
		System.out.println("Multiplication is:-" +n3);
	}
	
   /* public static void getshort()
    {
    	short s1=10;
    	short s2=10;
    	
    	short s3=s1+s2;
    	System.out.println(s3);
    	
    }*/
	
	
}
