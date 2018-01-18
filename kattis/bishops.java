package kattis;

import java.util.Scanner;

public class bishops {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		while(scan.hasNext()){
			x=scan.nextInt();
			if(x==1){
				System.out.println(1);
			}
			else if (x>1){
				System.out.println(2*x-2);
			}
			else{
				System.out.println(0);
			}
		}

	}

}
