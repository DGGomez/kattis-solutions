package prct;

import java.util.Scanner;

public class daylight {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.next());
		String direction;
		int saved;
		int hour;
		int minute;
		int result;
		while(number>0) {
			direction=scan.next();
			saved=Integer.parseInt(scan.next());
			hour=Integer.parseInt(scan.next());
			minute=Integer.parseInt(scan.next());
			
			if(direction.equals("B")) {
				if(hour==0) hour=24;
				result=hour*60+minute-saved;
				if(result<0) {
					hour=24+hour;
				}
				result=hour*60+minute-saved;
				if(result/60>=24) System.out.println(((result/60)-24)+" "+result%60);
				else {
				System.out.println(result/60+" "+result%60);
			}}
			if(direction.equals("F")) {
				
				result=hour*60+minute+saved;
				if(result/60>=24) System.out.println(((result/60)-24)+" "+result%60);
				else {
				System.out.println(result/60+" "+result%60);
				}
			}
			number--;
		}
	}

}
