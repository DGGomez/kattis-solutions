package kattis;

import java.util.Scanner;

public class spavanac {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int hour = scan.nextInt();
	int min = scan.nextInt();
	
	if((min-45)<0){
		if(hour==0){
			hour=24;
		}
		hour--;
		min=min+60-45;
	}
	else{
		min=min-45;
	}
	
System.out.println(hour+" "+min);
}}
