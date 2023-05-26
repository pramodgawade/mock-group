package method;


public class thiskeyword {

	  int a=10;
	
	
	
	
	
	public  void m1() {
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
		
		
	}
	
	public static void main(String[] args) {
		thiskeyword t=new thiskeyword();
		            t.m1();
		
		
		
		
	}
	
	
}
