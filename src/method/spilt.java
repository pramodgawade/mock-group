package method;

public class spilt {

	public static void main(String[] args) {

		String name="velocity";
		  String name1="my name is pramod";
		String ar1[]=name1.split(" ");
		String ar[]=name.split("");
		
		
		for(int i=0;i<=7;i++)
			
		{
			System.out.println(ar[i]);
		}
		System.out.println("-----------------------------");
		for(int i=7;i>=0;i--) {
			System.out.println(ar[i]);
		}
		
		for(int i=0;i<=3;i++) {
			System.out.println(ar1[i]);
		}
		
		
	}

}
