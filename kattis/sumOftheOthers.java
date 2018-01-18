package kattis;

import java.util.Scanner;

public class sumOftheOthers {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String []line;
	while(scan.hasNext()){
		line = scan.nextLine().split(" ");
		int result = choose(changeInt(line));
		System.out.println(result);
	}	}
	public static int[] changeInt(String[] line){
		int[] list = new int[line.length];
		for(int i =0; i<line.length; i++){
			list[i]=Integer.parseInt(line[i]);
		}
	return list;
	}
	public static int choose(int[]list){
		int result=0;
		int count=0;
		for(int i =0; i<list.length; i++){
			count=0;
			for(int j=0; j<list.length;j++){
				if(i!=j){
				count+=list[j];
			}}
			if(list[i]==count)result=list[i];		}
		return result;
	}
}
