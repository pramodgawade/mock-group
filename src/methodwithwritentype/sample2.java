package methodwithwritentype;

public class sample2 {

	public static void main(String[] args) {
		
		
		System.out.println(display("shital"));
		
		System.out.println(display("priyanka","gawade"));
		 
		System.out.println(display("shital", "gawade"));
	}
	
	public static String display(String fn ) {
		
		
		return fn.toUpperCase();
		
	}
	public static String display(String fn,String ln ) {
		
		return ln.concat(fn);
		
	}
}
