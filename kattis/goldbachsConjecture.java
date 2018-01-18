package kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class goldbachsConjecture {
private static ArrayList<Integer> list = new ArrayList<Integer>();
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int number = scan.nextInt();
	while(number>0){
		int numb = scan.nextInt();
		primer(numb);
		System.out.println(numb+" has "+list.size()+" representation(s)");
		printer();
		number--;
	}
	scan.close();
	}
public static void primer(int numb){
	for(int i =1; i<=numb; i++){
		int counter=0;
		for(int num =i; num>=1; num--){
			if(i%num==0){
				counter++;
			}
		}
		if(counter==2){
		addToList(numb,i);
		}
	}
}
public static void addToList(int numb, int first){
	for(int i=numb; numb>=1; i--){
		int counter=0;
		for(int k = i; k>=1; k--){
			if(i%k ==0){
				counter++;
			}
		}
		if(counter==2 && (first+i)==numb){
			list.add(first);
			list.add(i);
			break;
		}
	}
}
public static void printer(){
	for(int i =0; i<list.size(); i+=2){
		System.out.println(list.get(i)+"+"+list.get(i+1));
	}
		
}
}
