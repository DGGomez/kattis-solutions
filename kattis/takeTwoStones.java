package kattis;

import java.util.Scanner;

public class takeTwoStones {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int x = scan.nextInt();
		if(x%2==0){
			System.out.println("Bob");
		}
		else{
			System.out.println("Alice");
		}
	}

}
