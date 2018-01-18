package prct;

import java.util.Scanner;

public class mailbox {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		int mailbox;
		int crackers;
		while(cases>0) {
			mailbox=scan.nextInt();
			crackers=scan.nextInt();
			crackers=crackers/mailbox;
			//m(m+1)/2
			cases--;
		}
	}

}
