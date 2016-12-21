package kattis;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class differentDistances {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x1 = scan.nextDouble();
		double y1,x2,y2,p;
		while(x1!=0){
			y1 = scan.nextDouble();
			x2 = scan.nextDouble();
			y2 = scan.nextDouble();
			p = scan.nextDouble();
			distance(x1,y1,x2,y2,p);
			x1=scan.nextDouble();
		}
	}
	public static void distance (double x1, double y1, double x2, double y2, double p){
		double x = Math.pow(Math.abs(x1-x2), p);
		double y = Math.pow(Math.abs(y1-y2), p);
		double z = Math.pow(x+y, (1/p));
		System.out.printf("%.10f\n",z);
}
	}
