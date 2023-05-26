package masalkarsirprogram;

public class vovel {

	public static void main(String[] args) {

		
		String s1="pramod";
		 
		for(int i=0;i<=s1.length()-1;i++)
		
		{
			
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				
			
			System.out.println(  "vovel" +  s1.charAt(i));
			}
		
		else
		{
			System.out.println("consucant"+s1.charAt(i));
		}
		
		
		
		
	}

}
}
