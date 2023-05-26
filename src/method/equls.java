package method;

public class equls {

	public static void main(String[] args) {

		
		
		String s1="hi";
		 String s2="HI";
		 System.out.println(s1==s2);
		
		String name="  pramod ";
		String name1="PrAmOd";
	
		System.out.println(name.equalsIgnoreCase(name1));
        System.out.println(name.toUpperCase());	
       // name=name.toUpperCase();
        System.out.println(name);
        System.out.println(name.charAt(3));
        System.out.println(name.contains("o"));
        System.out.println(s2.concat(name));
	}

}
