package method;

import java.util.Scanner;

public class demoreverse1 {

	public static void main(String[] args) {
             String name;
		System.out.println("please enter the name");
		Scanner sc=new Scanner(System.in);
             name  =sc.nextLine();
		//String name="pramod";
		String rev="";
		int l=name.length();
		for (int i=l-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		
		
		if(name.equals(rev))
		{
			System.out.println("name is polyandrom");
		}
		else 
		{
			System.out.println("name is not polyandrom");
		}
	}

}
