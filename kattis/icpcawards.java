package prct;

import java.util.ArrayList;
import java.util.Scanner;

public class icpcawards {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		boolean add=true;
		ArrayList<String> list = new ArrayList<String>();
		int listcount=0;
		String line;
		String [] team;
		while(count>0 && listcount<12) {
			add=true;
			line = scan.nextLine();
			team = line.split(" ");
			if(list.size()>0) {
			for(String n: list) {
			if(n.contains(team[0])) {
				add=false;
			}}}
			if(add) {
				list.add(line);
				listcount++;
			}
			count--;
		}
		for(String n: list) {
			System.out.println(n);
		}
	}
	

}
