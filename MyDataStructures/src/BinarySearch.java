import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 7,7,7,7, 9 };
		System.out.println(binarySearch(arr, 0, arr.length, 7));
	}

	public static ArrayList<Integer> binarySearch(int[] arr, int left, int right, int findVal) {
		if(left>right) {
			return new ArrayList<Integer>();
		}
		int mid = (left + right) / 2;
		int midVal = arr[mid];
		if (findVal > midVal) {
			return binarySearch(arr, mid + 1, right, findVal);
		} else if (findVal < midVal) {
			return binarySearch(arr, left, mid - 1, findVal);
		} else {
			ArrayList<Integer> resIndexlist=new ArrayList<Integer>();
			int temp=mid-1;
			while(true) {
				if(temp<0||arr[temp]!=findVal) {
					break;
				}
				resIndexlist.add(temp);
				temp--;
			}
			resIndexlist.add(mid);
			temp=mid+1;
			while(true) {
				if(temp>arr.length||arr[temp]!=findVal) {
					break;
				}
				resIndexlist.add(temp);
				temp++;
			}
			return resIndexlist;
		}
	}

}
