package ALLRIVISION;

public class mock1 {

	public static void main(String[] args) {

		
		
		String s1="ab cd";
		//String arr[]=s1.split(" ");
		int count=0;
		for(int i=0;i<s1.length();i++ )
		{
		  //System.out.println(s1.charAt(i)+" ");
		 // count++;
		  char ch=s1.charAt(i);
		  if(ch==' ')
		  
			 count++; 
		  
		}
		System.out.println(count);
		
	}

}
