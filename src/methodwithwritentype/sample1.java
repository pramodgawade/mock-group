package methodwithwritentype;

public class sample1 {
	    static int mul=0;
        static int sum=0;
	public static void main(String[] args) {
		
		System.out.println(add(4, 5));
		
		System.out.println(mul(5));
		sample1 s1=new sample1();
		System.out.println(s1.sub(3));
		
		System.out.println(mul(5)-add(5,1));
	}
	
	
	
	public static int add(int a,int b) {
		
		sum=a+b;
		return sum;
		
	}
	public static int mul(int a) {
		 mul=sum*a;
		return mul;
		
	}
	public int sub(int a) {
		int sub=mul-a;
		return sub;
	}
		
}
