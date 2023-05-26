package methodwithwritentype;

public class sample4 extends  sample3  {

	
public int add(int a,int b,int c) {
		
		int add=a+b+c;
		return add;
	
	
	
}
	
	public static void main(String[] args) {
		
		sample4 s4=new sample4();
		
		System.out.println(s4.add(5, 6));
		System.out.println(s4.add(3, 4, 5));
	}
	
}
