package method;

public class constuctor extends constuctor2  {

	
	  
	constuctor()
	{
		
	this (5);
		System.out.println("hi");
	}
	
	constuctor(int a)
	{ 
		
		this (5,10);
		
		System.out.println(a*a);
	}
	constuctor(int a,int b)
	{
		super(10,25);
		System.out.println(a*b);
	}
		
	
	public static void main(String[] args) {
		constuctor c1=new constuctor();
		
	}
	
	
	
}
