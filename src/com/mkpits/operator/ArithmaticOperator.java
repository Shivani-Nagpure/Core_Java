package com.mkpits.operator;

public class ArithmaticOperator 

{

	public static void main(String[] args) 
	{
		getOperation(10, 20);
		/*getSub(50,30);
		getMul(10,10);
		getDiv(50,10);*/

	}

	private static void getOperation(int i, int j) 
	{
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j);
		System.out.println(i%j);
	}


}
