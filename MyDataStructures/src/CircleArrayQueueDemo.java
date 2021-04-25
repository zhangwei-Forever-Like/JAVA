import java.util.Scanner;

public class CircleArrayQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleArrayQueue arr = new CircleArrayQueue(4);
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
				System.out.println("取出了" + arr.getQueue());
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

class CircleArrayQueue {
	private int maxSize;
	private int rear = 0;
	private int front = 0;
	int[] array;

	public CircleArrayQueue(int maxSize) {
		this.maxSize = maxSize ;
		array = new int[maxSize];
	}

	public boolean isFull() {
		return (rear+1)%maxSize==front;
	}

	public boolean isEmpty() {
		return rear == front;
	}

	public void add(int x) {
		if (isFull()) {
			System.out.println("队列已满，不能添加数据");
			return;
		}
		array[rear] = x;
		rear=(rear+1)%maxSize;
	}

	public int getQueue() {
		if (isEmpty()) {
			throw new RuntimeException("队列已空，不能取出数据");
		}
		int m = array[front];
		front=(front+1)%maxSize;
		return m;
	}

	public void showQueue() {
		for (int i = front; i < front+(rear - front + maxSize) % maxSize; i++) {
			System.out.printf("array[%d]=%d\t", i%maxSize, array[i%maxSize]);
		}
		System.out.println();
	}
}