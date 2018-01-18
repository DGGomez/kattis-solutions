package prct;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aboveAverage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int listSize,avg,count,listn;
		double fvalue;
		DecimalFormat df = new DecimalFormat(".###");
		
		while(number>0) {
			count=0;
			avg=0;
			listSize=scan.nextInt();
			ArrayList<Integer> arrlist = new ArrayList<Integer>(listSize);
			for(int i =0; i<listSize;i++) {
				listn=scan.nextInt();
				avg+=listn;
				arrlist.add(listn);
			}
			avg=avg/listSize;
			
			 for (Integer n: arrlist) {
				 if(n>avg) {
				
					 count++;
				 }
			 }
			 
			 fvalue= (double)count*100/listSize;
			 System.out.printf("%.3f",fvalue);
			 
			 System.out.println("%");
			 number--;
			 }
	}

}
