package kattis;

import java.util.Scanner;

public class lineThemUp {
	final private static String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.next());
		String [] list = new String[count];
		for(int i =0; i<count; i++){
			list[i]=scan.next();
		}
		if(checkUp(list)) System.out.println("INCREASING");
		else if(checkDown(list)) System.out.println("DECREASING");
		else System.out.println("NEITHER");
		
	}
public static boolean checkUp(String [] list){
	int count =0;
	for(int i =0; i<list.length-1; i++){
		if(list[i].compareTo(list[i+1])<0 ||list[i].compareTo(list[i+1])==0){
		}
		else{return false;}
	}

	return  true;
}
public static boolean checkDown(String [] list){
	for(int i =0; i<list.length-1; i++){
		if(list[i].compareTo(list[i+1])>0||list[i].compareTo(list[i+1])==0){
		}
		else{return false;}
	}

	return  true;
}
}
