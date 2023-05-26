package method;

public class demo6 {

	public static void main(String[] args) {

		String methodnum="m4";
		switch( methodnum)
		{
		
		case("m1"):System.out.println("table of no 2");
		m1();
		break;
		
		case("m2"):System.out.println("even and odd no 1 to 20");
		m2();
		break;
		
		case("m3"):System.out.println("even and odd no with their cube and squre");
		m3();
		break;
		
		default:System.out.println("wrong method");
		}
		
		
	}
public static void m1() {
	
	for(int i=1;i<=10;i++)
	{
		System.out.println(i*2);
	}
	
}

public static void m2() {
	
	int i=1;
	while(i<=20)
	{
		if(i%2==0)
		{
			System.out.println(i+" "+"even");
		}
		else
		{
			System.out.println(i+"   "+"odd");
		}
		i++;
	}
	

}
public static void m3() {
	int i=1;
	do
	{
		if(i%2==0)
		{
			System.out.println(i+"is even"+"the squre is"+i*i);
		}
		else
		{
			System.out.println(i+"is odd"+"the cube is"+i*i*i);
		}
	i++;
	}
	while(i<=20);
}

}
























