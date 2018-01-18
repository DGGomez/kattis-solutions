package kattis;

import java.util.Scanner;

public class beatTheSpead {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int count = scan.nextInt();
	while(count>0){
		int s = scan.nextInt();
		int d = scan.nextInt();
		if(d>s)System.out.println("impossible");
		else {
			int [] numbs = new int[]{s,d};
		twoNumbers(numbs);}
		count--;
	}
	}
public static void twoNumbers(int [] line){
int [] two = new int[2];
int s= line[0];
int d = line[1];
int o=0;
for(int i =0; i<s; i++){
	if(s==((d+i)+i)){
		two[0]=d+i;
		two[1]=i;
		o++;
		System.out.println(two[0]+" "+two[1]);
	}
}
if(o==0)System.out.println("impossible");
}
}
