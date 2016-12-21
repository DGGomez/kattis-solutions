package kattis;

import java.util.Scanner;

public class skener {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int w,x,y,z;
		w=Integer.parseInt(scan.next());
		x=Integer.parseInt(scan.next());
		y=Integer.parseInt(scan.next());
		z=Integer.parseInt(scan.next());
		String line,result="";
		for(int i =0; i<w;i++){
			line = scan.next();
			result="";
			for(int j =0; j<x;j++){
				for(int k=0; k<z;k++){
					result=result+line.substring(j, j+1);
				}
			}
			for(int l=0;l<y;l++){
				System.out.println(result);
			}
			
		}
	}

}
