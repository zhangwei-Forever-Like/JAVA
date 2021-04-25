
public class AVLTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = { 4, 3, 6, 5, 7, 8 };
//		int[] arr = { 10, 12, 8, 9, 7, 6 };
		int[] arr = { 10, 11, 7, 6, 8, 9 };
		AVLTree avlTree = new AVLTree();
		for (int i = 0; i < arr.length; i++) {
			avlTree.add(new Node04(arr[i]));
		}
		System.out.println("中序遍历");
		avlTree.infixOrder();
		System.out.println("树的高度" + avlTree.root.height());
		System.out.println("左子树的高度" + avlTree.root.leftHeight());
		System.out.println("右子树的高度" + avlTree.root.rightHeight());
		System.out.println(avlTree.root);
	}

}

class AVLTree {
	public Node04 root;

	public void add(Node04 node) {
		if (root != null) {
			root.add(node);
		} else {
			root = node;
		}
	}

	public Node04 search(int value) {
		if (root != null) {
			return root.search(value);
		} else {
			return null;
		}
	}

	public Node04 searchParent(int value) {
		if (root != null) {
			return root.searchParent(value);
		} else {
			return null;
		}
	}

	public int delRightTreeMin(Node04 node) {
		Node04 target = node;
		while (target.left != null) {
			target = target.left;
		}
		deleteNode04(target.value);
		return target.value;
	}

	public void deleteNode04(int value) {
		if (root == null) {
			return;
		} else {
			Node04 targetNode = search(value);
			Node04 parent = searchParent(value);
			if (targetNode == null) {
				return;
			}
			if (root.left == null && root.right == null) {
				root = null;
				return;
			}
			if (targetNode.left == null && targetNode.right == null) {
				if (parent.left != null && parent.left.value == value) {
					parent.left = null;
				} else if (parent.right != null && parent.right.value == value) {
					parent.right = null;
				}
			} else if (targetNode.left != null && targetNode.right != null) {
				int min = delRightTreeMin(targetNode.right);
				targetNode.value = min;
			} else {
				if (targetNode.left != null) {
					if (parent != null) {
						if (parent.left.value == value) {
							parent.left = targetNode.left;
						} else {
							parent.right = targetNode.left;
						}
					} else {
						root = targetNode.left;
					}
				} else {
					if (parent != null) {
						if (parent.left.value == value) {
							parent.left = targetNode.left;
						} else {
							parent.right = targetNode.left;
						}
					} else {
						root = targetNode.right;
					}
				}
			}
		}
	}

	public void infixOrder() {
		if (root != null) {
			root.infixOrder();
		} else {
			System.out.println("二叉树为空");
		}
	}
}

class Node04 {
	int value;
	Node04 left;
	Node04 right;

	public Node04(int value) {
		this.value = value;
	}

	public int leftHeight() {
		if (left == null) {
			return 0;
		}
		return left.height();
	}

	public int rightHeight() {
		if (right == null) {
			return 0;
		}
		return right.height();
	}

	public int height() {
		return Math.max(left == null ? 0 : left.height(), right == null ? 0 : right.height()) + 1;
	}

	public void add(Node04 node) {
		if (node == null) {
			return;
		}
		if (this.value > node.value) {
			if (this.left != null) {
				this.left.add(node);
			} else {
				this.left = node;
			}
		} else {
			if (this.right != null) {
				this.right.add(node);
			} else {
				this.right = node;
			}
		}
		if (rightHeight() - leftHeight() > 1) {
			if (right != null && right.leftHeight() > right.rightHeight()) {
				right.rightRotate();
				leftRotate();
			} else {
				leftRotate();
			}
			return;
		}
		if (leftHeight() - rightHeight() > 1) {
			if (left != null && left.leftHeight() < left.rightHeight()) {
				left.leftRotate();
				rightRotate();
			} else {
				rightRotate();
			}
		}
	}

	public void infixOrder() {
		if (this.left != null) {
			this.left.infixOrder();
		}
		System.out.println(this);
		if (this.right != null) {
			this.right.infixOrder();
		}
	}

	public Node04 search(int value) {
		if (this.value == value) {
			return this;
		} else if (this.value > value) {
			if (this.left == null) {
				return null;
			}
			return this.left.search(value);
		} else {
			if (this.right == null) {
				return null;
			}
			return this.right.search(value);
		}
	}

	public Node04 searchParent(int value) {
		if ((this.left != null && this.left.value == value) || (this.right != null && this.right.value == value)) {
			return this;
		} else {
			if (this.left != null && this.value > value) {
				return this.left.searchParent(value);
			} else if (this.right != null && this.value <= value) {
				return this.right.searchParent(value);
			} else {
				return null;
			}
		}
	}

	private void leftRotate() {
		Node04 newNode = new Node04(value);
		newNode.left = this.left;
		newNode.right = right.left;
		value = right.value;
		right = right.right;
		left = newNode;
	}

	private void rightRotate() {
		Node04 newNode = new Node04(value);
		newNode.right = this.right;
		newNode.left = left.right;
		value = left.value;
		left = left.left;
		right = newNode;
	}

	@Override
	public String toString() {
		return "Node04 [value=" + value + "]";
	}
}