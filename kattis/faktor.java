package prct;

import java.util.Scanner;

public class faktor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int publish = scan.nextInt();
		int impact = scan.nextInt();
		
		int max = publish *impact;
		int min = publish *(impact-1);
		
		do{
			
			--max;
			}while(((double)max/publish)>(impact-1) && max != min);
		
		System.out.println(max+1);
		}
	}


