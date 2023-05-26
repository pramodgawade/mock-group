package method;

public class demorevers {

	
	public static void main(String[] args) {
		
		
		String name="AVAJ";
		String rev="";
		int s1=name.length(); //int i;
		 
		for(int i=s1-1;i>=0;i--)//for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		
		
		
		
		
		
		
	}
	
	
}
