package method;

public class constuctor3 extends constuctor4 {

	
	
	constuctor3()
	{
		this(6);
		System.out.println("hi world");
	}
	constuctor3(int a)
	{
		this(10,30);
		System.out.println(a*a);
	}
	constuctor3(int a ,int b)
	
	{
		super(6,7);
      System.out.println(a+b);
		
	}
	
public static void main(String[] args) {
	
	constuctor3 c3=new constuctor3();
	
}	
	
	
}
