
public class Hanoitower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long before;
		long after;
		before=System.currentTimeMillis();
		hanoiTwoer(21,'A','B','C');
		after=System.currentTimeMillis();
		System.out.println((after-before)/1000);
	}

	public static void hanoiTwoer(int num, char a, char b, char c) {
		if (num == 1) {
//			System.out.println("第1个盘从" + a + "->" + c);
		} else {
			hanoiTwoer(num - 1, a, c, b);
//			System.out.println("第" + num + "个盘从" + a + "->" + c);
			hanoiTwoer(num - 1, b, a, c);
		}
	}
}
