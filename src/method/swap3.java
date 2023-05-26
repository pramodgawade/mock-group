package method;

public class swap3 {

	
	int a;
	int b;
	
	swap3(int num1,int num2){
		
		a=num1;
		b=num2;
		
		
	}

	public void m1() {
		
		int swap;
		System.out.println("before swapinng a"+a+"and b"+b);
		swap=a;
		a=b;
		b=swap;
		System.out.println("after swapinng a"+a+"and b"+b);
	}
	public static void main(String[] args) {
		
		swap3 s3=new swap3(10,20);
		      s3.m1();
		
		
		
	}
	
}
