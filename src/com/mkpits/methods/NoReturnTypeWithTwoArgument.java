package com.mkpits.methods;

public class NoReturnTypeWithTwoArgument 
{
	
  public static void main(String[] args) 
  {
	NoReturnTypeWithTwoArgument num=new NoReturnTypeWithTwoArgument();
	num.getItems(001,50000);//Argument //Calling Method
  }

  public void getItems(int itemCode, int price) //parameter //Called Method
  {
	price=price+4000;
	
	System.out.println("ItemCode :-"+itemCode +" \nPrice :- Rs." +price);//1st way
	
	System.out.println("ItemCode :-"+itemCode);//2nd way
	System.out.println("Price :- Rs." +price);
  }
}
