package day14;

public class Array06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[][]  array= {{1,2,5,6},{4,3,7,8},{4},{6,9,2,1}};
  printArray(array);
	}

	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
