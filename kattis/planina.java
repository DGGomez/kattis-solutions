package prct;

import java.util.Scanner;

public class planina {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	double start=2,i=0;
	int iterations = scan.nextInt();
	while(iterations>0) {
		
		start=start+Math.pow(2,i);
		iterations--;
		i++;
	}
	System.out.println((int)(start*start));
scan.close();
	}

}
