package stringclassmethod;

public class equale {

	public static void main(String[] args) {

		String s1="abcd";
		String s2="ABCD";
		String s3="abcd";
		System.out.println(s1==s2);
		System.out.println(s2.equals(s1));
		System.out.println(s1.equals(s3));
		System.out.println("------------------------------------");
	//	System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s3));
		
		String m1="pur";
		String m2="pur";
		System.out.println(m1.contentEquals(m2));
		
	}

}
