package kattis;

import java.util.Scanner;

public class amazingCannonball {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
double x = scan.nextDouble();
double v0,theta, x1,h1,h2,t,y;
double g = 9.81;
while(x>0){
	v0=scan.nextDouble();
	theta =Math.toRadians(scan.nextDouble());
	x1 = scan.nextDouble();
	h1=scan.nextDouble();
	h2 = scan.nextDouble();
	t=x1/(v0*Math.cos(theta));
	y= v0*t*Math.sin(theta)-(0.5)*g*t*t;

	if(h1<=y-1&&y+1<=h2){
		System.out.println("Safe");
	}
	else System.out.println("Not Safe");
	x--;
}
	}

}
