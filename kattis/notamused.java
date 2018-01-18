/**
 * 
 */
package nkattis;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class notamused {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String state;
		String name;
		int total, day=1;
		DecimalFormat df=new DecimalFormat("#.00");  
		String person,place;
		while(scan.hasNext()) {
			Map<String, String> sub = new HashMap<String,String>();
			ArrayList<String> names = new ArrayList<String>();
			
			while(true) {
				
				state=scan.next();
				if(state.equals("CLOSE"))break;
				else {
				
				if(state.equals("ENTER")) {
					person=scan.next();
					place=scan.next();
					if(!sub.containsKey(person)) {
					names.add(person);
					sub.put(person, place);
					}
					else {
						place=sub.get(person)+","+place;
						sub.remove(person);
						sub.put(person, place);
					}
				}
				else if(state.equals("EXIT")){
					person=scan.next();
					place=scan.next();
					String time = sub.get(person);
					String []timesplit;
					if(time.contains(",")) {
						timesplit=time.split(",");
						int init=Integer.parseInt(timesplit[0]);
						int fin=Integer.parseInt(timesplit[1]);
						total = init + (Integer.parseInt(place)-fin);
						sub.remove(person);
						sub.put(person, ""+total);
					}
					else {
					total=Integer.parseInt(sub.get(person));
					
					//check name, substract time difference
					
					total=(Integer.parseInt(place)-total);
					sub.remove(person);
					sub.put(person, ""+total);}
				}}
			}
			Collections.sort(names);
			//print list
			System.out.println("Day "+day);
			day++;
			for(String n: names) {
				System.out.println(n+" $"+df.format((Double.parseDouble(sub.get(n))*0.10)));
			}
		
		}
		scan.close();

	}

}
