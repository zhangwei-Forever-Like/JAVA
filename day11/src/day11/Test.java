package day11;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 9; i++) {
//			sum = sum + i;
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d*%d=%d", j, i, j * i);
				System.out.printf(" ");
			}
			System.out.printf("\n");
		}
//		System.out.println(sum);
	}

}
