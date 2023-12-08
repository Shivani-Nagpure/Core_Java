package com.mkpits.methods;

//MethodwithNoReturntypeNoParameter 
//Non Static Method
public class MethodwithNoReturntypeNoParameter 
{
	

	public static void main(String[] args) 
	{
	   
		MethodwithNoReturntypeNoParameter obj=new MethodwithNoReturntypeNoParameter ();
		obj.getData();
	   
		StaticMethodWithNoReturnType.getData(); 
		
		StaticMethodWithNoReturnType obj1=new StaticMethodWithNoReturnType ();
		obj1.getData();
		
		getFirstName();		
		
		
		
		}
	
	
	private static void getFirstName()
	{
		// TODO Auto-generated method stub
		
	}

	//Access specifier/ReturnType/MethodName
    public void getData()//method declare
    {
       String name="shivani";
       System.out.println(name);
       
       int num=10;
       System.out.println(num);
    
    }

}
