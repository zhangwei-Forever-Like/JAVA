import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HuffmanTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 13, 7, 8, 3, 29, 6, 1 };
		BinaryTree02 binaryTree=new BinaryTree02(createHuffmanTree(arr));
		binaryTree.preOrder();
	}

	public static Node createHuffmanTree(int[] arr) {
		List<Node> nodes = new ArrayList<Node>();
		for (int i = 0; i < arr.length; i++) {
			nodes.add(new Node(arr[i]));
		}
		while (nodes.size() > 1) {
			Collections.sort(nodes);
			Node leftNode = nodes.get(0);
			Node rightNode = nodes.get(1);
			Node parent = new Node(leftNode.value + rightNode.value);
			parent.left = leftNode;
			parent.right = rightNode;
			nodes.remove(leftNode);
			nodes.remove(rightNode);
			nodes.add(parent);
		}
		return nodes.get(0);
	}
}
class BinaryTree02{
	private Node root;

	public BinaryTree02(Node root) {
		this.root = root;
	}
	public void preOrder() {
		if(root!=null) {
			root.preOrder();
		}else {
			System.out.println("没有找到");
		}
	}
	public void infixOrder() {
		if(root!=null) {
			root.infixOrder();
		}else {
			System.out.println("没有找到");
		}
	}
	public void postOrder() {
		if(root!=null) {
			root.postOrder();
		}else {
			System.out.println("没有找到");
		}
	}
}
class Node implements Comparable<Node> {
	public int value;
	Node left;
	Node right;

	public Node(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + "]";
	}

	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return this.value - o.value;
	}
	public void preOrder() {
		System.out.println(this);
		if(this.left!=null) {
			this.left.preOrder();
		}
		if(this.right!=null) {
			this.right.preOrder();
		}
	}
	public void infixOrder() {
		if(this.left!=null) {
			this.left.preOrder();
		}
		System.out.println(this);
		if(this.right!=null) {
			this.right.preOrder();
		}
	}
	public void postOrder() {
		if(this.left!=null) {
			this.left.preOrder();
		}
		if(this.right!=null) {
			this.right.preOrder();
		}
		System.out.println(this);
	}
}