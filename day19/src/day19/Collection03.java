package day19;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Collection03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new HashSet();
		c.add("abc");
		c.add("erd");
		c.add(2);
		c.add(3);
		c.add("You are me");
		Iterator it=c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
