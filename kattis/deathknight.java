package prct;

import java.util.Scanner;

public class deathknight {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = Integer.parseInt(scan.next());
		int total=0;
		String actions;
		while(cases>0) {
			actions= scan.next();
			if(actions.contains("CD")) {
				
			}
			else {
				total++;
			}
			cases--;
		}
		System.out.println(total);
	}

}
