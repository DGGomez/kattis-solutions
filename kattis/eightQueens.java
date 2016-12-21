package kattis;

import java.util.Scanner;

public class eightQueens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char [][] board = new char[8][8];
		String line;
		for(int i =0; i<8;i++){
			line = scan.next();
			for(int j=0; j<8;j++){
			board[i][j]=line.charAt(j);
			}
		}
		if(queens(board)){
			System.out.println("valid");
		}
		else System.out.println("invalid");
	}
public static void printer(char [][] board){
	for(int i =0; i<8;i++){
		for(int j=0; j<8;j++){
			System.out.print(board[i][j]);
		}
		System.out.println();
	}
}
public static boolean queens(char [][]board){
int x=0;
	int [][] diagonals = new int[2][8];
	for(int i =0; i<8;i++){
		for(int j=0; j<8;j++){
			if(board[i][j]=='*'){
				if(checker(i,j,board)){
					diagonals[0][x]=i;
					diagonals[1][x]=j;
					x++;
				}

			else{
				return false;}
			}
		  }
	   }
	if(x==8){
		for(int k =0; k<8; k++){
			if(dchecker(diagonals[0][k],diagonals[1][k],diagonals)){
			}
			else{
				return false;
				}
		}
	}
	return true;
}
public static boolean dchecker(int x, int y,int[][]board){
double m,n;
double xD,yD,slope;
for(int i =0; i<8; i++){
	m=board[0][i];
	n=board[1][i];
	if(x!=m && y!=n){
		
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
public static boolean checker(int x, int y, char [][]board){
	//down
	for(int i =x; i<8;i++){
		if(board[i][y]=='*' && i!=x){
		return false;	
		}
		
		}
	//up
	for(int i =x; i>0;i--){
		if(board[i][y]=='*' && i!=x){
		return false;	
		}
		}
	//right
	for(int j =y; j>0;j--){
		if(board[x][j]=='*' && j!=y){
		return false;	
		}
		}
	//up
	for(int j =y; j<8;j++){
		if(board[x][j]=='*' && j!=y){
		return false;	
		}
		}
	return true;
}
}
