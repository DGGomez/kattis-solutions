package prct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class bes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.nextLine());
		String [] names;
		
		ArrayList<String>foods;
		String line;
		String [] splitline;
		while(count>0) {
			foods= new ArrayList<String>();
			names=new String[count];
			for(int i =0; i<count; i++) {
				line = scan.nextLine();
				splitline= line.split(" ");
				names[i]=line;
				
				makelists(splitline,foods);
				
			}
			Collections.sort(foods);
			Arrays.sort(names);
			addlists(names,foods);
			for(String n: foods) {
				System.out.println(n);
			}
			System.out.println();
			count = Integer.parseInt(scan.nextLine());
		}
	}
	public static void makelists(String[]split, ArrayList<String> list) {
		boolean add=true;
		for(int i =1; i<split.length; i++) {
			add=true;
			if(list.size()>0) {
				for(String n: list) {
				if(n.contains(split[i])) {
					add=false;
				}}}
				if(add) {
					list.add(split[i]);
				}
		}
	}
public static void addlists(String[]names, ArrayList<String> foods) {
	
	int count=0;
	for(int i =0; i<names.length; i++) {
		count=0;
	for(String n: foods) {
		String [] ffood = n.split(" ");
		if(names[i].contains(ffood[0])) {
			
			String []fname=names[i].split(" ");
			n+=" "+fname[0];
			
			foods.set(count, n);
		}
		
		count++;
	}
	}
}
}
