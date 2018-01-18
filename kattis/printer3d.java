package prct;
import java.util.Scanner;

public class printer3d {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.next());
		int printer=1;
		int day =1;
		while(number>printer){
			printer=printer*2;
			day++;
		}
		System.out.println(day);	}

}
