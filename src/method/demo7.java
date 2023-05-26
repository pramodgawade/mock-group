package method;

public class demo7 {

	public static void main(String[] args) {
            demo7 d7=new demo7();
		String methodnum="s2";
		switch(methodnum)
		{
		case("s1"):
		{
		System.out.println("table of 5");
		d7.s1();
		break;
		}
		case("s2"):
		{
		System.out.println("even and odd no");
		d7.s2();
		break;
		}
		case("s3"):
		{
			System.out.println("even and odd num and their squre and cube");
		d7.s3();	
		}
		break;
		default:
		{
			System.out.println("clicking wrong mehod");
		}
		}
	}
public void s1() {
	
	for (int i=1;i<=10;i++)
	{
	System.out.println(i*5);	
	}
	
}
public void s2() {
	
	int i=1;
	while(i<=25)
	{
		if(i%2==0)
		{
			System.out.println(i+"no is even");
		}
		else
		{
			System.out.println(i+"no is odd");
		}
	i++;	
	}
}
public void s3() {
     int i=1;
     do
     {
    	if(i%2==0)
    	{System.out.println(i+"no is even"+"squre is"+(i*i));
    		
    	}
    	else
    	{
    		System.out.println(i+"no is odd"+(i*i*i));
    	}
    	i++;
     }
   while(i<=25); 
}
}
