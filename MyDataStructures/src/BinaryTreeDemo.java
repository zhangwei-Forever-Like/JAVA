
public class BinaryTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree binaryTree = new BinaryTree();
		HeroNode03 root = new HeroNode03(1, "宋江");
		HeroNode03 node2 = new HeroNode03(2, "吴用");
		HeroNode03 node3 = new HeroNode03(3, "卢俊义");
		HeroNode03 node4 = new HeroNode03(4, "林冲");
		HeroNode03 node5 = new HeroNode03(5, "关胜");
		binaryTree.setRoot(root);
		root.setLeft(node2);
		root.setRight(node3);
		node3.setRight(node4);
		node3.setLeft(node5);
		binaryTree.preOrder();
		System.out.println();
		binaryTree.infixOrder();
		System.out.println();
		binaryTree.postOrder();
		System.out.println("查找");
		System.out.println(binaryTree.preOrderSearch(2));
		System.out.println(binaryTree.infixOrderSearch(3));
		System.out.println(binaryTree.postOrderSearch(4));
		System.out.println("删除节点");
		binaryTree.delete(5);
		System.out.println("前序遍历");
		binaryTree.preOrder();
		System.out.println("中序遍历");
		binaryTree.infixOrder();
		System.out.println("后序遍历");
		binaryTree.postOrder();
	}

}

class BinaryTree {
	private HeroNode03 root;

	public void setRoot(HeroNode03 root) {
		this.root = root;
	}

	public void preOrder() {
		if (this.root != null) {
			this.root.preOrder();
		} else {
			System.out.println("没有找到节点");
		}
	}

	public void infixOrder() {
		if (this.root != null) {
			this.root.infixOrder();
		} else {
			System.out.println("没有找到节点");
		}
	}

	public void postOrder() {
		if (this.root != null) {
			this.root.postOrder();
		} else {
			System.out.println("没有找到节点");
		}
	}

	public HeroNode03 preOrderSearch(int no) {
		if (root != null) {
			return root.preOrderSearch(no);
		} else {
			return null;
		}
	}

	public HeroNode03 infixOrderSearch(int no) {
		if (root != null) {
			return root.infixOrderSearch(no);
		} else {
			return null;
		}
	}

	public HeroNode03 postOrderSearch(int no) {
		if (root != null) {
			return root.postOrderSearch(no);
		} else {
			return null;
		}
	}
	public void delete(int no) {
		if(root.getLeft()==null&&root.getRight()==null) {
			root=null;
		}else {
			root.delete(no);
		}
	}
}

class HeroNode03 {
	private int no;
	private String name;
	private HeroNode03 left;
	private HeroNode03 right;

	public HeroNode03(int no, String name) {
		this.no = no;
		this.name = name;
	}

	@Override
	public String toString() {
		return "HeroNode [no=" + no + ", name=" + name + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HeroNode03 getLeft() {
		return left;
	}

	public void setLeft(HeroNode03 left) {
		this.left = left;
	}

	public HeroNode03 getRight() {
		return right;
	}

	public void setRight(HeroNode03 right) {
		this.right = right;
	}

	public void preOrder() {
		System.out.println(this);
		if (this.left != null) {
			this.left.preOrder();
		}
		if (this.right != null) {
			this.right.preOrder();
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

	public void postOrder() {
		if (this.left != null) {
			this.left.postOrder();
		}
		if (this.right != null) {
			this.right.postOrder();
		}
		System.out.println(this);
	}

	public HeroNode03 preOrderSearch(int no) {
		if (this.no == no) {
			return this;
		}
		HeroNode03 resNode = null;
		if (this.left != null) {
			resNode = this.left.preOrderSearch(no);
		}
		if (resNode != null) {
			return resNode;
		}
		if (this.right != null) {
			resNode = this.right.preOrderSearch(no);
		}
		if (resNode != null) {
			return resNode;
		}
		return null;
	}

	public HeroNode03 infixOrderSearch(int no) {
		HeroNode03 resNode = null;
		if (this.left != null) {
			resNode = this.left.infixOrderSearch(no);
		}
		if (resNode != null) {
			return resNode;
		}
		if (this.no == no) {
			return this;
		}
		if (this.right != null) {
			resNode = this.right.infixOrderSearch(no);
		}
		return resNode;
	}

	public HeroNode03 postOrderSearch(int no) {
		HeroNode03 resNode = null;
		if (this.left != null) {
			resNode = this.left.infixOrderSearch(no);
		}
		if (resNode != null) {
			return resNode;
		}
		if (this.right != null) {
			resNode = this.right.preOrderSearch(no);
		}
		if (resNode != null) {
			return resNode;
		}
		if (this.no == no) {
			return this;
		}
		return null;
	}
	public void delete(int no) {
		if(this.left!=null&&this.left.no==no) {
			this.left=null;
			return;
		}
		if(this.right!=null&&this.right.no==no) {
			this.right=null;
			return;
		}
		if(this.left!=null) {
		    this.left.delete(no);
		}
		if(this.right!=null) {
			this.right.delete(no);
		}
	}
}