package ALLRIVISION;

public class fibonancysiries {

	public static void main(String[] args) {

		
		int num1=0;
		int num2=1;
		int sum;
		System.out.print(num1+" "+num2+" ");
		
		for(int i=1;i<=10;i++)
		{
			sum=num1+num2;
			System.out.print(sum+" ");
			num1=num2;
			num2=sum;
			//System.out.print(sum+" ");
		}
		
	}

}
