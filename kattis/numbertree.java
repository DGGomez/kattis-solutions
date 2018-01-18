package prct;

import java.util.Scanner;

public class numbertree {
	static Node root=null;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int height = Integer.parseInt(scan.next());
		String directions = scan.next();
		int size = treeNumbers(height+1);
		
		treeCreate(size);
		
		traverse(directions,root);
	}
	public static void traverse(String directions,Node focus) {
		System.out.println(focus.key);
		if(directions.equals("")) {System.out.println(focus.key);}
		else {
			
				if(directions.length()==1) {
					if(directions.substring(0,1).equals("L")) {
						traverse("",focus.leftChild);
					}	
					if(directions.substring(0,1).equals("R")) {
						traverse("",focus.rightChild);
					}}
				
			if(directions.substring(0, 1).equals("L")) {
				traverse(directions.substring(1),focus.leftChild);
			}	
			if(directions.substring(0,1).equals("R")) {
				traverse(directions.substring(1),focus.rightChild);
			}
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
	public static void addNode(int num, Node focus) {
		Node newNode = new Node(num);
		if(focus==null)focus=newNode;
		else {
			
			if(focus.leftChild==null) {
				focus.leftChild=newNode;
			}
			else if(focus.rightChild==null) {
				focus.rightChild=newNode;
			}
			else {
				
			}
		}
		}

	public static void treeCreate(int numbers) {

		while(numbers>0) {
			addNode(numbers,root);
			
			numbers--;
		}
	}}


