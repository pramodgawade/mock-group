package method;

public class overload {

	public static void main(String[] args) {

		overload  d=new overload ();
		          d.m1(5, 6, 7);
		           d.m1(8, 9);
		
	}
public  static void m1(int a,int b) {
	
	
	System.out.println(a+b);
	
	
}
public void m1(int a,int b,int c) {
	
	System.out.println(a+b+c);
	
}



}
