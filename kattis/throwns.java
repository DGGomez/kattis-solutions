/**
 * 
 */
package nkattis;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class throwns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int people = scan.nextInt();
		int count = scan.nextInt();
		String step;
		int position=0;
		ArrayList<Integer>steps=new ArrayList<Integer>();
		int i=0,undo,place;
		while(i<count) {
			step = scan.next();
			
			if(step.equals("undo")) {
				step = scan.next();
				undo = Integer.parseInt(step);
				place=i;
				for(int j=0; j<undo;j++) {
				position-=steps.remove(steps.size()-1);
				position=position%people;
				}
				
				i++;
			}
			else {
				steps.add(Integer.parseInt(step));
				position+=Integer.parseInt(step);
				//removes negative positions
				position=((position%people)+people)%people;
				
				i++;
			}
		}
		System.out.println(position);
	}

}
