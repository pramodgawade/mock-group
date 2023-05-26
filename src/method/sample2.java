package method;

public class sample2 {

	public static void main(String[] args) {

		m1();
		
	}

	public static void m1() {
		
		int i=1;
		while(i<=20)
			
		{
			if (i%2==0)
			{
				System.out.println("even no "+ i+"  "+i*i);
			}
			else
			{
				System.out.println("odd no"+i+"   "+i*i*i);
			}
			i++;
		}
			
	}
	
}
