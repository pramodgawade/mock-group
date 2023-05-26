package method;

public class reverse2 {

	public static void main(String[] args) {

		
		String name="AVAJ";
		String rev="";
		  
		
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		
		
	if (name.equals(rev))	
	{
		System.out.println("string is polyandrom");
	}
	else 
	{
		System.out.println("not poiyndrom");
	}
	}

}
