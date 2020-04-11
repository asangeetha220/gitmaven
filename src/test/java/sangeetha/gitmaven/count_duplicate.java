package sangeetha.gitmaven;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class count_duplicate {
	
	public static void removedup( String name1) {
		String[] s=name1.split( " ");
		Set<String> myset = new HashSet<String>();
		
		
		for ( String tem: s) {
			myset.add(tem);
			
			Iterator itr=myset.iterator();
			while(itr.hasNext()) {
		System.out.println(itr.next());
			}
		}
		
		
	}
	
	public static void onlyduplicate(String name) {
		String[] str=name.split(" ");
		
		HashMap<String , Integer> hm=new HashMap<String , Integer>();
		
		for ( String tempstring : str) 
			if(hm.get(tempstring)!=null) {
				hm.put(tempstring, hm.get(tempstring)+1);}
				else {
					hm.put(tempstring , 1);
		}
	
Set<String> tempstring1=hm.keySet();
for (String temp:tempstring1) {
	if(hm.get(temp)>1) {
		System.out.println(temp + "" + hm.get(temp));
	}
}
	
}
	public static void main( String args[]) {
		onlyduplicate("sangeetha sangeetha sangeetha hi");
		removedup("sangeetha sangeetha sangeetha hi");
	}
}
