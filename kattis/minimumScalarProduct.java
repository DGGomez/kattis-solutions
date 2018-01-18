package kattis;

import java.util.Scanner;

public class minimumScalarProduct {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int count = scan.nextInt();
	while(count>0){
		int scalars = scan.nextInt();
		int[] xList = new int[scalars];
		int[] yList = new int[scalars];
		for(int i =0; i<scalars; i++){
			xList[i]=scan.nextInt();
		}
		for(int j =0; j<scalars; j++){
			yList[j]=scan.nextInt();
		}
		count--;
	}
	}
public static int scalrerAdd(int[]xList, int[]yList){
	int number=0;
	for(int i =0; i<xList.length; i++){
		number+=xList[i]*yList[i];
	}
	
	return number;
}

public static void sorter(int[]xList, int[]yList){
	
}
}
