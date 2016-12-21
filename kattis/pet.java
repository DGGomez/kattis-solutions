package kattis;

import java.util.Scanner;

public class pet {
public static void main(String[]args){
	Scanner scanner = new Scanner(System.in);
	int num,result, fresult,fnum;
	fresult=0;
	fnum=0;
	while(scanner.hasNext()){
		for(int i =0; i<5; i++){
			result=0;
			for(int j=0; j<4;j++){
		num=scanner.nextInt();
		result=result+num;}
			if(result> fresult){
				fnum=i;
				fresult=result;
			}
	}
		System.out.println(fnum+1 + " "+fresult);
	}
}
}
