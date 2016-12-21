package kattis;

import java.util.Scanner;

public class standOnZanzibar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y,a,b;
		while(x>0){
			x--;
			y=0;
			a=scan.nextInt();
			b=scan.nextInt();
			while(b!=0){
				if(b>2*a)y+=b-2*a;
			a=b;
			b=scan.nextInt();
			}
			
			System.out.println(y);
		}
	}

}
