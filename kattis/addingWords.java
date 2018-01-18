package kattis;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class addingWords {
private static Map<String,Integer> dis = new TreeMap<String,Integer>();
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	String []line= scan.nextLine().split(" ");
	while(!line.equals("clear")){
		if(line[0].equals("def")){
			addToList(line[1],line[2]);
		}
		if(line[0].equals("calc")){
			
		}
		line=scan.nextLine().split(" ");
	}
	}
public static String addition (String line){
String result = "";
for(int i =0; i<line.length(); i++){
	
}
return result;
}
public static void addToList (String key, String value){
	dis.put(key, Integer.parseInt(value));
}
}
