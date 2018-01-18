/**
 * 
 */
package nkattis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author Daniel
 *
 */
public class touchscreen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		String initial;
		String [] lines;
		int inner;
		for(int i =0; i<count; i++) {
			initial=scan.next();
			inner=scan.nextInt();
			lines=new String[inner];
			for(int j=0; j<inner; j++) {
				lines[j]=scan.next();
			}
			distances(lines,initial);
			
		}
		scan.close();
	}
	
	static void distances(String [] lines, String compare) {
		ArrayList<String>l=new ArrayList<String>();
		int [] numbers = new int [lines.length];
		int count;
		for(int i =0; i<lines.length; i++) {
			count=0;
			for(int j=0; j<compare.length(); j++) {
				count+=d(compare.substring(j, j+1),lines[i].substring(j, j+1));
			}
			l.add(lines[i]+" "+count);
			numbers[i]=count;
		}
		Arrays.sort(numbers);
		Collections.sort(l, String.CASE_INSENSITIVE_ORDER);
		for(int k=0; k<numbers.length; k++) {
			count=0;
			for(String word:l) {
				
				String [] split= word.split(" ");
				if(numbers[k]==Integer.parseInt(split[1])) {
					System.out.println(split[0]+" "+split[1]);
					l.set(count, "null -1");
					break;
				}
				count++;
			}
		}
	}
	
	static int d(String a1, String a2) {
		String [] line = new String[3];
		line[0]="qwertyuiop";
		line[1]="asdfghjkl";
		line[2]="zxcvbnm";
		int count=0;
		int index1=0,index2=0;
		int i1=0, i2=0;
		for(int i=0; i<line.length; i++) {
			if(line[i].contains(a1)) index1=i;
			if(line[i].contains(a2))index2=i;
		}
		for(int j=0; j<line[index1].length(); j++) {
			if(line[index1].substring(j, j+1).equals(a1)) {i1=j; break;}
		}
for(int k=0; k<line[index2].length(); k++) {
	if(line[index2].substring(k, k+1).equals(a2)) {i2=k; break;}
	
		}
count = Math.abs(index1-index2)+Math.abs(i1-i2);
		return count;
	}

}
