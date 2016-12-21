package kattis;

import java.util.Scanner;

public class mixedFraction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()){
		int numerator = scan.nextInt();
		int denominator = scan.nextInt();
		if(numerator!=0 && denominator!=0)
		System.out.println((numerator/denominator)+" "+numerator%denominator+" "+"/ "+denominator);
	}}

}
