
public class SparseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
		int count=1;
		int[][] arrays = new int[11][11];
		arrays[1][1] = 1;
		arrays[2][2] = 1;
		arrays[3][3] = 1;
		arrays[4][4] = 1;
		arrays[9][10]=15;
		for (int i = 0; i < arrays.length; i++) {
			for (int j : arrays[i]) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("稀疏数组~~~~~~");
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays.length; j++) {
				if (arrays[i][j] != 0) {
					temp++;
				}
			}
		}
		int[][] sparseArray = new int[temp + 1][3];
		sparseArray[0][0] = arrays.length;
		sparseArray[0][1] = arrays.length;
		sparseArray[0][2] = temp;
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j < arrays.length; j++) {
				if (arrays[i][j] != 0) {
					sparseArray[count][0]=i;
					sparseArray[count][1]=j;
					sparseArray[count++][2]=arrays[i][j];
				}
			}
		}
		for (int i = 0; i < sparseArray.length; i++) {
			for (int j = 0; j < sparseArray[i].length; j++) {
				System.out.print(sparseArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}
