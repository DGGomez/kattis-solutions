package kattis;

import java.util.Scanner;

public class bijele {
public static void main(String[]args){
	int one,counter, check;
	check=1;
	counter=0;
	Scanner scan = new Scanner(System.in);
	while(scan.hasNext()){
		one = scan.nextInt();
		if(counter==2){
			check=2;
		}
		else if(counter==5){
			check=8;
		}
		counter++;
		if(one!=check){
			if(one<check){
				one=check-one;
				System.out.println(one);
			}
			else{
				one= check-one;
				System.out.println(one);
			}
		}
		else {System.out.println(0);}
	}
	
}
}
