package kattis;

import java.util.Scanner;

public class leftBeehind {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
		int sweet = scan.nextInt();
		int sour = scan.nextInt();
		if(sour==0 && sweet==0){
			
		}
		else if((sour+sweet)==13){
			System.out.println("Never speak again.");
		}
		else if(sour>sweet){
	System.out.println("Left beehind.");
}
else if(sweet>sour){
	System.out.println("To the convention.");
}
else if(sweet==sour){
	System.out.println("Undecided.");
}
	}}

}
