package masalkarsirprogram;

public class sample20 {

	public static void main(String[] args) {

		int num1=100;
		int num2=50;
		
		System.out.println("before swap"+num1+"and "+num2);
		
		 num1=num1+num2; //100+50=150 num1=150
		 num2=num1-num2; //150-50=100 num2=100
		 num1=num1-num2; //150-100=50 num1=50
		 
		
		 System.out.println("after swap"+num1+"and "+num2);
	}

}
