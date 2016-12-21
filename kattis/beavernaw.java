package kattis;

import java.util.Scanner;

public class beavernaw {
	private static double pi= 3.14159;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int D = scan.nextInt();
		int V = scan.nextInt();
		double r1= D/2.0;
		double bD = V-2*pi*r1*D-2*pi*r1*r1;
		System.out.println(bD);
		bD=bD/(-2*pi);
		System.out.println(bD);
		bD=bD-r1*(r1+Math.sqrt(2*r1*r1));
		System.out.println(bD);
		bD=bD/(0.5-(1/(2*Math.sqrt(2))));
		System.out.println(bD);
		bD = Math.sqrt(bD*(-1));
		System.out.println(bD);
	}
	
}
