package kattis;

import java.util.Scanner;

public class doors {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
int r, l,w, count;
r= Integer.parseInt(scan.next());
l = Integer.parseInt(scan.next());
w = Integer.parseInt(scan.next());
count = Integer.parseInt(scan.next());
double door1, door2;
while(count>0){
	door1=Double.parseDouble(scan.next());
	door2=Double.parseDouble(scan.next());
	count--;
}
	}

}
