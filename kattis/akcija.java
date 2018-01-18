package kattis;

import java.util.Scanner;

public class akcija {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int count = scan.nextInt();
	int numb,numb1,numb2,numb3,result=0;
	
while(count>0 &&scan.hasNextInt()){
		if(count>3){
			numb1=scan.nextInt();
			numb2 = scan.nextInt();
			numb3=scan.nextInt();
			result+=triPrice(numb1,numb2,numb3);
			count-=3;
		}
		else{
		numb=scan.nextInt();
		result+=numb;
		count--;
	}}
	System.out.println(result);
	}
public static int triPrice(int one, int two, int three){
	int result=0;
	if(one>two||one>three)result+=one;
	if(two>one||two>three) result+=two;
	if(three>one||three>two)result+=three;
	return result;
}
}
