package day06;

public class Subject01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		目：求s=a+aa+aaa+aaaa+aa…a的值，其中a是一个数字。
//	    例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
//	    输出结果的形式如：2+22+222=246；  987654312 987654312
		System.out.println("最后的值为："+add(2, 8));
	}

	public static int add(int m, int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			int s = 1;
			int t = 0;
			for (int j = 1; j <= i; j++) {
				s = m * pow(j);
				t = t + s;
				System.out.println("pow的值：" + pow(j));
			}
			sum += t;
		}
		return sum;
	}

	public static int pow(int j) {
		int s = 1;
		for (int i = 1; i <= j; i++) {
			s = s * 10;
		}
		return s / 10;
	}
}
