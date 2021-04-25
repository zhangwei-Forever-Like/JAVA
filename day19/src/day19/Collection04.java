package day19;

import java.util.ArrayList;
import java.util.List;

public class Collection04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list.get(2));
		List list2=new ArrayList();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list2.set(1, new Animal());
		System.out.println(list2.get(1));
	}

}
