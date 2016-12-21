package kattis;

import java.util.Scanner;

public class soylent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
double check=0;
for(int i =0; i<count;i++){
	check = scan.nextInt();
	System.out.println((int)Math.ceil(check/400));
}
	}

}
