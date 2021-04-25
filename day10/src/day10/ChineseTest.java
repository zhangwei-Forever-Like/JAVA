package day10;

public class ChineseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chinese zhangsan = new Chinese("1", "张三");
		System.out.println(zhangsan.id + "," + zhangsan.name + "," + Chinese.country);
		Chinese lisi = new Chinese("2", "李四");
		System.out.println(lisi.id + "," + lisi.name + "," + Chinese.country);
		Chinese wangwu = new Chinese("3", "王五");
		System.out.println(wangwu.id + "," + wangwu.name + "," + Chinese.country);
		System.out.println(Chinese.country);
	}

}
