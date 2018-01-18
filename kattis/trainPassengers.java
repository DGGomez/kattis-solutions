/**
 * 
 */
package nkattis;

import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class trainPassengers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long c = scan.nextLong();
		long n = scan.nextInt();
		long count=0,ca=0;
		long left=0,enter=0, stay=0;
		for(int i =0; i<n; i++) {
			left=scan.nextInt();
			enter=scan.nextInt();
			stay=scan.nextInt();
			count-=left;
			if(count<0) {
				ca=1;
				break;
			}
			count+=enter;
			if(count>c) {
				ca=1;
				break;
			}
			if(count!=c && stay>0){
				ca=1;
				break;
			}
			
		}
		if(ca==1) System.out.println("impossible");
		else if(count>0)System.out.println("impossible");
		else if(stay>0) System.out.println("impossible");
		else System.out.println("possible");
	}

}
