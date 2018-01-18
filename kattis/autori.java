package prct;

import java.util.Scanner;

public class autori {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.next();
		String result = line.substring(0,1);
		for(int i =0; i<line.length(); i++) {
			if(line.substring(i, i+1).equals("-")) {
				result+=line.substring(i+1,i+2);
			}
		}
		System.out.println(result);
	}

}
