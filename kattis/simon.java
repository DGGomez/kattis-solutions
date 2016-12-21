package kattis;

import java.util.Scanner;

public class simon{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		
		int count = Integer.parseInt(scan.nextLine());
		String check = "Simon says";
		int cl = check.length();
		while(count>0){
			String input = scan.nextLine();
			if(input.substring(0, cl).equals(check)){
				System.out.println(input.substring(cl));
			}
		count--;
		}
		scan.close();
	}
}
	

