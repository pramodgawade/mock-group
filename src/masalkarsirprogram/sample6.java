package masalkarsirprogram;

public class sample6 {


		
		  int a;
          int b;
             
          sample6(int x,int y)

         {       a =x;
                   b=y;
          }
          public void swap () {
        	  
          
              int swap;
              System.out.println("before swap a"+a+"and b"+b);
               swap=a;
                 a=b;
               b=swap;
                System.out.println("after swap a"+a+"and b"+b);
               
          }
		
		public static void main(String[] args) {
			 sample6 s1=new sample6 (10,20);
			          s1.swap();
			
			
		}
	}


