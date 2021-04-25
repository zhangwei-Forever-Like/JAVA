package day05;

public class Array04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int t1,t2=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("结果为：");
		for (int i = 0; i < 3; i++) {
			t2++;
			if(i<3) {
			t1 = arr[0][i];
			arr[0][i] = arr[i][0];
			arr[i][0] = t1;
		}
			if (t2 == 3) {
				t2 = 2;
				t1 = arr[1][i];
				arr[1][i] = arr[i][1];
				arr[i][1] = t1;
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
