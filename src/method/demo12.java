package method;

public class demo12 {

	public static void main(String[] args) {

		s2();
		
	}
public void s1() {
	System.out.println("i am busy");
}
public static void s2() {
	System.out.println("sry");
	
	demo12 d12=new demo12();
	d12.s1();
}


}
