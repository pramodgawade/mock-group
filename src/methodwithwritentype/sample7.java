package methodwithwritentype;


public class sample7 {

	public static void main(String[] args) {

		 int num1=mul(10,20);
		
		System.out.println(num1);
		System.out.println(mul(num1, 5));
		System.out.println(display("gjhftuydtygihiu"));
		
		sample7 s7=new sample7();
		int num2=s7.add(25, 45);
		 System.out.println(num2);
		System.out.println(s7.add(num1,num2));
	}
public static int mul(int a,int b) {

	int mul=a*b;
	
	return mul;
	
}

public static int display( String s1) {
	
	return s1.length();
	
	
}
public int add(int a,int b) {
	
	int add=a+b;
	return add;
}
}
