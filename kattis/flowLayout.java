/**
 * 
 */
package nkattis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class flowLayout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max=scan.nextInt();
		int x,y;
		int mwidth=0, mlength=0,mline=0,mwid=0;
		while(max!=0) {
			x=scan.nextInt();
			y=scan.nextInt();
			mwidth=0; mlength=0;mline=0;mwid=0;
			while(x!=-1 || y!=-1) {
				if(mwid+x<=max) {
					mwid+=x;
					if(y>mline) {
						mline=y;
						
					}
				}
				else {
					if(mwid>mwidth) {mwidth=mwid;}
					mlength+=mline;
					mwid=x;
					mline=y;
				}
				x=scan.nextInt();
				y=scan.nextInt();
			}
			if(mwid>mwidth) {mwidth=mwid;}
			mlength+=mline;
			mwid=0;
			mline=0;
			System.out.println(mwidth+" x "+mlength);
			max=scan.nextInt();
		}
	}
}