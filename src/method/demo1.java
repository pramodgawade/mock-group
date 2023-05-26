package method;

 public class demo1 {

	final String s1="hello";
	demo1(){
		System.out.println("i am from parant constructer");
	}
	
	public void display() {
		System.out.println("i am non static method from parent class");
	}
	
	public static void display1() {
		System.out.println(" i am static method from parent class");
	}
	
	
	public void display(int a) {
		
	System.out.println(a);
	}
	final public void display2() {
			System.out.println(" final non static method from parentclass");
	}
	final public void display2(String a) {
		System.out.println(" i am final non static method2 from parentclass"+a);
}
	public static void main(String[] args) {
		
		demo1 d1=new demo1();
		     d1.display(10);
	}
}
