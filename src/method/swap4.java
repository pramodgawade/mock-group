package method;

public class swap4 {

	int a;
	int b;
	
	swap4(int num1,int num2){
		a=num1;
		b=num2;
	}
	public void swap() {
		
		int swap;
		System.out.println("before swap a"+a+"and b"+b);
		swap=a;
		a=b;
		b=swap;
		System.out.println("after swap a"+a+"and b"+b);
		
		
	}
	public static void main(String[] args) {
		
		swap4 s4=new swap4(5,10);
		      s4.swap();
		
		
		
	}
	
	
	
	
	
	
}
