package day05;

public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mul(5);
	}

	public static void Mul(int n) {
		int mul = 1;
		for (int i = 1; i < n+1; i++) {
			mul = mul * i;
		}
		System.out.println(mul);
	}
}
