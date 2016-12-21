package kattis;

import java.util.Scanner;

public class sumKindOfProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int start;
		int stuff;
		String half;
		while(count>0){
			start=scan.nextInt();
			stuff = scan.nextInt();
		
			if(stuff<10){
			half =""+ 1;	
			}
			else{
				half=""+(int)Math.ceil(stuff/2.0);
				half = half+(int)Math.ceil(stuff/2.0);
			}
			System.out.println(start+" "+half+" "+(stuff*stuff)+" "+(stuff*stuff+stuff));
			count--;
		}

	}

}
