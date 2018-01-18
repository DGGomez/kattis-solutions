/**
 * 
 */
package nkattis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class simplicity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String alpha="abcdefghijklmnopqrstuvwxyz";
		int []numb=new int[26];
		int count=0;
		for(int i =0; i<word.length(); i++) {
			
				numb[alpha.indexOf(word.charAt(i))]++;
			
		}
		Arrays.sort(numb);
		for(int i =0; i<numb.length-2; i++) {
			count+=numb[i];
		}
		System.out.println(count);
		scan.close();
	}
}
