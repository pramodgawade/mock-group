package masalkarsirprogram;

public class sample12 {

	public static void main(String[] args) {

		int no=3456;
		int temp=no;
		int rev=0,rem;
		
		while(temp>0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		System.out.println(rev);
	}

}
