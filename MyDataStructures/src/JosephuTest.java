
public class JosephuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLink singleLink = new SingleLink();
		singleLink.addBoy(10);
		singleLink.showBoy();
		singleLink.countBoy(1, 2, 5);
	}

}

class SingleLink {
	public int n;

	private Boy first = null;

	public void addBoy(int nums) {
		Boy temp = first;
		for (int i = 1; i <= nums; i++) {
			Boy boy = new Boy(i);
			if (i == 1) {
				first = boy;
				first.next = first;
				temp = first;
			} else {
				temp.next = boy;
				boy.next = first;
				temp = boy;
			}
		}
	}

	public void countBoy(int startNo, int countNum, int nums) {
		Boy curBoy = first;
		Boy helper = first;
		while (helper.next != first) {
			helper = helper.next;
		}
		for (int i = 1; i <= startNo - 1; i++) {
			curBoy = curBoy.next;
			helper = helper.next;
		}
		while(curBoy!=helper) {
			for(int i=1;i<=countNum-1;i++) {
				curBoy=curBoy.next;
				helper=helper.next;
			}
			System.out.print(curBoy+"\t");
			curBoy=curBoy.next;
			helper.next=curBoy;
		}
		System.out.println(curBoy+"\t");
	}

	public void showBoy() {
		Boy temp = first;
		while (true) {
			System.out.printf("小孩的编号%d \n", temp.no);
			if (temp.next == first) {
				return;
			}
			temp = temp.next;
		}
	}
}

class Boy {
	public int no;
	public Boy next;

	public Boy(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Boy [no=" + no + "]";
	}

}