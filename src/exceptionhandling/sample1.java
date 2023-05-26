package exceptionhandling;

public class sample1 {

	public static void main(String[] args) {

		String s1="pramod";
		
		String ar[]=s1.split("");
		//System.out.println(ar[7]);
		
		try
		{
			System.out.println(ar[7]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println( "Exception is handaled");
		}
	}

}
