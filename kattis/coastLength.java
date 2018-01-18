package kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class coastLength {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	ArrayList<String> list = new ArrayList<String>();
	int x = Integer.parseInt(scan.next());
	int y = Integer.parseInt(scan.next());
	while(x>0){
		list.add(scan.next());
		x--;
	}
	System.out.println(coastLine(list));
	}

public static int coastLine(ArrayList<String> list){
	int score =0;
	for(int i =0; i<list.size(); i++){
		for(int j =0; j<list.get(i).length();j++){
			
			if(list.get(i).substring(j,j+1).equals("1")){
				if(i==0&&j==0||i==list.size() && j==0
				|| i==0 && j==list.size() 
				||  i==list.size() && j==list.size()) score+=2;
				else if(i==0||j==0||i==list.size()||j==list.size())score++;
			}
			if(list.get(i).substring(j, j+1).equals("0")){
				int count=0;
				//right
				if(j+2<=list.get(i).length()&&list.get(i).substring(j+1, j+2).equals("1")){
					score++;
					count++;
				}
				//left
				if(j-1>=0 && list.get(i).substring(j-1,j).equals("1")){score++; 
				count++;}
				//up
				if(i-1>=0 && list.get(i-1).substring(j, j+1).equals("1")){score++; 
				count++;}
				//down
				if(i+1<= list.size()-1 && list.get(i+1).substring(i, i+1).equals("1")){score++; 
				count++;}
				if(count==4)score-=4;
			}
		}
	}
	return score;
}
}
