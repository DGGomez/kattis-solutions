package prct;

import java.util.Scanner;

public class datum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	int day = scan.nextInt();
	int month = scan.nextInt();
	day--;
	int count;

	if(month==1)count=5;
	else if(month==2)count=1;
	else if(month==3)count=1;
	else if(month==4)count=4;
	else if(month==5)count=6;
	else if(month==6)count=2;
	else if(month==7)count=4;
	else if(month==8)count=7;
	else if(month==9)count=3;
	else if(month==10)count=5;
	else if(month==11)count=1;
	else count=3;
	
		while(day>0) {
			count++;
			if(count>7)count=1;
			day--;
		}
		
		if(count==1)System.out.println("Sunday");
		else if(count==2)System.out.println("Monday");
		else if(count==3)System.out.println("Tuesday");
		else if(count==4)System.out.println("Wednesday");
		else if(count==5)System.out.println("Thursday");
		else if(count==6)System.out.println("Friday");
		else System.out.println("Saturday");
	}
	

}
