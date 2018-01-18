package kattis;

import java.util.Scanner;

public class theEasiestProblemisThisOne {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(scan.hasNextInt()){
		int numb = scan.nextInt();
		int result =done(check(numb), numb);
		if(numb!=0){
		System.out.println(result);}
		
	}

	}
	public static int done(int finish, int numb){
		int result=11;
		
		while(true){
			if(finish==check(result*numb)){
				break;
			}
			result++;
		}
		return result;
	}
public static int check(int numb){
	String word = ""+numb;
	int result=0;
	for(int i =0; i<word.length(); i++){
		result+=Integer.parseInt(word.substring(i, i+1));
	}
	return result;
}
}
