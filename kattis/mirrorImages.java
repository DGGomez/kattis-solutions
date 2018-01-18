package kattis;

import java.util.Scanner;

public class mirrorImages {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = Integer.parseInt(scan.next());
		int num=1;
		while(count>0){
			int x = Integer.parseInt(scan.next());
			int y = Integer.parseInt(scan.next());
			String [] array = new String[x];
			for(int i=0; i<x;i++){
				array[i]=scan.next();}
				flip(array);
				trip(array);
				printer(array,num);
				num++;
			count--;
		}

	}
	public static void flip(String[] array){
	for(int i=0; i<(array.length/2);i++){
	String temp = array[i];
	array[i]=array[array.length-i-1];
	array[array.length-i-1]=temp;}
	}
	public static void trip (String[] array){
		for(int i =0; i<array.length;i++){
			String temp = "";
			String temp1="";
			
			for(int j=0; j<(array[i].length()/2);j++){
				temp=array[i].substring(j,j+1)+temp;
				temp1= temp1+ array[i].substring(array[i].length()-j-1,array[i].length()-j);
			}
			
			if(array[i].length()%2==0)
			array[i]=temp1+temp;
			else array[i]=temp1+array[i].substring((array[i].length()/2),(array[i].length()/2)+1)+temp;
		}
	}
public static void printer(String[]array,int count){
	System.out.println("Test "+count);
	for(int j =0; j<array.length; j++){
	for(int i =0; i<array[j].length();i++){
		System.out.print(array[j].substring(i, i+1));
	}
	System.out.println();
	}
}
}
