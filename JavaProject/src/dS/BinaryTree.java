package dS;

public class BinaryTree {
	private int data;
	private BinaryTree left;
	private BinaryTree right;
	
	public BinaryTree(int data) {
		this.data=data;
		this.left=null;
		this.right=null;
	}
	
	public void addNode(int num) {
		if(num<this.data) {
			if(this.left!=null) {
				this.left.addNode(num);
			}else {
				this.left=new BinaryTree(num);
			}
		}else {
			if(this.right!=null) {
				this.right.addNode(num);
			} else {
				this.right=new BinaryTree(num);
			}
		}
		
	}
}
