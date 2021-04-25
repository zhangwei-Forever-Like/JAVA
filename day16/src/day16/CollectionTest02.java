package day16;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		User u1 = new User("jack");
		c.add(u1);
		User u2 = new User("jack");
		System.out.println(c.contains(u2));
		
		Integer x=new Integer(1000);
		c.add(x);
		Integer y=new Integer(1000);
		System.out.println(c.contains(y));
	}

}

class User {
	private String name;

	public User() {
		super();
	}

	public User(String name) {
		super();
		this.name = name;
	}

}