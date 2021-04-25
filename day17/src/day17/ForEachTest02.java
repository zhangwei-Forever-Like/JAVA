package day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList<>();

		strList.add("hello");
		strList.add("world");
		strList.add("kitty");

		Iterator<String> it = strList.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}

}
