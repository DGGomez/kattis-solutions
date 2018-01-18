package kattis;

import java.util.Scanner;

public class volim {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int qstart = Integer.parseInt(scan.next());
	int qnumb = Integer.parseInt(scan.next());
	int time = 3*60 +30;
	int qtime;
	String state;
	while(qnumb>0 && time >0){
		qtime = Integer.parseInt(scan.next());
		state = scan.next();

		qnumb--;
		time-=qtime;
		if(time<0){break;}
		if(state.substring(0).equals("T")){
		qstart++;
		if(qstart>8){
			qstart=1;
		}
		}
	}
	System.out.println(qstart);
	}

}
