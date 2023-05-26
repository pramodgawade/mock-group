package method;

public class fibonancci {

	public static void main(String[] args) {

		
		int n=0,n1=1,n2;
		  System.out.print(n+" "+ n1+ " "); 
		  int sum;
		for(int i=0;i<=10;i++)
		{
			sum=n+n1;
			System.out.print(sum+" ");
			n=n1;
			n1=sum;
		}
		
		
		
		
		
	}

}
