package day16;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		String s1 = new String("abc");
		c.add(s1);
		String s2 = new String("def");
		c.add(s2);
		System.out.println("元素的个数是：" + c.size());
		String x = new String("abc");
		System.out.println(c.contains(x));
	}

}
