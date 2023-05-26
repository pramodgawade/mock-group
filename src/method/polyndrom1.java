package method;

public class polyndrom1 {

	public static void main(String[] args) {
		
		
		int  no=123;
		int tem=no;
		int rev=0,rem;
		
		while(tem>0)
		{
			rem=tem%10;
			rev=rev*10+rem;
			tem=tem/10;
			
		}
		if(no==rev)
		{
			System.out.println("no is poly");
		}
		else {
			System.out.println("not poly");
		}
		
		
	}
	
	
	
	
	
	
}
