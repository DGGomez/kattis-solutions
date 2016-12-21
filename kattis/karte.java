package kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class karte {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String dis = scan.nextLine();
	
	String[] list = new String[(dis.length()/3)];
	int p=13,k=13,h=13,t=13,count=0;
	for(int i =0; i<dis.length();i+=3){
		list[count]=(dis.substring(i,i+3));
		count++;
		if(dis.substring(i,i+1).equals("P")){
			p--;
		}
		else if(dis.substring(i,i+1).equals("K")){
			k--;
		}
		else if(dis.substring(i,i+1).equals("H")){
			h--;
		}
		else if(dis.substring(i,i+1).equals("T")){
			t--;
		}
	}
	if(tester(list)) System.out.println(p+" "+k+" "+h+" "+t);
	else System.out.println("GRESKA");
	}
public static boolean tester(String[]list){
	for(int i =0; i<list.length; i++){
		for(int j=0; j<list.length; j++){
			if(list[i].substring(0).equals(list[j]) && i!=j){
				return false;
			}
		}
	}
return true;	
}
}
