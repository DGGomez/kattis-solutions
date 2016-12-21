package kattis;

import java.util.Scanner;

public class oddities {
public static void main(String[]args){
	Scanner scanner = new Scanner(System.in);
	int num,check;
	num = scanner.nextInt();
	while(num!=0){
		check = scanner.nextInt();
		if(check%2==0){
		System.out.println(check+" is even");
		}
		else{
			System.out.println(check+" is odd");
		}
		num--;
	}
}
}
