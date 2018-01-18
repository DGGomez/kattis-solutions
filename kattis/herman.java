package kattis;

import java.util.Scanner;

public class herman {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		double pi = 3.14159265359;
		double a1 = pi*r*r;
		System.out.printf("%.7f",a1);
		double a2 = r*r*2;
		System.out.println();
		System.out.printf("%.7f",a2);
	}

}
