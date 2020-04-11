package sangeetha.gitmaven;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Dupcharac {

	public static void main(String args[]) {
		
		String name="sangeetha";		
	HashMap<Character, Integer>	hm = new HashMap<Character, Integer>();
		for ( int i=0;i<name.length();i++) {
			char c=name.charAt(i);
			if(hm.get(c)!=null) {
				hm.put(c, hm.get(c)+1);			
			}
			else {
				hm.put(c, 1);
			}
			
		}
		Set<Character> ch=hm.keySet();
		for(Character c : ch) {
			if (hm.get(c)>1) {
				System.out.println(c + " " + hm.get(c));
			}
		}
		
	Set <Character> remo=new HashSet<Character>()	;
	for(int j=0 ; j<name.length();j++) {
		char re=name.charAt(j);
		if(!remo.contains(re)) {
			remo.add(re);
		
					
		}
		
		}
	Iterator itr=remo.iterator();
	while(itr.hasNext()) {
System.out.print(itr.next());}
			 
		}}

	
	
	
	
	

