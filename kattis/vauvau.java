package kattis;

import java.util.Scanner;

public class vauvau {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		int P = scan.nextInt();
		int M = scan.nextInt();
		int G = scan.nextInt();
		
		checker2(checker(A,B,P)+checker(C,D,P));
		checker2(checker(A,B, M)+checker(C,D,M));
		checker2(checker(A,B,G)+checker(C,D,G));
	}
	public static void checker2(int x){
	if(x==2){
		System.out.println("both");
	}	
	else if(x==1){
		System.out.println("one");
	}
	else if(x==0){
		System.out.println("none");
	}
	else{
		System.out.println("error");
	}
	}
public static int checker(int A, int B, int P){
	int t=0;
	while(true){
	if(P<=A){
		return 1;
	}
	else if(P<=(A+B)){
	
		return 0;
	}
	P-=(A+B);
	}
	

}
}
