/**
 * 
 */
package nkattis;

import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class semafori {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int number = scan.nextInt();
		int distance,red,green, seconds=0, position=0;
		for(int i =0; i<count; i++) {
			distance= scan.nextInt();
			red= scan.nextInt();
			green= scan.nextInt();
			seconds+= distance-position;
			position=distance;
			
			if(seconds%(red+green)<red) seconds+=red - seconds%(red+green);
			
		}
		seconds += number-position;
		System.out.println(seconds);
	}
	

}
