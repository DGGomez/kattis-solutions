/**
 * 
 */
package nkattis;

import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class hangingouontheterrace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int x= scan.nextInt();
		String state;
		int number,count=0,refuse=0,r=0;
		for(int i =0; i<x; i++) {
			state=scan.next();
			number=scan.nextInt();
			if(state.equals("enter")) {
				if((count+number)<=l) {
					count+=number;
				}
				else {
					//find difference
					refuse=l-count;
					refuse=number-refuse;
					r++;
					count=l;
				}
				
			}
			if(state.equals("leave")) {
				count-=number;
			}

		}
		System.out.println(r);
		scan.close();
	}

}
