import java.util.Scanner;

/**
 * 
 */

/**
 * @author Daniel
 *
 */
public class darts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int tests = scan.nextInt();
		int throwers;
		int x,y;
		int count=0;
		for(int i =0; i<tests; i++) {
			throwers = scan.nextInt();
			count=0;
			for(int j=0; j<throwers; j++) {
				x=scan.nextInt();
				y = scan.nextInt();
				count+=points(x,y);
			}
			System.out.println(count);
		}
		
	}
	static int points(int x, int y) {
		int total = x*x+y*y;
		
		 if(total<=400) return 10;
		else if(total<=1600) return 9;
		else if(total<=3600) return 8;
		else if(total<=6400) return 7;
		else if(total<=10000) return 6;
		else if(total<=14400) return 5;
		else if(total<=19600) return 4;
		else if(total<=25600) return 3;
		else if(total<=32400) return 2;
		else if(total<=40000) return 1;
		else return 0; 
	}

}
