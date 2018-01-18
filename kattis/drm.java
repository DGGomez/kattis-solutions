/**
 * 
 */
package nkattis;

import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class drm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String alpha= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Scanner scan = new Scanner(System.in);
		String line = scan.next();
		int size = line.length()/2;
		String first = line.substring(0, size);
		String second = line.substring(size,line.length());
		int fnum=0;
		int snum=0;
		for(int i =0; i<size; i++) {
			fnum=fnum+lettsToNumbers(first.substring(i,i+1));
			snum=snum+lettsToNumbers(second.substring(i,i+1));

		
	}
		
		first = rotate(first,fnum);
		second = rotate(second,snum);
		String fin = "";
		int n1=0,n2=0;
		for(int i =0; i<first.length(); i++) {
			n1=lettsToNumbers(first.substring(i,i+1));
			n2=lettsToNumbers(second.substring(i,i+1));
			n1 = (n1+n2)%26;
			fin+= alpha.substring(n1,n1+1);
		}
		System.out.println(fin);
	}
	public static int lettsToNumbers(String a) {
		String alpha= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int result=0;
		for(int i=0; i<alpha.length(); i++) {
			if(alpha.substring(i, i+1).equals(a)) {
			result=i;
			return result;}
		}
		return result;
	}
	public static String rotate(String line, int num) {
		String alpha= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String nline="";
		int n=0;
		for(int i =0; i<line.length(); i++) {
			n=lettsToNumbers(line.substring(i,i+1));
			n=(n+num)%26;
			nline+=alpha.substring(n,n+1);
		}
		return nline;
	}

}
