package kattis;

import java.util.Scanner;

public class trik {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int cup=1;
		for(int i =0; i<word.length();i++){
			if(word.substring(i,i+1).equals("A")){
				if(cup==1){
					cup=2;
				}
				else if(cup==2){
					cup=1;
				}
				else{}
			}
			else if(word.substring(i,i+1).equals("B")){
				if(cup==2){
					cup=3;
				}
				else if(cup==3){
					cup=2;
				}
				else{}
			}
			else if(word.substring(i,i+1).equals("C")){
				if(cup==3){
					cup=1;
				}
				else if(cup==1){
					cup=3;
				}
				else{}
			}
			else{
				
			}
		}
System.out.println(cup);
	}

}
