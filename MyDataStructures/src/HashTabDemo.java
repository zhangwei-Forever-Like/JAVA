import java.util.Scanner;

public class HashTabDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTab hashTab = new HashTab(7);
		String key = "";
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("add:添加雇员");
			System.out.println("list:显示雇员");
			System.out.println("exit:退出系统");
			key = s.next();
			switch (key) {
			case "add":
				System.out.println("输入id");
				int id = s.nextInt();
				System.out.println("输入名字");
				String name = s.next();
				Emp emp = new Emp(id, name);
				hashTab.add(emp);
				break;
			case "list":
				hashTab.list();
				break;
			case "exit":
				s.close();
				System.exit(0);
			default:
				break;
			}
		}
	}

}

class HashTab {
	private EmpLinkedList[] empLinkedList;
	private int size;

	public HashTab(int size) {
		this.size = size;
		empLinkedList = new EmpLinkedList[size];
		for (int i = 0; i < size; i++) {
			empLinkedList[i]=new EmpLinkedList();
		}
	}

	public void add(Emp emp) {
		int empLinkedListNo = hashFun(emp.id);
		empLinkedList[empLinkedListNo].add(emp);
	}

	public void list() {
		for (int i = 0; i < size; i++) {
			empLinkedList[i].list();
		}
	}

	public int hashFun(int id) {
		return id % size;
	}
}

class Emp {
	public int id;
	public String name;
	public Emp next;

	public Emp(int id, String name) {;
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

}

class EmpLinkedList {
	private Emp head=new Emp(0,"");

	public void add(Emp emp) {
		Emp temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = emp;
	}

	public void list() {
		if(head.next==null) {
			System.out.println("当前链表为空");
			return;
		}
//		System.out.println("当前链表的信息为");
		Emp temp = head;
		while (temp.next != null) {
			temp = temp.next;
			System.out.print(temp+"\t");
		}
		System.out.println();
	}
}