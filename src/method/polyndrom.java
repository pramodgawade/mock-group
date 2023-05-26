package method;

public class polyndrom {

	public static void main(String[] args) {

		int no=121;
		int temp=no;
		int rev=0,rem; 
		
		while(temp> 0)//12.1>0
		{
			rem= temp %10; //121%10=1  //12 / 10=2
			
			rev=rev*10+rem;//0*10=0+1   // 1=1/10=10 +12 
			
			temp=temp/10; //121/10=12.1   //121/22
			
		}
		if(no==rev)
		{
			System.out.println("no is polydrom ");
			
		}
		else
		{
			System.out.println("no is not polydrom");
		}
	}

}
