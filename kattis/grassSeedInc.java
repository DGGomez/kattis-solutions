package kattis;

import java.util.Scanner;

public class grassSeedInc {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double cost = scan.nextDouble();
	double count = scan.nextDouble();
	double w,l,score=0;
	while(count>0){
		w=scan.nextDouble();
		l = scan.nextDouble();
		score+= cost*(w*l);
		count--;
	}
	System.out.printf("%.7f\n",score);
	}

}
