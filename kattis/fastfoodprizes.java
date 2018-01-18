/**
 * 
 */
package nkattis;

import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class fastfoodprizes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count= scan.nextInt();
		int n,m;
		String values;
		for(int i =0; i<count; i++) {
			n=scan.nextInt();
			m=scan.nextInt();
			String [] list = new String[n];
			scan.nextLine();
			for(int j=0; j<n; j++) {
				list[j]=scan.nextLine();
			}
			values=scan.nextLine();
			adder(list,values);
		}
		scan.close();
	}
	
	static void adder(String [] lines, String list) {
		String [] values = list.split(" ");
		
		
		int amount;
		int count=0;
		int v=0;
		int total=0;
		for(int i=0; i<lines.length; i++) {
			String [] split=lines[i].split(" ");
			amount=Integer.parseInt(split[0]);
			count=-1;
			for(int j=1; j<=amount; j++) {
				v=Integer.parseInt(values[Integer.parseInt(split[j])-1]);
				if((count==-1)|| count>v)
				count= v;
			}
			total+=count*Integer.parseInt(split[amount+1]);
		}
		System.out.println(total);
	}

}
