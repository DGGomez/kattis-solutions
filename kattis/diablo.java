package prct;

import java.util.Scanner;

public class diablo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();

		//square
		if((B/4)*(B/4)==A)System.out.println("Diablo is happy!");
		//rectangle or none
		else if(B>1) {
			for(int i =1; i<((B/2)-1);i++) {
				if(A==(i*((B/2)-i))) System.out.println("Diablo is happy!");
				
			}
			System.out.println("Need more materials!");
		}
		else System.out.println("Need more materials!");
	}

}
