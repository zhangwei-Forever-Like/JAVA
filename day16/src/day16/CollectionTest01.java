package day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1 = new ArrayList();
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(4);
		c1.add(1);
		Iterator it = c1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		Collection c2 = new HashSet();
		c2.add(200);
		c2.add(40);
		c2.add(60);
		c2.add(400);
		c2.add(1000);
		c2.add(23);
		c2.add(34);
		c2.add(464);
		Iterator it2 = c2.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
	}

}
