package day17;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> strs = new HashSet<>();
		strs.add("hellow3");
		strs.add("hellow2");
		strs.add("hellow4");
		strs.add("hellow1");
		strs.add("hellow5");
		strs.add("hellow9");
		strs.add("hellow7");
		strs.add("hellow5");
		strs.add("hellow2");
		strs.add("hellow0");
		strs.add("hellow3");

		for (String s : strs) {
			System.out.println(s);
		}
	}

}
