package kattis;

import java.util.Scanner;

public class pot {
	public static void main(String[]args){
Scanner scanner = new Scanner (System.in);
int num, front, back;
double result=0;
while(scanner.hasNext()){
	num = scanner.nextInt();
	if(num<11){
}
	else{
		back = num%10;
		front = num/10;
		result = result + Math.pow((double)front,(double)back);
	}
}
System.out.println((int)result);
}}
