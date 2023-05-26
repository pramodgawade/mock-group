package method;

public class swap2 {

	int a;
	int b;
	
	swap2(int m ,int n)
	{
		a=m;
		b=n;
	}
	private void swap() {

		int swap;
		
		System.out.println("before swap a"+a+"and b"+b);
		 swap=a;
		 a=b;
		 b=swap;
		 System.out.println("aftre swap a"+a+"and b"+b);
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		swap2 s2=new swap2(45,90);
		       s2.swap();
		
	}
}
