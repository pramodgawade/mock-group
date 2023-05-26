package method;

public class polyndrom4 {

	public static void main(String[] args) {
 
		
		String name="1235";
		String rev="";
		
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		
		System.out.println(rev);
	
    if(name.equals(rev))
    {
    	System.out.println("no is polyndrom");
    	
    }
    else {
    	System.out.println("not polyndrom");
    }
    
    
}
}