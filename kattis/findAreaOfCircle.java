package kattis;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class findAreaOfCircle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n=Double.parseDouble(scan.next()); 
		double circle, pcircle;
		DecimalFormat df = new DecimalFormat("#.#########");
	
		while(scan.hasNext()&&n>0){
			int m =Integer.parseInt(scan.next()); 
			int o = Integer.parseInt(scan.next()); 
		circle =n*n*3.141592654;
		pcircle = (2*2*n*n)*o/m;
		
		
			System.out.println(df.format(circle)+" "+df.format(pcircle));
	
		n=Double.parseDouble(scan.next()); 
		
	}}

}
