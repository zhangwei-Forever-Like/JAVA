package day19;

import java.util.Collection;
import java.util.HashSet;

public class Collection02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new HashSet();
		c.add("abc");
		c.add("erd");
		c.add(2);
		c.add(3);
		c.add("You are me");
		System.out.println(c.size());
//		c.clear();
//		System.out.println(c.size());
		boolean b=c.contains("abc");
		System.out.println(b);
		c.remove(2);
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		c.clear();
		System.out.println(c.isEmpty());
		c.add("abc");
		c.add("erd");
		c.add(2);
		c.add(3);
		c.add("You are me");
		System.out.println();
		Object[] o=c.toArray();
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i]);
		}
	}

}
