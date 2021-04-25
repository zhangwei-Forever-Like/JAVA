package day05;

public class Practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] array = new String[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = " ";
//				System.out.print(array[i][j]);
			}
//			System.out.println();
		}
		for (int i = 0; i < array.length; i++) {
			if (i < 5) {
				array[i][-i + 4] = "*";
				array[i][i + 4] = "*";
//					System.out.print(array[i][-i+4]);

//				
			} else {
				array[i][i - 4] = "*";
				array[i][-i + 12] = "*";
			}

//				System.out.print(array[i][j]);

		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}
