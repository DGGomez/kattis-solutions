package prct;

import java.util.Scanner;

public class BinaryTree {

	static Node root;

	public void addNode(int key) {

		// Create a new Node and initialize it

		Node newNode = new Node(key);

		// If there is no root this becomes root

		if (root == null) {

			root = newNode;

		} else {

			// Set root as the Node we will start
			// with as we traverse the tree

			Node focusNode = root;

			// Future parent for our new Node

			Node parent;
			int count=0;
			while (true) {
				parent = focusNode;
				// root is the top parent so we start
				// there
				if(key==focusNode.key-1) {
				

				// Check if the new node should go on
				// the left side of the parent node

				if (key %2==0) {

					
					// Switch focus to the left child

					focusNode = focusNode.leftChild;

					// If the left child has no children

					if (focusNode == null) {

						// then place the new node on the left of it

						parent.leftChild = newNode;
						
						return; // All Done

					}

				} else { // If we get here put the node on the right
					
					focusNode = focusNode.rightChild;

					// If the right child has no children

					if (focusNode == null) {

						// then place the new node on the right of it

						parent.rightChild = newNode;
						return; // All Done

					}

				}
				}
				else {
					
					//left, then right
					if(count%2==0) {
						focusNode=focusNode.leftChild;
					}
					else {
						focusNode = parent.rightChild;
					}
					count++;
				}
			}
		}

	}

	// All nodes are visited in ascending order
	// Recursion is used to go to one node and
	// then go to its child nodes and so forth

	public void inOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {

			// Traverse the left node
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.leftChild);

			// Visit the currently focused on node

		

			// Traverse the right node

			inOrderTraverseTree(focusNode.rightChild);

		}

	}

public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int height = Integer.parseInt(scan.next());
		String directions = scan.next();
		int size = treeNumbers(height+1);
		
		BinaryTree theTree = new BinaryTree();
		for(int i=size; i>0; i--) {
		theTree.addNode(i);
		}

		// Different ways to traverse binary trees

		theTree.traverse(directions,theTree.root);

		theTree.inOrderTraverseTree(theTree.root);

		// Find the node with key 75


}
public static void traverse(String directions,Node focus) {

	if(directions.equals("")) {System.out.println(focus);}
	else if(focus!=null){
		
			if(directions.length()==1) {
				if(directions.substring(0,1).equals("L")) {
					traverse("",focus.leftChild);
				}	
				else if(directions.substring(0,1).equals("R")) {
					traverse("",focus.rightChild);
				}}
			else {	
		if(directions.substring(0, 1).equals("L")) {
			traverse(directions.substring(1),focus.leftChild);
		}	
		else if(directions.substring(0,1).equals("R")) {
			traverse(directions.substring(1),focus.rightChild);
		}}
		}
	
}
public static int treeNumbers(int height) {
	int result=0;
	int level=1;
	for(int i =0; i<height; i++) {
		result+=level;
		level*=2;
	}
	return result;
}

}

class Node {

	int key;

	Node leftChild;
	Node rightChild;

	Node(int key) {

		this.key = key;
		
	}

	public String toString() {

		return ""+key;

	}

}