package kattis;

import java.util.Scanner;

public class aRationalSequence2 {
private static String[] numbers= {"0","1","2","3","4","5","6","7","8","9"};

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = Integer.parseInt(scan.next());
		String d;
		int p=0, q=0, count;
		for(int i=0; i<x;i++){
			count=Integer.parseInt(scan.next());
			d=scan.next();
			for(int j =0; j<d.length();j++){
				if(isChar(d.substring(j,j+1))){
					p=Integer.parseInt(d.substring(0,j));
					q=Integer.parseInt(d.substring(j+1,d.length()));
			break;
				}
			}
			System.out.println(count+" "+counter(p,q));
		}
		
	}
	public static boolean isChar(String c){
	for(int i=0; i<numbers.length;i++){
		if(c.substring(0,1).equals(numbers[i])){
			return false;
		}
	}
		return true;
	}
	public static int counter(int p, int q){
		int count=0;
		int c1=1,c2=1;
		while(p!=c1 && q!=c2){
			count++;
			if(c1!=1 &&c2!=1){
				
			}
			else if(count%2==1){
				
			}
		}
		return count;
	}

}
