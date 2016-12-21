package kattis;

import java.util.Scanner;

public class diceGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int emma=0;
		int gunnar=0;
		for(int i =0; i<4;i++){
			gunnar+=scan.nextInt();
		}
		for(int j=0; j<4;j++){
			emma+=scan.nextInt();
		}
		if(emma==gunnar){
			System.out.println("Tie");
		}
		else if(emma>gunnar){
			System.out.println("Emma");
		}
		else{
			System.out.println("Gunnar");
		}
	}

}
