
public class SingleLinkedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinked singleLinked = new SingleLinked();
		People p1 = new People(1, "颜凡", "小凡");
		People p2 = new People(2, "刘烈奇", "小奇");
		People p3 = new People(3, "钟斌", "小斌");
		People p4 = new People(4, "张川", "小川");
		singleLinked.addLinked(p1);
		singleLinked.addLinked(p2);
		singleLinked.addLinked(p3);
		singleLinked.addLinked(p4);
		System.out.println("链表的展示结果");
		singleLinked.showLinked();
		System.out.println();
		singleLinked.delete(22);
		System.out.println("链表删除后的结果");
		singleLinked.showLinked();
		System.out.println();
		People p5 = new People(2, "张伟", "小张");
		singleLinked.updata(p5);
		System.out.println("更新后的结果");
		singleLinked.showLinked();
		System.out.println();
		System.out.println("链表的个数：" + singleLinked.size());
		SingleLinked singleLinked02 = new SingleLinked();
		People p6 = new People(6, "颜凡", "小凡");
		People p8 = new People(8, "刘烈奇", "小奇");
		People p10 = new People(10, "钟斌", "小斌");
		People p7 = new People(7, "张川", "小川");
		singleLinked02.addOrder(p6);
		singleLinked02.addOrder(p8);
		singleLinked02.addOrder(p10);
		singleLinked02.addOrder(p7);
		System.out.println();
		System.out.println("链表的展示结果");
		singleLinked02.showLinked();
	}

}

class SingleLinked {
	People head = new People(0, "", "");

	public void addLinked(People people) {
		People temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = people;
	}

	public void addOrder(People people) {
		People temp = head;
		boolean flag = false;
		while (temp.next != null) {
			if (temp.next.no > people.no) {
				break;
			} else if (temp.next.no == people.no) {
				flag = true;
				break;
			}
			temp = temp.next;
		}
		if (flag) {
			System.out.println("要添加的%d节点，已存在");
		} else {
			people.next = temp.next;
			temp.next = people;
		}
	}

	public void delete(int no) {
		People temp = head;
		boolean flag = false;
		while (temp.next != null) {
			if (temp.next.no == no) {
				flag = true;
				break;
			}
			temp = temp.next;
		}
		if (flag) {
			temp.next = temp.next.next;
		} else {
			System.out.printf("要删除的%d节点没有找到\n", no);
		}
	}

	public void updata(People people) {
		People temp = head.next;
		boolean flag = false;
		while (temp != null) {
			if (temp.no == people.no) {
				flag = true;
				break;
			}
			temp = temp.next;
		}
		if (flag) {
			temp.name = people.name;
			temp.inkname = people.inkname;
		} else {
			System.out.printf("没有找到%d的节点\n", people.no);
		}
	}

	public int size() {
		People temp = head.next;
		int count = 0;
		while (true) {
			if (temp == null) {
				return count;
			}
			temp = temp.next;
			count++;
		}
	}

	public void showLinked() {
		People temp = head;
		while (true) {
			if (temp.next == null) {
				return;
			}
			temp = temp.next;
			System.out.println(temp);
		}
	}
}

class People {
	public int no;
	public String name;
	public String inkname;
	public People next;

	public People(int no, String name, String inkname) {
		this.no = no;
		this.name = name;
		this.inkname = inkname;
	}

	@Override
	public String toString() {
		return "People [no=" + no + ", name=" + name + ", inkname=" + inkname + "]";
	}
}