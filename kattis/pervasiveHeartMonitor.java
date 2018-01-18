package kattis;

import java.util.Scanner;

public class pervasiveHeartMonitor {
	private static double count=0;
	private static double adder=0;
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(scan.hasNext()){
		String[] line = scan.nextLine().split(" ");
		String name="";
		String s="";
		count=0;
		adder=0;
		for(int i =0; i<line.length; i++){
	try{
		s = line[i];
		Double.parseDouble(s);
		count++;
		adder+=Double.parseDouble(s);
	}
	catch(NumberFormatException e) { 
        name += s+" ";
    } catch(NullPointerException e) {
    }}
		double average = adder/(double)count;
	System.out.printf("%.6f"+" "+name+"\n",average);
	
	}
	
	}

}
