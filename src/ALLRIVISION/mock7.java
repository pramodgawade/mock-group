package ALLRIVISION;

import java.util.Arrays;

public class mock7 {

	public static void main(String[] args) {

		int arr[]= {0,5,6,3,1,2,4};
		
		Arrays.sort(arr);
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
