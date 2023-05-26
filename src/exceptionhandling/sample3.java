package exceptionhandling;

public class sample3 {

	public static void main(String[] args) {

		int arr[]= {12,34,56,78,46};
		 
		//System.out.println(arr[6]);
		try
		{
			System.out.println(arr[6]);
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		finally {
			System.out.println("Exception is handle");
		}
	}

}
