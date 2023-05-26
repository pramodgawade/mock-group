package method;

public class demo2 extends demo1 {

	
	demo2 (){
		
		System.out.println("i am from chalid constuctor");
		
	}
	public void display () {
		System.out.println("i am non static method from child class");
		System.out.println("i am  from patent class get override in child class ");
	}
	public static void display1() {
		System.out.println(" i am static method from child class");
		System.out.println("i am from parent class not get override in child class");
	}
	
	public static void main(String[] args) {
		
		System.out.println("creating obj of child class and calling method that obj");
		System.out.println("when you perform inheritance all the class members (static and non static get copied in to child class constructor)");
		demo2 d2=new demo2();
                d2.display();
		       d2.display1();
		       d2.display2();
		       d2.display2("overloding");
		       System.out.println(d2.s1);
		       System.out.println("--------------------");
		       System.out.println("creating obj of parent class and calling method that obj");
		demo1 d1=new demo1();
		     d1.display();
		    d1.display1();
		    System.out.println("while performing overloding we can give the diff parameter but not return type");
		    d1.display(10);
		    
		    System.out.println("----------------------------------------------");
		    System.out.println("performing up casting");
		   demo1 d3=new demo2() ;
		         d3.display();
		         d3.display1();
		         System.out.println("----------------------------------------------");
		        System.out.println("performing downcasting "); 
		        demo2 d4=(demo2) d3; 
		               d4.display();
		               d4.display1();
		               
		               
		               
		               
		               
	}
	
}
