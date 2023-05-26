package ALLRIVISION;

public class reverseno {

	public static void main(String[] args) {

		
		//String s1="512";
		//String rev="";
		
		//for(int i=s1.length()-1;i>=0;i--)
		//{
		//	rev=rev+s1.charAt(i);
		//}
		//System.out.println(rev);
		
		int no=215;
		int temp=no;
		int rev=0,rem;
		while(temp>0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
			System.out.println(rev);
			
		}
		
		
		
		
	}

}
