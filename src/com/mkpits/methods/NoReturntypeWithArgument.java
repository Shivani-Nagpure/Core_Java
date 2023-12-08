package com.mkpits.methods;

public class NoReturntypeWithArgument
{

	public static void main(String[] args) 
	{
	    NoReturntypeWithArgument num=new NoReturntypeWithArgument();//Argument  //calling method
	    num.getDeatils(1028);
	}
	
	public void getDeatils(int a)//Parameter //Called method
	{
		System.out.println(a);
	}

}
