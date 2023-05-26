package method;

public class constrctor1 {

	public static void main(String[] args) {
		
		constrctor s1= new constrctor();
		      s1.cal();
		
		System.out.println("-----------------------------------------------");
		System.out.println("printing frist standard information");
		s1.sname="pramod";
		constrctor.srno =1;
		constrctor.tname="amol";
		s1.adress="pune";
		s1.mono=12345678l;
		constrctor.standard=1;
		s1.student();
		System.out.println("-----------------------------------------------");
		System.out.println("printing second standard information");
		s1.sname="pramod";
		constrctor.srno =2;
		constrctor.tname="sanjay";
		s1.adress="pune";
		s1.mono=12345678l;
		constrctor.standard=2;
		s1.student();
	}
	
}
