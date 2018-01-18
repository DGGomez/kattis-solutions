/**
 * 
 */
package nkattis;

import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class phd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		for(int i =0; i<count; i++) {
			String line = scan.next();
			if(line.equals("P=NP")) {
				System.out.println("skipped");
			}
			else {
				line = line.replaceAll("\\+", " +");
				String [] split = line.split(" +");
				int value = Integer.parseInt(split[0])+Integer.parseInt(split[1]);
				System.out.println(value);
			}
		}
		scan.close();
	}

}
