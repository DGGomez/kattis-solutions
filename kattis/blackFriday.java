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
public class blackFriday {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		ArrayList<Integer>list = new ArrayList<Integer>();
		int [] outcomes= new int[count];
		for(int i =0; i<count; i++) {
			outcomes[i]=scan.nextInt();
		}
		for( int i =0; i<count; i++) {
			for(int j=0; j<count; j++) {
				if(i!=j && outcomes[i]==outcomes[j] && check(outcomes[i],list)) {
					list.add(outcomes[i]);
				}
			}
		}
		int result=-1, m=0;
		for(int i =0; i<count; i++) {
			if(check(outcomes[i],list) && m<outcomes[i]) {
				result=i+1;
				m=outcomes[i];
			}
		}
		if(result>=0)
			System.out.println(result);
		else
			System.out.println("none");
		scan.close();
	}
	public static boolean check(int value, ArrayList<Integer>list) {
		for(int item:list) {
			if(value==item) {
				return false;
			}
		}
		return true;
	}

}
