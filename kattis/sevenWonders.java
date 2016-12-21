package kattis;

import java.util.Scanner;

public class sevenWonders {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int t=0;
		int c=0;
		int g=0;
		int extra=0;
		for(int i =0; i<word.length();i++){
			if(word.substring(i,i+1).equals("T")){
				t++;
			}
			if(word.substring(i,i+1).equals("C")){
				c++;
			}
			if(word.substring(i,i+1).equals("G")){
				g++;
			}
		}
		extra=counter(t,c,g);
		System.out.println(t*t+c*c+g*g+extra);
	}
public static int counter(int t, int c, int g){
	int extra=0;
	boolean test = true;
	int count=1;
	while(test){
		if(t>=1&&c>=1&&g>=count){
			t--;
			c--;
			g--;
			extra+=7;
		}
		else{
			test=false;
		}
	}
	return extra;
}
}
