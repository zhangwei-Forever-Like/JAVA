package day05;

public class Constru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cicu();
	}

	public static void Cicu() {
		for (int f = 1; f < 6; f++) {
			int n = 4;
			int T = 1;
//			Ciru02();
			for (int i = 1; i < 5; i++) {

				System.out.print(f);

				for (int t = 1; t < T; t++) {
					System.out.print(0);
				}
				T++;
				for (int j = 1; j < n; j++) {
					System.out.print(" ");
				}
				n--;
			}
			System.out.println();
		}
	}
}
