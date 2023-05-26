package method;

public class demo45 {

	public static void main(int num1,int num2) {

		System.out.println("addtion of two no"+   (num1+num2)  );
		main();
	}
		
	public static void main(String str) {
		
		System.out.println(str);
		main(10,20);
	}	
		public static void main() {
			System.out.println("non pramitraize main method");
		}

	public static void main(String[] args) {
		
		
	System.out.println("original main method call");	
		main("pramod");
		
	}	
		


}
