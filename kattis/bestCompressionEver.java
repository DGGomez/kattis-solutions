/**
 * 
 */
package nkattis;

import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class bestCompressionEver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		long b = scan.nextLong();
		
		b=((long)1<<(b+1))-1;
		if(n<=b) System.out.println("yes");
		else System.out.println("no");
}
}
