package method;

import java.util.Scanner;

public class revrsestring {

	public static void main(String[] args) {

		String name;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the input");
		
		name=sc.nextLine();
		
		//String name="gnirts";
		String rev="";
		int length=name.length();
		
		for(int i=length-1;i>=0;i-- )
		{
			rev=rev+ name.charAt(i);
		}
		System.out.println(rev);
	
  System.out.println(name);
	if(name.equals(rev))//revers  the string
	{
	System.out.println("This is palindrome .");	
	}
	else 
	{
		System.out.println("This is not palindrome");
	}
	}	
}
