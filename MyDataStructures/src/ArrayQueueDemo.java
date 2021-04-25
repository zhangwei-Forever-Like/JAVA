import java.util.Scanner;

public class ArrayQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue arr = new ArrayQueue(4);
		Scanner s = new Scanner(System.in);
		boolean loop = true;
		char key = ' ';
		while (loop) {
			System.out.println("add添加数据");
			System.out.println("delete取出数据");
			System.out.println("exit退出程序");
			System.out.println("showQueue展示全部数据");
			key = s.next().charAt(0);
			switch (key) {
			case 'a':
				System.out.println("请您输入一个数字");
				int x = s.nextInt();
				arr.add(x);
				break;
			case 'd':
				System.out.println("取出了" + arr.delete());
				break;
			case 'e':
				return;
			case 's':
				arr.showQueue();
				break;
				default:
					System.out.println("请你重新输入命令");
			}

		}
	}

}

class ArrayQueue {
	private int maxSize;
	private int rear = -1;
	private int front = -1;
	int[] array;

	public ArrayQueue(int maxSize) {
		this.maxSize = maxSize;
		array = new int[maxSize];
	}

	public boolean isFull() {
		return rear== maxSize - 1;
	}

	public boolean isEmpty() {
		return rear == front;
	}

	public void add(int x) {
		if (isFull()) {
			System.out.println("队列已满，不能添加数据");
			return;
		}
		array[++rear] = x;
	}

	public int delete() {
		if (isEmpty()) {
			throw new RuntimeException("队列已空，不能删除数据");
		}
		int m=array[++front];
		array[front]=0;
		return m;
	}

	public void showQueue() {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("array[%d]=%d\t", i, array[i]);
		}
		System.out.println();
	}
}