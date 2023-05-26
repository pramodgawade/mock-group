package javarivision;

public class constructor {
       int a=30;
	   int b=40;
	constructor()
	{
		
		System.out.println("hi from zero paramitrazie constructor");
	}
	
	constructor(int a,int b)
	{
		this();
		System.out.println(a+b);
	}
	
	
	
	
	
	public static void main(String[] args) {

		constructor c= new constructor(10,20);
		             
		
	
		
		
	}

}
