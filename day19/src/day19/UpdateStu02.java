package day19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UpdateStu02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("01", "李同学");
		map.put("02", "魏同学");
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		System.out.println("key集合中元素：");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		Collection<String> coll = map.values();
		it = coll.iterator();
		System.out.println("values集合中的元素");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
