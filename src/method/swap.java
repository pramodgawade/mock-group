package method;

public class swap {


		
		
		int a;
		int b;
		
		 swap (int x,int y )
		 {
			 a=x;
			 b=y;
		 }
		
		void swap() {
			int swap;
			System.out.println("before swaping a" +a+"and b"+b);
			swap=a;
			a=b;
			b=swap;
			System.out.println("after swaping a" +a+"and b"+b);
		}
		
		public static void main(String[] args) {
			
			swap s1=new swap(10,20);
			       s1.swap();
		}
	

}
