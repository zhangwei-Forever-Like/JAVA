package day08;

public class OOTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer();
		Student zhangsan = new Student();
		zhangsan.notepad = c;
//		c.brand = "中国";
//		System.out.println(c.brand);
		System.out.println(zhangsan.notepad.brand);
		System.out.println(zhangsan.notepad.style);
		System.out.println(zhangsan.notepad.color);
	}

}

class Computer {
	String brand = "华硕";
	String style = "COO";
	String color = "black";
}

class Student {
	int id = 2;
	String name = "张三";
	Computer notepad;
}