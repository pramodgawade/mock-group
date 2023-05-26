package masalkarsirprogram;

public class sample10 {

	public static void main(String[] args) {

		
		int ar[]= {2,5,7,2,8,6,5,4,7,8};
		
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println("duplicate no is="+ar[i]);
				}
			}
			
		}
		
		
		
		
	}

}
