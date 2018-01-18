/**
 * 
 */
package nkattis;

import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class babylonian {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int count = Integer.parseInt(scan.nextLine());
		String line;
		
		for(int i=0; i<count; i++) {
			line = scan.nextLine();
			System.out.println(bable(filler(line).split(",")));
		}
	}
	public static long bable(String [] line) {
		long result=0;
		
		for(int i=0; i<line.length; i++) {
		
			if(line[i].equals("")) {}
			else {
			result+=Integer.parseInt(line[i])*(Math.pow(60, line.length-(i+1)));
		}}
		return result;
	}
	public static String filler(String list) {
		String result="";
		if(list.substring(0,1).equals(",")) {
			result+="0";
		}
		for(int i =0; i<list.length()-1; i++) {
			result+=list.substring(i,i+1);
			if(list.substring(i, i+1).equals(",") && list.substring(i+1,i+2).equals(",")) {
			result+="0";
			}
		}
		if(list.substring(list.length()-1,list.length()).equals(",")) {
			result+=",0";
		}
		else {
			result+=list.substring(list.length()-1,list.length());
		}
		return result;
	}

}
