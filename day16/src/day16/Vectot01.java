package day16;

import java.util.Iterator;
import java.util.Vector;

public class Vectot01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vector = new Vector();
		
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		vector.add(6);
		vector.add(7);
		vector.add(8);
		vector.add(9);
		vector.add(10);
		vector.add(11);
		Iterator it=vector.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
	}

}
