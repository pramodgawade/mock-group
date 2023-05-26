package masalkarsirprogram;

public class sample11 {

	public static void main(String[] args) {

		String name="mashalkr";
		char arr[]=name.toCharArray();
		// String arr []=name.split("");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
				System.out.println("duplicate charactor is" +arr[i]);	
				}
			}
		}
	}

}
