package day13;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath m = new MyMath();
		m.mySum(new ComputeImp1(), 100, 200);
		m.mySum(new Compute(){
			public int sum(int a,int b) {
				return a+b;
			}
		}, 200, 999);
	}

}

interface Compute {
	int sum(int a, int b);
//	int mul(int a,int b);
}

class ComputeImp1 implements Compute {
	public int sum(int a, int b) {
		return a + b;
	}
}
//class ComputeImp2 implements Compute {
//	public int mul(int a, int b) {
//		return a * b;
//	}
//}
class MyMath {
	public void mySum(Compute c, int x, int y) {
		int retValue = c.sum(x, y);
		System.out.println(x + "+" + y + "=" + retValue);
	}
}