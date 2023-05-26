package method;

public class demo14 {
int a=56;
	public static void main(String[] args) {
		demo14 d14=new demo14();
		System.out.println(d14.a);
		m2();
		d14.m1();
		demo15 d15=new demo15();
		System.out.println(d15.c);
		d15.s1();
	}
	public void m1() {
		
		System.out.println(a);
		
	}
	public static void m2() {
		demo14 d14=new demo14();
		System.out.println(d14.a);
		
	}
}
