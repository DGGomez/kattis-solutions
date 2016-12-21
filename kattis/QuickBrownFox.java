package kattis;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class QuickBrownFox {
public static void main(String[]args){
Scanner scan = new Scanner(System.in);
String yup = "pangram";
String nope = "missing ";
int no=nope.length();
String alfa = "abcdefghijklmnopqrstuvwxyz";
int check;
int count = Integer.parseInt(scan.nextLine());

for(int i =0; i<count;i++){
	String word = scan.nextLine().toLowerCase();
	nope = "missing ";
	for(int j=0; j<alfa.length(); j++){
		check=0;
		for(int k =0; k<word.length();k++){
			if(alfa.substring(j,j+1).equals(word.substring(k, k+1))){
				check=1;
			}
		}
		if(check==1){
			check=0;
		}
		else{
			nope=nope+alfa.substring(j,j+1);
			
		}
	}
	if(no==nope.length()){
		System.out.println(yup);
	}
	else{
		System.out.println(nope);
	}
	
	
}

}
}
