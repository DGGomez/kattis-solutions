package prct;

import java.util.Scanner;

public class judgingMoose {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int left = scan.nextInt();
		int right = scan.nextInt();
		int total = left+right;
		
		if(left==right) {
			if(left==0) {
				System.out.println("Not a moose");
			}
			else {
				System.out.println("Even "+total);
			}
		}
		else {
			if(left>right) {
				total=left+left;
			}
			else {
				total = right+right;
			}
			System.out.println("Odd "+total);
		}
	}

}
