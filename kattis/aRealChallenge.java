package kattis;

import java.util.Scanner;

public class aRealChallenge {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int x = scan.nextInt();
double square = (4* Math.sqrt(x));

if(square%1==0){
	 
	 System.out.println((int)square);
}
else{
	
	System.out.println(square);
}

	}

}
