
public class paixu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 89, 67, 7, 54, 88, 2, 45, 67, 89, 65, 89, 90, 3, 6, 5, 45, 89 };
		int t;
		for (int b = 0; b < a.length - 1; b++) {
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}

	}

}
