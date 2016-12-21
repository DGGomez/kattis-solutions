package kattis;

import java.util.Scanner;

public class quickEstimate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int k= Integer.parseInt( scan.nextLine());
		String d;
for(int i=0; i<k;i++){
	d=scan.nextLine();
	System.out.println(d.length());
}
	}
}
