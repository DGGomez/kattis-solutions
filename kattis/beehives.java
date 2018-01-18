/**
 * 
 */
package nkattis;

import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class beehives {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double d= scan.nextDouble();
		int count = scan.nextInt();
		double [] x; double []y;
		while(d!=0 || count!=0) {
			x=new double[count];
			y=new double[count];
			for(int i =0; i<count; i++) {
				x[i]=scan.nextDouble();
				y[i]=scan.nextDouble();
			}
			honey(x,y,d,count);
			d= scan.nextDouble();
			count = scan.nextInt();
		}
		scan.close();
	}
	static void honey(double []x, double[]y, double max, int count) {
		double total;
		int counti=0;
		int sour=0;
		int sweet=0;
		for(int i =0; i<count; i++) {
			counti=0;
			for(int j=0; j<count; j++) {
				
				if(i!=j) {
				total=(Math.pow((x[i]-x[j]), 2)+Math.pow((y[i]-y[j]), 2));
				if(total<max*max) {
					sour++; 
					
					break;
				}}
				counti++;
			}
			if(counti==x.length) {
				
				sweet++;
			}
			
		}
		System.out.println(sour+" sour, "+sweet+" sweet");
	}

}
