package kattis;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class babelfish {
	private static Map<String,String> list = new HashMap<String,String>(); 
	
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int count=0;
	while(scan.hasNext()){
		String []line = scan.nextLine().split(" ");
		if(line.length==2){
			list.put(line[1],line[0]);
		}
		else{
			if(count!=0&&list.get(line[0])==null){
				System.out.println("eh");
			}
			else if(count==0){}
			else{
	System.out.println(list.get(line[0]));}
	count++;
		}
	}
	}

}
