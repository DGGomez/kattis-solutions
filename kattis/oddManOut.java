package kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class oddManOut {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int count = scan.nextInt();
	int innerCount=0;
	while(count>0){
		innerCount++;
		int size = scan.nextInt();
		ArrayList <Integer> list = new ArrayList<Integer>();
		
		while(size>0){
			list.add(scan.nextInt());			size--;
		}
		System.out.println("Case #"+innerCount+": "+oddMan(list));
		count--;
	}
	}
	
public static int oddMan(ArrayList<Integer> list){
	int number=0;
	
	for(int i =0; i<list.size(); i++){
		int count=0;
		for(int j =0; j<list.size(); j++){
			int x=list.get(i);
			int y = list.get(j);
			if(x==y&& i!=j){
				count++;
			}
		}
		
		if(count%2==0 || count==0){number=list.get(i);}
	}
	return number;
}

}