package method;

public class constrctor {

	int num1;
	int num2;
	String sname;
static     int srno;
	static String tname;
	String adress;
	long mono;
	static int standard;
	constrctor(String a,int b,String c,String d,long e,int f)
	{
		sname=a;
		 srno=b;
         tname=c;
         adress=d;
	       mono=e;
	       standard=f;
	}
	
	
	
	constrctor ()
	{
		num1=10;
		num2=2;
	}
	public void cal() {
		
		System.out.println("addtion of two no= " + num1+num2 );
		System.out.println("multipication of two no= "+num1*num2);
		System.out.println("division of two no=  "+num1/num2);
		System.out.println("sub of two no="+(num1-num2));
	}
	
		
public void student() {
	
	System.out.println("student name is= "+sname);
	System.out.println("student roll no is= "+srno);
	System.out.println("student teacher name ="+ tname);
	System.out.println("student adress= "+adress);
	System.out.println("student mobail no="+mono);
	System.out.println("student standred="+standard);
	
}
	
}	
	
	
	
	
