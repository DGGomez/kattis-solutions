package prct;

import java.util.Scanner;

public class noDuplicate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		String [] splitline = line.split(" ");
		int innercount=0,outercount=0;;
		for(int i =0; i<splitline.length; i++) {
			innercount=0;
			for(int j=0; j<splitline.length; j++) {
				if(splitline[i].equals(splitline[j]))innercount++;
			}
			if(innercount>1) {outercount++; System.out.println("no"); break;}
		}
		if(outercount==0) System.out.println("yes");
	}

}
