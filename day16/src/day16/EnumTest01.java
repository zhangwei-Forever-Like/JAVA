package day16;

public class EnumTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean retValue = divide(10, 0);
		System.out.println(retValue);
		retValue = divide(10, 3);
		System.out.println(retValue);
	}

	public static boolean divide(int a, int b) {
		try {
			int c = a / b;
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
