/**
 * 
 */
package nkattis;

import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class timeTravelling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		int start=0;
		if(x==0&& y==1)System.out.println("ALL GOOD");
		else if(y==1)System.out.println("IMPOSSIBLE");
		else System.out.printf("%.6f", (double)(x/(1-y)));
	}

}
