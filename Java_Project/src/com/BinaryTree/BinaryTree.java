package com.BinaryTree;

public class BinaryTree {
	private class Node{
		private int data;
		public Node left,right;
		
		public Node(int data) {
			this.data = data;
		}
//		public int getData(){
//			return data;
//			}
		}
	private Node root;
	
	public void add(int data) {
		Node n = new Node(data);
	if(root==null) {
		root = n;
	}
	else {
	Node t = root;
	while(true) {
		if(data==t.data) break;
		if(data>t.data) {
			if(t.right==null) {
				t.right = n;
				break;
			}
			else {
				t=t.right;
			}
		}
		if(data<t.data) {
			if(t.left==null) {
				t.left = n;
				break;
			}
			else {
				t = t.left;
			}
		}
	}
	}
	}
    public void InOrder() {
        InOrder(root);
    }

    private void InOrder(Node node) {
        if (node == null) return;
        InOrder(node.left);
        System.out.print(node.data+" ");
        InOrder(node.right);
    }
}
