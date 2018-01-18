package prct;
import java.util.Scanner;
public class hacks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int range = scan.nextInt();
		int r,e,c;
		
		while(range>0) {
			r=scan.nextInt();
			e=scan.nextInt();
			c=scan.nextInt();
			check(r,e,c);
			range--;
		}
	}

	public static void check(int r, int e, int c) {
		if(e>(c+r))System.out.println("advertise");
		else if(e==(c+r))System.out.println("does not matter");
		else System.out.println("do not advertise");
	}
}
