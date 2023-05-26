package stringclassmethod;

public class spilt {

	public static void main(String[] args) {

		
		String s1="my name is pramod";
		String s2="pramod";
		
          String ar[] =s1.split(" ");
		String ar1[]=s2.split("");
		
		for(int i=0;i<=3;i++)
		{
			System.out.println(ar[i]);
		}
		for (int j=0;j<=s2.length()-1;j++)
		{
			System.out.println(ar1[j]);
		}
		
		System.out.println(s1.contains("my"));
		
	}

}
