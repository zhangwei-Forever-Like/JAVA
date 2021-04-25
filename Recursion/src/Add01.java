
public class Add01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(100));
		System.out.println(-3 % 5);
//    System.out.println(1>null);
		int temp;
		int[] arr = { 3, 5, 2, 5, 8, 9, 6 };
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf(arr[i] + " ");
		}
		System.out.println();
		for (int i : arr) {
			System.out.printf(i+" ");
		}
	}

	public static int add(int i) {
		if (i == 1) {
			return 1;
		}
		return i + add(i - 1);
	}
}
