package prct;

import java.util.Scanner;

public class batter {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int number = scan.nextInt();
	double avg=0;
	double sum=0;
	int n;
	while(number>0) {
		n=scan.nextInt();
		if(n>=0) {
			sum+=n;
			avg++;
		}
		number--;
	}
	
	System.out.println(sum/avg);
	}

}
