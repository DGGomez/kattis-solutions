package kattis;

import java.util.Scanner;

public class zamka {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int first = scan.nextInt();
	int second = scan.nextInt();
	int third = scan.nextInt();
	scan.close();
	System.out.println(minimal(second,first,third));
	System.out.println(maximal(second,first,third));
	
	}
 public static int maximal(int x,int y, int control){
	 int max=0;
	 for(int i=x; i>y;i--){
		 if(check(control,i)){
			 max =i;
			 break;
		 }
	 }
	 return max;
 }
 public static int minimal(int x, int y,int control){
	int min = 0;
	for(int i =y; i<x; i++){
		if(check(control,i)){
			min=i;
			break;
		}
	}
	return min;
 }
 public static boolean check(int control, int numb){
String word= ""+numb;
int sum =0;
	 for(int i =0; i<word.length(); i++){
		 sum = sum+Integer.parseInt(word.substring(i, i+1));
	 }
	 if(sum==control) return true;
	 else return false;
 }
}
