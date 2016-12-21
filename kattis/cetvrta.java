package kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class cetvrta {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer>answers = new ArrayList<Integer>();
		ArrayList<Integer>answers2 = new ArrayList<Integer>();
		int checker=0,check,checker2=0;
		for(int i=0; i<3;i++){
			answers.add(scan.nextInt());
			answers2.add(scan.nextInt());}
		
			for(int j =0; j<answers.size();j++){
				checker=answers.get(j);
				check=0;
				for(int k=0; k<answers.size();k++){
					if(checker==answers.get(k)){
						check++;
					}}
					if(check==1){
						break;
					}
				}
			for(int j =0; j<answers2.size();j++){
				checker2=answers2.get(j);
				check=0;
				for(int k=0; k<answers2.size();k++){
					if(checker2==answers2.get(k)){
						check++;
					}}
					if(check==1){
						break;
					}
				}
			System.out.println(checker+" "+checker2);
			}
	}


