package kattis;

import java.util.Scanner;

public class countingStars {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int c =0;
	while(scan.hasNext()){
	String[] coordinates = scan.nextLine().split(" ");
	int x = Integer.parseInt(coordinates[0]);
	int y = Integer.parseInt(coordinates[1]);
	String[]sky = new String[x];
	for(int i =0; i<x; i++){
		sky[i]=scan.nextLine();
	}
	c++;
	System.out.println("Case "+c+": " +maze(sky));
	
	}}
public static int maze(String[] sky){
	int result=0;
	for(int i =0; i<sky.length; i++){
		for(int j =0; j <sky[0].length(); j++){
			if(sky[i].substring(j, j+1).equals("-")){
				result++;
				
				deleteStar(sky,i,j);
			}
		}
	}
	return result;
}
public static void star(String[] sky, int i, int j){
	sky[i]=sky[i].substring(0,j)+"#"+sky[i].substring(j+1);
}
public static boolean deleteStar(String[] sky, int i, int j){
	
if(i<0 || j<0 || i>=sky.length|| j>=sky[0].length()){ return false;}

	if(sky[i].substring(j,j+1).equals("-"))	{
		star(sky,i,j);
	if(deleteStar(sky,i+1,j))return false;
	if(deleteStar(sky,i-1,j))return false;
	if(deleteStar(sky,i,j+1))return false;
	if(deleteStar(sky,i,j-1))return false;}
else{
}
return false;
}
public static void pri(String[] sky){
	for(int i =0; i<sky.length;i++){
		for(int j=0; j<sky[0].length(); j++){
			System.out.print(sky[i].substring(j, j+1));
		}
		System.out.println();
	}
}
}
