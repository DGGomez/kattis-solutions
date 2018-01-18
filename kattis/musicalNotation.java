package kattis;

import java.util.Scanner;

public class musicalNotation {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	int P = scan.nextInt();
	int Q = scan.nextInt();
	if(N+P>Q){
		System.out.println("paul");
	}
	else{
		System.out.println("opponent");
	}
	}

}
