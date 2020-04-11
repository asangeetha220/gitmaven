package sangeetha.gitmaven;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class removedup {
	
		
		public static void removedup(String name1) {
			String[] s=name1.split( " ");
			Set<String> myset = new LinkedHashSet<String>();
			
			
			for ( String tem: s) {
				myset.add(tem);
			}
				Iterator itr=myset.iterator();
				while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
				}
			}

	public static void main( String args[]) {
		
		removedup("sangeetha sangeetha sangeetha hi");
	}
}
