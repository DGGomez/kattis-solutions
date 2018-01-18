package kattis;

import java.util.Scanner;

public class eiQueens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][] list = new int[8][2];
		char [][] board = new char[8][8];
		String line;
		int count =0;
		for(int i =0; i<8;i++){
			line = scan.next();
			for(int j=0; j<8;j++){
			board[i][j]=line.charAt(j);
			if(board[i][j]=='*'){
				list[count][0]=i;
				list[count][1]=j;
				count++;
			}
			}
		}
	if(rows(list)){
		if(diagonal(list)){
			System.out.println("valid");
		}
		else System.out.println("invalid");
	}
	else System.out.println("invalid");
	}
	public static boolean rows(int [][] list){
		for(int i =0; i<8; i++){
			for(int j =0; j<8;j++){
				if(list[i][0]==list[j][0] && i!=j){
					return false;
				}
				if(list[i][1]==list[j][1] && i!=j){
					return false;
				}
			}
		}
		return true;
	}
	public static boolean diagonal(int [][]list){
		double m,n,x,y;
		double xD,yD,slope;
		for(int i =0; i<8; i++){
			x=list[i][0];
			y=list[i][1];
			for(int j=0; j<8;j++){
				m=list[j][0];
				n=list[j][1];
				xD=m-x;
				yD=n-y;
				slope=xD/yD;
				if(slope==1 || slope==-1){
					
					return false;
				}
			}
		}
		return true;
	}
}
