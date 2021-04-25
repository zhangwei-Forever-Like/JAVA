
public class BinarySearchRecur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(binarySearchRecur(arr,2));
	}

	public static int binarySearchRecur(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int mid = (left + right) / 2;
		while (left<=right) {
			int midValue = arr[mid];
			if (midValue > target) {
				right=mid-1;
				mid = (left + right) / 2;
				
			} else if (midValue < target) {
				left=mid+1;
				mid = (left + right) / 2;
			} else {
				midValue = target;
				return mid;
			}
		}
		return -1;
	}
}
