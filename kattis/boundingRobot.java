package kattis;

import java.util.Scanner;

public class boundingRobot {
private static int x=0,y=0;
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int aX = Integer.parseInt(scan.next());
	int aY = Integer.parseInt(scan.next());
	int walks = Integer.parseInt(scan.next());
	while(walks>0){
	String action = scan.next();
	int move = Integer.parseInt(scan.next());
	adder(action,move,aX,aY);
	walks--;
	}
	System.out.println(x+" "+y);
	}
public static void adder(String move, int k,int aX,int aY){

	if(move.substring(0).equals("u")){
		y+=k;
		
	}
if(move.substring(0).equals("d")){
			y-=k;
	}
if(move.substring(0).equals("l")){
	y+=k;
}
if(move.substring(0).equals("r")){
	y-=k;
}
if(y>aY)y=aY;
if(y<0)y=0;
if(x>aX)x=aX;
if(x<0)x=0;
}
}
