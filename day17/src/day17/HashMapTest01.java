package day17;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		map.put(1111, "zhangsan");
		map.put(6666, "lisi");
		map.put(7777, "wangwu");
		map.put(2222, "zhaoliu");
		map.put(2222, "King");
		map.put(0000, "zhangsan");
		System.out.println(map.size());
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		for (Map.Entry<Integer, String> entry : set) {
			System.out.println(entry.getKey() + "=" + entry.getValue());

		}
		Student s1 = new Student("zhangsan");
		Student s2 = new Student("zhangsan");
		System.out.println(s1.equals(s2));

		System.out.println("s1的hasgCode=" + s1.hashCode());
		System.out.println("s2的hashCode=" + s2.hashCode());

		Set<Student> students = new HashSet<>();
		students.add(s1);
		students.add(s2);
		System.out.println(students.size());
	}

}

class Student {
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}