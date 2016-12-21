package kattis;

import java.util.Scanner;

public class cold {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int check;
		int counter=0;
		for( int i =0; i<n;i++){
			check = Integer.parseInt(scan.next());
			if(check<0){
				counter++;
			}
		}
		System.out.println(counter);
	}

}
