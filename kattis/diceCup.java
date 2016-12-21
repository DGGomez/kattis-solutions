package kattis;

import java.util.Scanner;

public class diceCup {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		if(x>=y){
		while(x+1>y){
			y++;
			System.out.println(y);
		}
	}
	else{
		while(x<y+1){
			x++;
			System.out.println(x);
		}
	}

}
}