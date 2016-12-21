package kattis;

import java.util.Scanner;

public class jumbledCompass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
int begin = scan.nextInt();
int end = scan.nextInt();
int d1 = begin-end;
int d2 = (360-begin)+end;
int d3 = begin +end;
if(d1>d2){
	System.out.println(d2);
}
else System.out.println(d1);
	}

}
