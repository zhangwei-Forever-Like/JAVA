package day14;

public class Array05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[3][4];
	int[][]	array1= {{1,2},{2,3,4,5,6},{3}};
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				System.out.print(array1[i][j]);
			}
			System.out.println();
		}
//		Array07 a=new Array07();
//		System.out.println(a);
	}

}
