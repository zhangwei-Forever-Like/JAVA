
public class BinarySortTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 3, 10, 12, 5, 1, 9, 0 };
		BinarySortTree binarySortTree = new BinarySortTree();
		for (int i = 0; i < arr.length; i++) {
			binarySortTree.add(new Node03(arr[i]));
		}
		binarySortTree.infixOrder();
		binarySortTree.deleteNode03(10);
//		System.out.println("删除后");
//		binarySortTree.infixOrder();
		binarySortTree.deleteNode03(7);
		binarySortTree.deleteNode03(9);
		binarySortTree.deleteNode03(12);
		binarySortTree.deleteNode03(10);
		binarySortTree.deleteNode03(0);
		binarySortTree.deleteNode03(1);
		binarySortTree.deleteNode03(3);
		System.out.println("删除后");
		binarySortTree.infixOrder();
	}

}

class BinarySortTree {
	public Node03 root;

	public void add(Node03 node) {
		if (root != null) {
			root.add(node);
		} else {
			root = node;
		}
	}

	public Node03 search(int value) {
		if (root != null) {
			return root.search(value);
		} else {
			return null;
		}
	}

	public Node03 searchParent(int value) {
		if (root != null) {
			return root.searchParent(value);
		} else {
			return null;
		}
	}

	public int delRightTreeMin(Node03 node) {
		Node03 target = node;
		while (target.left != null) {
			target = target.left;
		}
		deleteNode03(target.value);
		return target.value;
	}

	public void deleteNode03(int value) {
		if (root == null) {
			return;
		} else {
			Node03 targetNode = search(value);
			Node03 parent = searchParent(value);
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

class Node03 {
	int value;
	Node03 left;
	Node03 right;

	public Node03(int value) {
		this.value = value;
	}

	public void add(Node03 node) {
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

	public Node03 search(int value) {
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

	public Node03 searchParent(int value) {
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

	@Override
	public String toString() {
		return "Node03 [value=" + value + "]";
	}
}