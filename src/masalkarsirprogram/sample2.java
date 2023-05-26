package masalkarsirprogram;


public class sample2 {

	public static void main(String[] args) {
		 String name="pramod";
         String rev="";
          
       for(int i=name.length()-1;i>=0;i--){
        
        rev=rev+name.charAt( i);
         }
        System.out.println(rev);
         
     if(name.equals(rev))
      {
        System.out.println("string is polyndrom");
         }
      else
      {
        System.out.println("string is not polyndrom");
      }


	}

}
