package prct;

import java.util.Scanner;

public class arithmetic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		
		while(number>0) {
			String[] nextNumber=scan.nextLine().split(" ");
		
			//arithmetic
			if(arith(nextNumber)) {
				System.out.println("arithmetic");
			}
			else {
			//permutated arithmetic
			order(nextNumber);
		     if(arith(nextNumber)) {
				System.out.println("permuted arithmetic");
			}
			//non arithmetic
			else {
				System.out.println("non-arithmetic");
			}}
			number--;
		}
	}
	
//check arithmetic
	public static boolean arith(String[]line) {
		
		int number = Integer.parseInt(line[0]);
		int first = Integer.parseInt(line[1]);
		int second = Integer.parseInt(line[2]);
		int difference=second-first;
		
		
		for(int i =1; i<line.length-1;i++) {
			first = Integer.parseInt(line[i]);
			second = Integer.parseInt(line[i+1]);
			if(second!=first+difference) return false;
		}
		return true;
	}
	
//rework order
	public static void order(String[]line) {
	
		int first;
		int second;
	
			for(int i =1; i<line.length-1; i++) {
				 
				for(int j=i+1;j<line.length;j++) {
					first = Integer.parseInt(line[i]);
			 second = Integer.parseInt(line[j]);
			 if(first>second) {
				line[i]=""+second;
				line[j]=""+first;
			 }
			}}
		
	}
}
