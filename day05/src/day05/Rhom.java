package day05;

public class Rhom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Rho();
	}

	public static void Rho() {
		for (int j = 0; j < 9; j++) {
			if (j < 5) {
				for (int i = 1; i < -j + 5; i++) {
					System.out.print(" ");
				}
				for (int i = 1; i < 2*j + 2; i++) {
					System.out.print("*");
				}
				for (int i = 1; i < -j + 5; i++) {
					System.out.print(" ");
				}
			} else {
				for (int i = 1; i < j - 3; i++) {
					System.out.print(" ");
				}
				for (int i = 1; i < -2*j + 18; i++) {
					System.out.print("*");
				}
				for (int i = 1; i < j - 3; i++) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
