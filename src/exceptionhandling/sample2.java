package exceptionhandling;

public class sample2 {

	public static void main(String[] args) {

		
		String s1=null;
		//System.out.println(s1.isEmpty());
		
		
		try
		{
			System.out.println(s1.isEmpty());
			
		}
		catch(java.lang.NullPointerException e)
		{
			System.out.println("java.lang.NullPointerException is handeld");
		}
		String s2="hi world";
		System.out.println(s2);
	}

}
