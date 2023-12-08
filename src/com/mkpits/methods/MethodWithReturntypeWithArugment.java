package com.mkpits.methods;

public class MethodWithReturntypeWithArugment
{

	public static void main(String[] args)
	{
		MethodWithReturntypeWithArugment m=new MethodWithReturntypeWithArugment();
		
		int add=m.getDetails(20, 40);//1st way
		System.out.println(add);
		
		System.out.println(m.getDetails(50, 50));//2nd way
	}
    //return method which return some values so gives us datatype
	public int getDetails(int a, int b)
	{
		int c=a+b;
		return c;
	}
}
