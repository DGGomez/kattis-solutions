package kattis;

import java.util.Scanner;

public class reverseRot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int shift = Integer.parseInt(scan.next());
			if(shift==0){
				break;
			}
			String word = scan.next();
			String result="";
			result=reverse(word);
			result = encrypt(result,shift);
			System.out.println(result);
		}
		

	}
public static String reverse(String word){
	String result ="";
	for(int i =0; i<word.length();i++){
		result= result+word.substring(word.length()-i-1,word.length()-i);
		
	}
	return result;
}
public static String encrypt(String word, int shift){
	String result="";

	String list = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
	for(int i =0; i<word.length(); i++){
		for(int j=0; j<list.length();j++){
			
			if(word.substring(i,i+1).equals(list.substring(j,j+1))){
			
				if((shift)>=(list.length()-j)){
					int fshift = shift-(list.length()-j);
				result = result +list.substring(fshift,fshift+1);}
				else{
					result = result +list.substring(j+shift,j+shift+1);
				}
				
			}
			else{}
		}
	}
	return result;
}
}
