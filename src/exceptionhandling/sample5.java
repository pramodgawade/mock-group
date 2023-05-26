package exceptionhandling;

public class sample5 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int div;
		int ar[]= {23,56,45,78,35,88};
		try
		
		{
			try {
				System.out.println(a/b);
			}
			catch(java.lang.ArithmeticException e1)
			{
				System.out.println("exception is handeld=   "+e1);
			}
			
		System.out.println(ar[7]);
		}
		
		catch(java.lang.ArrayIndexOutOfBoundsException e)
		{
			System.out.println("frist exception is handelad  = "  +e);
			
			
		}
		
		
		
	}

}
