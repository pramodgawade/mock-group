package method;

import java.util.Scanner;

public class revers2 {

	public static void main(String[] args) {

		
		String name;
		 String rev="";
		System.out.println("enter the name");
		Scanner sc=new Scanner (System.in);
		
		name=sc.nextLine();
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
			
			
		}
		System.out.println("reverse the string  " + " "  + rev);
	}
}
