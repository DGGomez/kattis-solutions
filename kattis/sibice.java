package prct;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class sibice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		double width = (double)scan.nextInt();
		double length = (double)scan.nextInt();
		int size;
		while(count>0) {
			size=scan.nextInt();
			if(width>size) {
				System.out.println("DA");			}
			else if(length>size) {
				System.out.println("DA");
			}
			else if(Math.sqrt(length*length+width*width)>=size){
				System.out.println("DA");
			}
			else {
				System.out.println("NE");
			}
			count--;
		}

	}

}
