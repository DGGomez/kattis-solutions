/**
 * 
 */
package nkattis;

import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class cursedarkness {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		double x,y; int inner;
		double [] xi; double [] yi;
		for(int i=0; i<count; i++) {
			x=scan.nextDouble();
			y=scan.nextDouble();
			inner=scan.nextInt();
			xi=new double[inner]; yi=new double[inner];
			for(int j =0; j<inner; j++) {
				xi[j]=scan.nextDouble();
				yi[j]=scan.nextDouble();
			}
			dist(xi,yi,x,y);
		}
		scan.close();
		
	}
	static void dist(double [] x, double [] y, double x1, double y1) {
		double distance=0;
		for(int i =0; i<x.length; i++) {
			distance=(Math.pow((x[i]-x1), 2)+Math.pow((y[i]-y1), 2));
			if(distance<64) {
				System.out.println("light a candle");
				return;
			}
		}
		System.out.println("curse the darkness");
	}
	

}
