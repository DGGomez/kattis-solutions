package kattis;

import java.util.Scanner;

public class detailedDifferences {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word1,word2,result="";
		int count = Integer.parseInt(scan.next());
		while(scan.hasNext()){
			word1=scan.next();
			System.out.println(word1);
			word2=scan.next();
			System.out.println(word2);
			result="";
			for(int i =0; i<word1.length();i++){
				if(word1.substring(i,i+1).equals(word2.substring(i, i+1))){
					result=result+".";
				}
				else{
					result=result+"*";
				}
			}
			System.out.println(result);
		}
	}

}
