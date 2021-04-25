package day19;

import java.util.Iterator;
import java.util.TreeSet;

public class UpdateStu implements Comparable<Object> {
	String name;
	long id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UpdateStu(String name, long id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		UpdateStu upstu = (UpdateStu) o;
		int result = id > upstu.id ? 1 : (id == upstu.id ? 0 : -1);
		return result;
	}

	@Override
	public String toString() {
		return "name=" + name + ", id=" + id ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpdateStu stu1 = new UpdateStu("李同学", 01011);
		UpdateStu stu2 = new UpdateStu("陈同学", 01021);
		UpdateStu stu3 = new UpdateStu("王同学", 01051);
		UpdateStu stu4 = new UpdateStu("马同学", 01012);
		TreeSet<UpdateStu> tree = new TreeSet<>();
		tree.add(stu1);
		tree.add(stu2);
		tree.add(stu3);
		tree.add(stu4);
		Iterator<UpdateStu> it = tree.iterator();
		System.out.println("Set集合中所有元素");
		while (it.hasNext()) {
			UpdateStu stu = (UpdateStu) it.next();
			System.out.println(stu.getId() + " " + stu.getName());
		}
		it = tree.headSet(stu2).iterator();
		System.out.println("截取前面部分的集合：");
		while (it.hasNext()) {
			UpdateStu stu = (UpdateStu) it.next();
			System.out.println(stu.getId() + " " + stu.getName());
		}
		it = tree.subSet(stu2, stu3).iterator();
		System.out.println("截取中间部分的集合");
		while (it.hasNext()) {
			UpdateStu stu = (UpdateStu) it.next();
			System.out.println(stu.getId() + " " + stu.getName());
		}
		it = tree.tailSet(stu3).iterator();
		System.out.println("截取后面部分的集合");
		while (it.hasNext()) {
			UpdateStu stu = (UpdateStu) it.next();
			System.out.println(stu.getId() + " " + stu.getName());
		}
		System.out.println(tree.first());
		System.out.println(tree.last());

	}

}
