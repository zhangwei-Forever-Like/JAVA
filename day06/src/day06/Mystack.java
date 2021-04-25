package day06;

public class Mystack {
	Object[] elements;
	int index = -1;

	public void push(Object obj) {
		if (this.index >=elements.length -1) {
			System.out.println("栈已满，压栈失败");
			return;
		}
		index++;
		elements[index]=obj;
		System.out.println("压栈成功，栈帧指向"+index);
	}

	public void pop() {
		if (this.index <= 0) {
			System.out.println("栈已空，弹栈失败");
			return;
		}
		System.out.println("弹栈成功，栈帧指向"+index);
		index--;
	}

	public Mystack() {
		super();
		this.elements=new Object[10];
	}
}
