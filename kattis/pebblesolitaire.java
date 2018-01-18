/**
 * 
 */
package nkattis;

import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class pebblesolitaire {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		String line;
		for(int i =0; i<count; i++) {
			line = scan.nextLine();
			if(line.substring(8,11).equals("-oo")) {
				line = line.substring(0,8)+"o--";
			}
			if(line.substring(0,3).equals("oo-")) {
				line = "--o"+line.substring(3);
			}
			System.out.println(pebbleCount(makeMove(line)));
		}

	}
	public static int pebbleCount(String line) {
		int result=0;
		for(int i =0; i<line.length(); i++) {
			if(line.substring(i, i+1).equals("o"))result++;
		}
		return result;
	}

public static String makeMove(String line) {
	String result,r1="",r2="";

	while(true) {
		
		
	 if(line.contains("-oo")&&line.contains("oo-")) {
			//two possibilities
			r1=makeMove(line.replace("-oo", "o--"));
			r2=makeMove(line.replace("oo-", "--o"));
			if(pebbleCount(r1)==pebbleCount(r2)) {
				r1=makeMove(r1);
				r2=makeMove(r2);
				if(pebbleCount(r1)<pebbleCount(r2)) {line=r1;}
				
				else {line =r2;}
			}
			else if(pebbleCount(r1)<pebbleCount(r2)) {line=r1;}
		
			else {line =r2;}
		}
		else if(line.contains("-oo")) {
			//single possibility
			line=line.replace("-oo", "o--");

		}
		else if(line.contains("oo-")) {
			//single possibility
			line=line.replace("oo-", "--o");
		}
		else {
			//no possibility
			break;
		}
	}
	result=line;
	return result;
}

}
