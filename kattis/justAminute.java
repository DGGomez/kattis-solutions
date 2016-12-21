package kattis;

import java.util.Scanner;

public class justAminute {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		double min=0, error=0;
		while(count>0){
			min+=scan.nextInt();
			error += scan.nextInt();
			count--;
		}
		min = min*60;
		System.out.printf("%.9f",error/min);
	}

}
