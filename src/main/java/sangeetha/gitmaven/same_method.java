package sangeetha.gitmaven;

public class same_method extends modifier{

       void sangeetha() {
			System.out.println("sm this is default method");
		}
		
		public void reema(){
			System.out.println("sm this is public method");
		}
		
		public static void dhruv(){
			System.out.println(" sm this is public static method");
		}
		
		public static void main(String[] args) {
			
//			modifier md = new modifier();
//			md.sangeetha();
//			md.reema();
//			md.dhruv();
//			
//			same_method sm = new same_method();
//			sm.sangeetha();
//			sm.reema();
//			sm.dhruv();
			
//			same_method sm1 = (same_method) new modifier();
//			sm1.sangeetha();
//			sm1.reema();
//			sm1.dhruv();
			
			modifier md2 = new same_method();
					md2.sangeetha();
			md2.reema();
			md2.dhruv();
			
			
		}

	}


