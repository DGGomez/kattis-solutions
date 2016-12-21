package kattis;

import java.util.Scanner;

public class bela {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
int x = Integer.parseInt(scan.next());
int count = x*4;
int sum=0;
String letter= scan.next();
while(count!=0){
	String card = scan.next();
	if(card.substring(1,2).equals(letter)){
		sum=sum+dominant(card.substring(0,1));
	}
	else{
		sum=sum+nondom(card.substring(0,1));
	}
	count--;
	
}
System.out.println(sum);
	}
	public static int dominant(String a){
		int value=0;
		if(a.substring(0,1).equals("A")){
			value=11;
		}
		if(a.substring(0,1).equals("K")){
			value=4;
		}
		if(a.substring(0,1).equals("Q")){
			value=3;
		}
		if(a.substring(0,1).equals("J")){
			value=20;
		}
		if(a.substring(0,1).equals("T")){
			value=10;
		}
		if(a.substring(0,1).equals("9")){
			value=14;
		}
		return value;
	}
	public static int nondom(String a){
		int value=0;
		if(a.substring(0,1).equals("A")){
			value=11;
		}
		if(a.substring(0,1).equals("K")){
			value=4;
		}
		if(a.substring(0,1).equals("Q")){
			value=3;
		}
		if(a.substring(0,1).equals("J")){
			value=2;
		}
		if(a.substring(0,1).equals("T")){
			value=10;
		}

		return value;
	}

}
