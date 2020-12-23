package dataStruc;

public class CustomBinaryTree {

	static Node root;
	
	static class Node{
		Integer data;
		Node left, right;
		
		Node(Integer data){
			this.data = data;
			this.left=this.right = null;
		}
	}
	
	public static Node addRecursive(Node node, Integer data) {
		if(node ==  null)
			return new Node(data);
		
		if(data < node.data) {
			node.left = addRecursive(node.left, data);
		}else if(data> node.data) {
			node.right = addRecursive(node.right, data);
		}else {
			return node;	
		}
		return node;
	}
	
	public void add(int data) {
		root = addRecursive(root, data);
	}
	
	private boolean conatsinRecursive(Node current, int data) {
		if (current == null)
			return false;
		
		if(current.data == data)
			return true;
		
		return data < current.data ? conatsinRecursive(current.left, data)
									: conatsinRecursive(current.right, data);
	}
	
	public boolean containsNode(int data) {
		return conatsinRecursive(root, data);
	}
	
	public static void main(String[] args) {
		CustomBinaryTree bt = new CustomBinaryTree();
		bt.add(6);
	    bt.add(4);
	    bt.add(8);
	    bt.add(3);
	    bt.add(5);
	    bt.add(7);
	    bt.add(9);

	    System.out.println(bt.containsNode(7));
	    System.out.println(bt.containsNode(17));
	}

}
