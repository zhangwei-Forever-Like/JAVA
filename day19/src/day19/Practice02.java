package day19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add("A");
		set.add("a");
		set.add("c");
		set.add("C");
		set.add("a");
		List list=new ArrayList();
		list.add("A");
		list.add("a");
		list.add("c");
		list.add("C");
		list.add("a");
		Iterator it=set.iterator();
		System.out.println("Set集合的所有元素");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Iterator it2=list.iterator();
		System.out.println("List集合的所有元素");
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}

}
