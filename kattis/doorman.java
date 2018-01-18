package prct;

import java.util.Scanner;

public class doorman {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int memory = Integer.parseInt(scan.nextLine());
			
			String [] line=scan.nextLine().split("");
			enter(memory,line);


	}
	public static void enter(int memory,String []line) {
		int result=0;
		int countM=0;
		int countW=0;
		for(int i=0; i<line.length;i++) {
			if(line[i].equals("M")) {
				countM++;
			}
			if(line[i].equals("W")) {
				countW++;
			}
			if(Math.abs(countM-countW)==(memory)) {
				if(countM>countW) {
					if(i<line.length-2 ) {
						if(line[i+1].equals("M")) {
							line[i+1]=line[i+2];
							line[i+2]="M";
						}
					}
				}
				if(countW>countM) {
					if(i<line.length-2 ) {
						if(line[i+1].equals("W")) {
							line[i+1]=line[i+2];
							line[i+2]="W";
						}
					}
				}
			}
			if(Math.abs(countM-countW)>memory) {
				break;
			}
		
			result++;
		}
		System.out.println(result);
	}

}
