package day19;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Conllection01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new HashSet();
		c.add("abc");
		c.add("def");
		c.add(100);
		c.add(new Object());
		Iterator it = c.iterator();

		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}

}
