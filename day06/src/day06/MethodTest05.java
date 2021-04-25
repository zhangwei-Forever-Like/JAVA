package day06;

public class MethodTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m();
		for(int i=10;i>0;i--) {
			if(i == 2) {
				return;
			}
			System.out.println("i -->"+i);
		}
	}

	public static void m() {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				return;// 终止m()的方法
			}
			System.out.println("i -->"+i);
		}
	}
}
