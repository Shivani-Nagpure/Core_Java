package com.mkpits.constructor;
//object to object typecasting
public class ConstructorObject
{
  int pincode,id;
	public static void main(String[] args) 
	{
		ConstructorObject object=new ConstructorObject();
		object.getmemeber();
		
		ConstructorObject object2=new ConstructorObject(440034,2301);
		object2.getmemeber();
		
		ConstructorObject object3=new ConstructorObject(object2);
		object3.getmemeber();
		
		/*ConstructorObject object4=new ConstructorObject(new ConstructorObject());
        object4.getmemeber();*/
		
		//new ConstructorObject(new ConstructorObject()).getmemeber();//channing// instance through passing
		
	}
	
	public void getmemeber()
	{
		System.out.println("Pincode:-" +pincode+ " id:-" +id);
	}
	public ConstructorObject()
	{
		pincode=445001;
		id=1034;
		System.out.println("Constructor with no Argument");
		
	}
	
	public ConstructorObject(int p,int i)
	{
		
	   pincode=p;
	   id=i;
	   System.out.println("Parameterised Constructor");
	}
     
	public ConstructorObject(ConstructorObject ob)
	{
		System.out.println("Constructor with Object");
		pincode=ob.pincode;
		id=ob.id;
		//ob.getmemeber();
	}
	}

