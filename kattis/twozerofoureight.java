package kattis;

import java.util.Scanner;

public class twozerofoureight {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][] array = new int[4][4];
		for(int i =0; i<4;i++){
			for(int j =0; j<4;j++){
				array[i][j]=scan.nextInt();
			}
		}
		int command = scan.nextInt();
direction(command,array);
	}
public static void direction(int command,int [][]array){
	if(command==0){//go left
		moveLeft(array);
	}
	if(command==1){//go up
		moveUp(array);
		
	}
		
if(command==2){//go right
	moveRight(array);
	
	}
if(command==3){//go down
	moveDown(array);

}
printer(array);	
}
public static void moveDown(int [][]array){
	for(int i =0; i<3;i++){
		for(int j =0; j<4; j++){
			if(array[i+1][j]==0 && array[i][j]!=0){array[i+1][j]=array[i][j];
			array[i][j]=0;
			moveDown(array);
			}
			
			else if(array[i+1][j]==array[i][j])
				{array[i+1][j]=array[i][j]*2;
				array[i][j]=0;
				}
		}
	}
}
public static void moveUp(int [][]array){
	for(int i =1; i<4;i++){
		for(int j =0; j<4; j++){
			if(array[i-1][j]==0 && array[i][j]!=0){array[i-1][j]=array[i][j];
			array[i][j]=0;
			moveUp(array);
			}
			
			else if(array[i-1][j]==array[i][j])
				{array[i-1][j]=array[i][j]*2;
				array[i][j]=0;
				}
		}
	}
}
public static void moveRight(int [][]array){
	int n ;
	for(int i =0; i<4;i++){
		
		for(int j =0; j<3; j++){

			if(array[i][j+1]==0 && array[i][j]!=0){array[i][j+1]=array[i][j];
			array[i][j]=0;
		    if((j-1)>=0 && array[i][j-1]!=0){
		    	array[i][j]=array[i][j-1];
		    	array[i][j-1]=0;
		    }
			}
			
			if(array[i][j+1]==array[i][j])
			{array[i][j+1]=array[i][j]*2;
			array[i][j]=0;
			}
		
		}
	}
}
public static void moveLeft(int [][]array){
	int n ;
	for(int i =0; i<4;i++){
		
		for(int j =1; j<4; j++){
			n=0;
			if(array[i][j-1]==0 && array[i][j]!=0){array[i][j-1]=array[i][j];
			array[i][j]=0;
			n++;
			if((j-2)>=0 && array[i][j-2]==0){
				n++;
				array[i][j-2]=array[i][j-1];
				array[i][j-1]=0;
				if((j-3)>=0 && array[i][j-3]==0){
					n++;
					array[i][j-3]=array[i][j-2];
					array[i][j-2]=0;
				
				}
			}
			 if((n+1)<=4 && array[i][j-(n+1)]==array[i][j-n])
				{array[i][j-(n+1)]=array[i][j-n]*2;
				array[i][j-n]=0;
				}
			}
			
			else if((n+1)<=4 && array[i][j-(n+1)]==array[i][j-n])
				{array[i][j-(n+1)]=array[i][j-n]*2;
				array[i][j-n]=0;
				}
		}
	}
}
public static void printer(int [][]array){
	for(int i =0; i<4;i++){
		for(int j =0; j<4;j++){
			System.out.print(array[i][j]+" ");
		}
		System.out.println();
	}
}
}
