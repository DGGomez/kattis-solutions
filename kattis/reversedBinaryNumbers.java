package kattis;

import java.util.Scanner;
/*
 * take a number turn it into binary
 * flip the binary and read the number
 */
public class reversedBinaryNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number=scan.nextInt();
		String binary = "";
		int count=0;
		int digit;
		int answer=0;
		while(number>0){
			if(number%2==1){
				number--;
				binary="1"+binary;
			}
			
			else{
				binary="0"+binary;
			}
			number=number/2;
		}
		
		for(int i =0; i<binary.length();i++){
			digit=Integer.parseInt(binary.substring(i, i+1));
			if(digit==1){
				
					answer+=Math.pow(2, count);
				
			}
			count++;
		}
		System.out.println(answer);

	}

}
