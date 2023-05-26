package masalkarsirprogram;

import java.util.Scanner;

public class sample7 {

	
	//int x;
	//int y;
	
	// sample7 (int a,int b)
	// {
	//	 a=x;
	//	 b=y;
		 
	// }
	public static void main(String[] args) {
		int x;int y;
		System.out.println("enter the two number");
		Scanner sc=new Scanner(System.in);
		
		x=sc.nextInt();
		y=sc.nextInt();
		
		int swap;
		
		
		System.out.println("before swap x"+x+"and y"+y);
		swap=x;
		x=y;
		y=swap;
		System.out.println("after swap x"+x+"and y"+y);
	}
	
	
	
	
	
	
}
