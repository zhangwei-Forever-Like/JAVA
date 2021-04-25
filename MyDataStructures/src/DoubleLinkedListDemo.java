
public class DoubleLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
		HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
		HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
		HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");
		HeroNode hero10 = new HeroNode(2, "孙悟空", "猴子");
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
		doubleLinkedList.addLinked(hero1);
		doubleLinkedList.addLinked(hero2);
		doubleLinkedList.addLinked(hero3);
		doubleLinkedList.addLinked(hero4);
		System.out.println("遍历链表后的结果");
		doubleLinkedList.showLinked();
		System.out.println();
		doubleLinkedList.updata(hero10);
		System.out.println("链表改完之后查找的结果");
		doubleLinkedList.showLinked();
		System.out.println();
		doubleLinkedList.delete(3);
		System.out.println("链表删完之后的结果");
		doubleLinkedList.showLinked();
	}

}

class DoubleLinkedList {
	HeroNode head = new HeroNode(0, "", "");

	public void addLinked(HeroNode heroNode) {
		HeroNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = heroNode;
		heroNode.pre = temp;
	}

	public void updata(HeroNode heroNode) {
		HeroNode temp = head.next;
		boolean flag = false;
		while (temp != null) {
			if (temp.no == heroNode.no) {
				flag = true;
				break;
			}
			temp = temp.next;
		}
		if (flag) {
			temp.name = heroNode.name;
			temp.inkname = heroNode.inkname;
		}
	}

	public void delete(int no) {
		HeroNode temp = head;
		boolean flag = false;
		while (temp.next != null) {
			if (temp.no == no) {
				flag = true;
				break;
			}
			temp = temp.next;
		}
		if (flag) {
			temp.pre.next = temp.next;
			temp.next.pre = temp.pre;
		} else {
			System.out.println("要查找的%d节点没有找到");
		}
	}

	public void showLinked() {
		HeroNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
			System.out.println(temp);
		}
	}
}

class HeroNode {
	public int no;
	public String name;
	public String inkname;
	public HeroNode next;
	public HeroNode pre;

	public HeroNode(int no, String name, String inkname) {
		this.no = no;
		this.name = name;
		this.inkname = inkname;
	}

	@Override
	public String toString() {
		return "HeroNode [no=" + no + ", name=" + name + ", inkname=" + inkname + "]";
	}

}