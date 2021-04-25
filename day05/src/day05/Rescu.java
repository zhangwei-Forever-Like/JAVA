package day05;

public class Rescu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(height(5));
	}

	public static int height(double h) {
		if (h <= 0.1) {
			return 0;
		}
		return 1 + height(0.3*h);
	}

}
