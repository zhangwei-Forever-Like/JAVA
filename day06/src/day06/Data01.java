package day06;

public class Data01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		add();
		long end = System.currentTimeMillis();
		System.out.println("共计用了"+(end - start)+"毫秒");
	}

	public static void add() {
		int sum = 0;
		for (int i = 1; i <= 100000; i++) {
			sum += i;
			System.out.println(sum);
		}
	}
}
