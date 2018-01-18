package kattis;

import java.util.Scanner;

public class popularVote {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int count = scan.nextInt();
	int count2,total,big,space,innerC;
	for(int j =0; j<count; j ++){
		 count2 = scan.nextInt();
		total=0;
		big=0;
		space=0;
		innerC=0;
		for(int i =0; i<count2; i++){
			int num = scan.nextInt();
			total+=num;
			if(num==big){
				innerC++;
			}
			if(num>big){
				big=num;
				innerC=0;
				space=i;
			}
			
			
		}
		
		space++;
		if(big>Math.floor(total/2))System.out.println("majority winner "+space);
		else if(innerC>0)System.out.println("no winner");
		
		else System.out.println("minority winner "+space);
	}
	}

}
