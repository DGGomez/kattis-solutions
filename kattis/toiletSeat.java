package kattis;

import java.util.Scanner;

public class toiletSeat {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	String line = scan.nextLine();	
	
	}
public static int uppers(String line){
	int result=0;
	for(int i =0; i<line.length(); i++){
		if(i==0 ||(i>0&& line.substring(i,i+1).equals(line.substring(i-1,i)))){
			result++;
		}
		if(line.substring(i,i+1).equals(line.substring(i-1,i))){
			
		}
	}
	return result;
}
public static int downers(String line){
	int result=0;
	return result;
}
public static int inbetweeners(String line){
	int result=0;
	return result;
}
}
