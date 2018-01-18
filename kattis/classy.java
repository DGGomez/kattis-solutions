package prct;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class classy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases=Integer.parseInt(scan.nextLine());
		String []line;
		String []name;
		String line1;
		String fline;
		while(cases>0) {
			int c = Integer.parseInt(scan.nextLine());
			line= new String[c];
			int x=0;
			while(c>0) {
				
			line1=scan.nextLine();
			//sort initially by upper
			fline=swaptails(name(line1)+classes(line1));
			line[x]=fline;
			x++;
			c--;
			}
			organizer(line);
			for(int i =0; i<line.length; i++) {
				name=line[i].split(",");
				System.out.println(name[0]);
			}
			System.out.println("==============================");
			cases--;
		}
		
	}
	public static String name(String line) {
		String title="";
		for(int i =0; i<line.length(); i++) {
			if(line.substring(i,i+1).equals(":")){
				break;
			}
			else title+=line.substring(i, i+1);
		}
		return title;
	}
	public static String classes(String line) {
		String result="";
		for(int i =0; i<line.length()-6; i++) {
			if(line.substring(i, i+5).equals("upper")) {
				result+=",3";
			}
			if(line.substring(i, i+5).equals("lower")) {
				result+=",1";
			}
			if(line.substring(i, i+6).equals("middle")) {
				result+=",2";
			}
		}
		return result;
	}
	public static void organizer(String[]list) {
		String [] first;
		String [] second;
		String temp;
		for(int i=0; i<list.length; i++) {
			
			for(int j=i; j<list.length; j++) {
				first=list[i].split(",");
				second=list[j].split(",");
				if(comparer(first,second)==1) {}
				else if(comparer(first,second)==2) {
					temp=list[i];
					list[i]=list[j];
					list[j]=temp;
					
				}
				else {
					if(first.length<second.length) {
						
					}
					else if(first.length>second.length){
						temp=list[i];
						list[i]=list[j];
						list[j]=temp;
					}
					else {
						//two items exactly the same
					}
				}
			}
		}
	}
	public static int comparer(String[]first, String[]second) {
		if((first.length) <= (second.length)) {
			for(int i =1; i<first.length; i++) {
				if(Integer.parseInt(first[i]) >Integer.parseInt(second[i])) {
					return 1;
				}
				if(Integer.parseInt(first[i]) <Integer.parseInt(second[i])) {
					return 2;
				}
			}
		}
		else {
			for(int i =1; i<second.length; i++) {
				if(Integer.parseInt(first[i]) >Integer.parseInt(second[i])) {
					return 1;
				}
				if(Integer.parseInt(first[i]) <Integer.parseInt(second[i])) {
					return 2;
				}
			}
		}
		
		
		return 0;
	}
	public static String swaptails(String lister) {
		String temp;
		String result="";
		String []list = lister.split(",");
		for(int i =1; i<list.length;i++) {
			temp=list[i];
			list[i]=list[list.length-i];
			list[list.length-i]=temp;
		}
		for(int i=0; i<list.length;i++) {
			if(i==0) {
			result+=list[i];}
			else {
				result+=","+list[i];	
			}
		}
		return result;
	}
}	
