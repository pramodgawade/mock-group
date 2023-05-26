package masalkarsirprogram;

import java.util.Arrays;

public class sample8 {

	public static void main(String[] args) {

		
		 int ar[]={99,36,57,38,87,98,89};
         Arrays.sort(ar);
         for(int i=0;i<=ar.length-1;i++)
        {
               System .out .println(ar[i]);
           }
		System.out.println("----------------------");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		
		
		
	}

}
