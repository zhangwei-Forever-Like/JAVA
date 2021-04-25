
public class ArrBinaryTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		ArrBinaryTree arrBinaryTree = new ArrBinaryTree(arr);
		arrBinaryTree.preOrder(0);
		arrBinaryTree.infixOrder(0);
		arrBinaryTree.postOrder(0);
	}

}

class ArrBinaryTree {
	private int[] arr;

	public ArrBinaryTree(int[] arr) {
		this.arr = arr;
	}

	public void preOrder(int index) {
		if (arr.length == 0 || arr == null) {
			System.out.println("数组为空");
		}
		System.out.println(arr[index]);
		if (arr.length > 2 * index + 1) {
			preOrder(2 * index + 1);
		}
		if (arr.length > 2 * index + 2) {
			preOrder(2 * index + 2);
		}
	}

	public void infixOrder(int index) {
		if (arr.length == 0 || arr == null) {
			System.out.println("数组为空");
		}
		if (arr.length > 2 * index + 1) {
			preOrder(2 * index + 1);
		}
		System.out.println(arr[index]);
		if (arr.length > 2 * index + 2) {
			preOrder(2 * index + 2);
		}
//		System.out.println();
	}

	public void postOrder(int index) {
		if (arr.length > 2 * index + 1) {
			preOrder(2 * index + 1);
		}
		if (arr.length > 2 * index + 2) {
			preOrder(2 * index + 2);
		}
		System.out.println(arr[index]);
	}
}