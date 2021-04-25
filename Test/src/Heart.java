
public class Heart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int k=0;k<7;k++) {
			System.out.println();
		}
		for (int i = 0; i < 14; i++) {
			for (int j = 0; j < 40; j++) {
				System.out.print(" ");
			}
			if (i < 6) {
				if (i < 2) {
					for (int j = 0; j < 5 - 2 * i; j++) {
						System.out.print(" ");
					}
					for (int j = 5 - 2 * i; j < 11 + 2 * i; j++) {
						System.out.print("*");
					}
					for (int j = 0; j < 7 - 4 * i; j++) {
						System.out.print(" ");
					}
					for (int j = 0; j < 6 + 4 * i; j++) {
						System.out.print("*");
					}
					System.out.println();

				} else if (i == 2) {
					System.out.print(" ");
					for (int j = 0; j < 13; j++) {
						System.out.print("*");
					}
					System.out.print(" ");
					for (int j = 0; j < 13; j++) {
						System.out.print("*");
					}
					System.out.println();
				}

				else {
					for (int j = 0; j < 29; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			} else {
				if (i == 6) {
					System.out.print(" ");
					for (int j = 0; j < 27; j++) {
						System.out.print("*");
					}
					System.out.println();
				} else {
					if (i == 13) {
						for (int j = 0; j < 14; j++) {
							System.out.print(" ");
						}
						System.out.print("*");
						System.out.println();
					} else {
						for (int j = 0; j < 2 * i - 11; j++) {
							System.out.print(" ");
						}
						for (int j = 0; j < 51 - 4 * i; j++) {
							System.out.print("*");
						}
					}
					System.out.println();
				}
			}
		}

	}
}
