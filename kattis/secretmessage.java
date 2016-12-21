package kattis;

import java.util.Scanner;

public class secretmessage {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int words = Integer.parseInt(scan.next());
		String fil="";
		int size=0;
		String word="";
		for(int i =0; i<words; i++){
			word =scan.next();
			for(int j=0; j<100; j++){
				if(j*j>word.length()){
					size=j;
					System.out.println(size);
					break;
					
				}}
			fil=wordy(word,size);
			System.out.println(fil);
		}
	}
	public static String wordy(String word, int size){
		String result="";
		
	
			String [][] dis = new String[size][size];
		
		for(int i =0; i<word.length();i++){
			for(int k =0; k<size; k++){
				for(int s=0; s<size;s++){
					dis[k][s]=word.substring(i,i+1);
					
				}
			}
			
		}
		for(int p =size; p>0; p--){
			for(int l=size; l>0;l--){
				
				result = result+dis[p][l];
			}
		}
		return result;
	}

}
