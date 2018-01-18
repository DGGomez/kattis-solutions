/**
 * 
 */
package nkattis;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class passwords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		String pass;
		double stats;
		double total=0;
		double [] arr = new double[count];
		for(int i =0; i<count; i++) {
			pass=scan.next();
			stats=scan.nextDouble();
			arr[i]=stats;
			//total+=stats*(i+1);
		}
		Arrays.sort(arr);
		for(int j=0; j<count; j++) {
			total+=arr[arr.length-j-1]*(j+1);
		}
		System.out.printf("%.4f",total);

	}

}
