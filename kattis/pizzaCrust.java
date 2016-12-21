package kattis;

import java.util.Scanner;

public class pizzaCrust {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double pi = 3.14159;
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		double area1 = pi*a*a;
		double area2 = pi *b*b;
		double ans = ((area2)/area1)*100;
		if(ans ==100){
			System.out.println("0.000000000");
		}
		else
		System.out.printf("%.6f",ans);
	}

}
