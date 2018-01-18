package kattis;

import java.util.Scanner;

public class smallestMultiple {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	while(scan.hasNextLine()){
		String []line = scan.nextLine().split(" ");
		int[] list = changeStringToInt(line);
		for(int i =0; i<list.length;i++){
			System.out.println(list[i]);
		}
	}
	
	}
public static int[] changeStringToInt(String [] line){
int [] list = new int[line.length];
for(int i =0; i<line.length; i++){
	list[i]=Integer.parseInt(line[i]);
}
return list;
}
public static int check(long n,int[]list){
	int count=1;
	for(int i =0; i<n; i++){
		for(int j =0; j<list.length; j++){
			if(i%list[j]==0){
				count++;
			}
			if(count>=list.length) return i;
		}
	}
	
	return 0;
}
}
