package kattis;

import java.util.Scanner;

public class grandpaBernie {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int count = Integer.parseInt(scan.nextLine());
	String[]list= new String[count];
	while(scan.hasNextLine()&&count>0){
		count--;
		list[count]=scan.nextLine();
	}
	int count2 = Integer.parseInt(scan.nextLine());
	while(scan.hasNextLine()&&count2>0){
		
	}
	}
	public static void printer(String []list){
		for( int i =0; i<list.length; i++){
			System.out.println(list[i]);
		}
	}
	public static void sorter(String []list){
		int min=0, pos=0;
		for(int i =0; i<list.length; i++){
		String [] first = list[i].split(" ");
		int year = Integer.parseInt(first[1]);
		if(i==0){
			min=year;
			pos=i;
		}
		else if(year<min){
			min=year;
			pos=i;
		}
		
	}}
	
}
