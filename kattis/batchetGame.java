/**
 * 
 */
package nkattis;

import java.util.Scanner;

/**
 * @author Daniel
 *\
 */
public class batchetGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] line;
		int goal,size;
		int [] moves;
		while(scan.hasNextLine()) {
			line=scan.nextLine().split(" ");
			goal= Integer.parseInt(line[0]);
			moves=new int[Integer.parseInt(line[1])];
			for(int i =0; i<moves.length; i++) {
				moves[i]=Integer.parseInt(line[i+2]);
			}
		}

	}

}
