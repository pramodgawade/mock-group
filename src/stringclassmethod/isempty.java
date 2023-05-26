package stringclassmethod;

public class isempty {

	public static void main(String[] args) {

		
		String s1="abc";
		String s2=null;
		
		
		System.out.println(s1.isEmpty());
		try
		{
		System.out.println(s2.isEmpty());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Exception is handaled");
		}
		
	}

}
