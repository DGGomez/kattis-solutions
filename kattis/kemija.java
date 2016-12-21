package kattis;

import java.util.Scanner;

public class kemija {
	public static void main(String[]args){
Scanner scanner = new Scanner(System.in);
String result;
String fresult;
while(scanner.hasNext()){
	String k = scanner.nextLine();
	result = "";
	for(int i =0; i<k.length(); i++){
		if(k.substring(i,i+1).equals("a")
				||k.substring(i,i+1).equals("e")
				||k.substring(i,i+1).equals("i")
				||k.substring(i,i+1).equals("o")
				||k.substring(i,i+1).equals("u") && (i+3)!=k.length()){
			if(k.substring(i+1,i+2).equals("p")){
				if(k.substring(i,i+1).equals(k.substring(i+2,i+3))){
					result=result+k.substring(i+2,i+3);
					i=i+2;
				}
			}
			
			
		}
		else{
			result=result+k.substring(i,i+1);
		}
	}
	System.out.println(result);
}
}}
