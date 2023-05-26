package method;

public class demo36  extends demo37 {

int a=10;


public void m1() {
	int a=20;
	
	System.out.println(a);
	
	System.out.println(this.a);
	System.out.println(super.a);
}
	
	public static void main(String[] args) {
		demo36 d36=new demo36();
		      d36.m1();
		
		
	}
	
	
}
