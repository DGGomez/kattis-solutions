package prct;

import java.util.Scanner;

public class alphabetspam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.next();
		String lower ="abcdefghijklmnopqrstuvwxyz";
		String upper ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		int size = line.length();
		double whitespace=0;
		double lowercase=0;
		double uppercase=0;
		double symbols=0;
		//white space
		for(int i =0; i<size; i++) {
			if(line.substring(i, i+1).equals("_")) {
				whitespace++;
			}
		}
		//lowercase
for(int i =0; i<size; i++) {
			if(lower.contains(line.substring(i,i+1))) {
				lowercase++;
			}
		}
		//uppercase
for(int i =0; i<size; i++) {
	if(upper.contains(line.substring(i,i+1))) {
		uppercase++;
	}
}
symbols= size-(uppercase+lowercase+whitespace);
System.out.printf("%.10f\n",(whitespace/size));
System.out.printf("%.10f\n",(lowercase/size));
System.out.printf("%.10f\n",(uppercase/size));
System.out.printf("%.10f\n",(symbols/size));

	}

}
