package day06;

public class Subject02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		题目：一个数如果恰好等于它的因子之和，这个数就称为”完数”。
//		例如6=1＋2＋3.编程找出1000以内的所有完数
		prime(1000);
	}

	public static void prime(int n) {
		int temp = n / 2;
		for (int j = 1; j <= n; j++) {
			int sum = 0;
			for (int i = 1; i <=temp; i++) {
				if (j % i == 0) {//1  2 3 4 6 8 12
//					System.out.println("i:"+i);
					sum += i;
				}
				System.out.println("sum:"+sum);
			}
			if (j == sum) {
				System.out.println("完数：" + j);
			}
		}
	}
}
