
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expression = "127+2*6-9";
		Stack02 numStack = new Stack02(10);
		Stack02 operStack = new Stack02(10);
		int index = 0;
		int num1 = 0;
		int num2 = 0;
		int oper = 0;
		int res = 0;
		char ch = ' ';
		String s = "";
		while (true) {
			ch = expression.substring(index, index + 1).charAt(0);
			if (operStack.isOper(ch)) {
				if (!operStack.isEmpty()) {
					if (operStack.priority(ch) > operStack.priority(operStack.peek())) {
						operStack.push(ch);
					} else {
						num1 = numStack.pop();
						num2 = numStack.pop();
						oper = operStack.pop();
						res = numStack.cal(num1, num2, oper);
						numStack.push(res);
						operStack.push(ch);
					}
				} else {
					operStack.push(ch);
				}
			} else {
				s += ch;
				if (index == expression.length() - 1) {
					numStack.push(Integer.parseInt(s));
				} else {
					if (operStack.isOper(expression.substring(index + 1, index + 2).charAt(0))) {
						numStack.push(Integer.parseInt(s));
						s = "";
					}
				}
			}
			if (index >= expression.length() - 1) {
				break;
			}
			index++;
		}
		while (!operStack.isEmpty()) {
			num1 = numStack.pop();
			num2 = numStack.pop();
			oper = operStack.pop();
			res = numStack.cal(num1, num2, oper);
			numStack.push(res);
		}
		System.out.println(numStack.pop());
	}

}

class Stack02 {
	public int top = -1;
	public int maxSize;
	public int[] array;

	public Stack02(int maxSize) {
		this.maxSize = maxSize;
		array = new int[maxSize];
	}

	public int peek() {
		return array[top];
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

	public int priority(int oper) {
		if (oper == '*' || oper == '/') {
			return 1;
		} else if (oper == '+' || oper == '-') {
			return 0;
		}
		return -1;
	}

	public boolean isOper(char val) {
		return val == '+' || val == '-' || val == '*' || val == '/';
	}

	public int cal(int num1, int num2, int oper) {
		int res = 0;
		switch (oper) {
		case '+':
			res = num1 + num2;
			break;
		case '-':
			res = num2 - num1;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			res = num2 / num1;
			break;
		default:
			break;
		}
		return res;
	}
}