package day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		for (int i = 1; i <= 100; i++) {
			list.add(i);
		}
		list.remove(10);
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
