package kattis;

import java.util.Scanner;

public class rijeci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		scan.close();
		int ans=0;
		if(count==0)System.out.println("1 0");
		else{
		fibo(count-1);

		}

	}
	public static void fibo(int count){
	int fib =0, n1 = 0, n2=1;
	for(int i =0; i<count;i++){
		fib = n1+n2;
		n1=n2;
		n2=fib;
	}
	System.out.println(n1+" "+n2);
	}
}
