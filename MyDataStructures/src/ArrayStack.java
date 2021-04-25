import java.util.Scanner;

public class ArrayStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack01 stack = new Stack01(5);
		boolean loop = true;
		String key = "";
		Scanner s = new Scanner(System.in);
		while (loop) {
			System.out.println("push压入一个数");
			System.out.println("pop弹出一个数");
			System.out.println("show展示栈表");
			System.out.println("exit退出程序");
			key = s.next();
			switch (key) {
			case "push":
				System.out.println("请您输入一个数");
				int x = s.nextInt();
				stack.push(x);
				break;
			case "pop":
				System.out.println("栈弹出了" + stack.pop());
				break;
			case "show":
				stack.showStack();
				break;
			case "exit":
				return;
				default:
					System.out.println("请重新在输入一条命令");
			}
		}
	}

}

class Stack01 {
	public int top = -1;
	public int maxSize;
	public int[] array;

	public Stack01(int maxSize) {
		this.maxSize = maxSize;
		array = new int[maxSize];
	}

	public boolean isFull() {
		return top == maxSize - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void push(int x) {
		if (isFull()) {
			System.out.println("栈已满");
			return;
		}
		array[++top] = x;
	}

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("栈已空");
		}
		int value;
		value = array[top--];
		return value;
	}

	public void showStack() {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("array[%d]=%d\t", i, array[i]);
		}
		System.out.println();
	}
}