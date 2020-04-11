package sangeetha.gitmaven;

public class modifier {

	 void sangeetha() {
		System.out.println(" this is default method");
	}
	
	public  void reema(){
		System.out.println(" this is public method");
	}
	
	public static void dhruv(){
		System.out.println(" this is public method");
	}
	
	public static void main(String[] args) {
		
		modifier md = new modifier();
		md.sangeetha();
		md.reema();
		md.dhruv();
	}

}
