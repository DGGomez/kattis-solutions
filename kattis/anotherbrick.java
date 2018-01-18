/**
 * 
 */
package nkattis;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class anotherbrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int w = scan.nextInt();
		int n=scan.nextInt();
		int sum=0,count=0;
		 int [] bricks = new int[n];
		
		for(int i =0; i<n; i++) {
			bricks[i]=scan.nextInt();
		}
		//lay bricks
		for(int j =0; j<h; j++) {
			sum=0;
			while(sum<w) {
				sum+=bricks[count];
				count++;
			}
			if(sum>w) {break;}
		}
		if(sum>w) System.out.println("NO");
		else System.out.println("YES");
	}


}
