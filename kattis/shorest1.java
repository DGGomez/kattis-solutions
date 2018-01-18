/**
 * 
 */
package nkattis;

import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class shorest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n,m,q,s,u,v,w,count=0;
		n=scan.nextInt();
		m=scan.nextInt();
		q=scan.nextInt();
		s=scan.nextInt();
		while(n!=0 || m!=0 || q!=0 || s!=0) {
			int [][] list = new int[m][3];
			
			// add movement and weight
			for(int i=0; i<m; i++) {
				
				list[i][0]=scan.nextInt();
				list[i][1]=scan.nextInt();
				list[i][2]=scan.nextInt();
				
			}
			// end point
			for(int j=0; j<q; j++) {
				count=check(s,scan.nextInt(),list,m,count);
				if(count!=-1) {
				System.out.println(count);}
			}
			System.out.println();
			n=scan.nextInt();
			m=scan.nextInt();
			q=scan.nextInt();
			s=scan.nextInt();
		}
	}
	
	static int check(int start, int end, int [][]list,int m,int count) {
		if(start==end) return count;
		for(int i =0; i<m; i++) {
			if(start==list[i][0]) {
				start=list[i][1];
				count+=list[i][2];
				check(start,end,list,m,count);
				
			}
		}
		
		return 0;
		
	}
	
	static void possible(int start, int end, int [][]list, int m) {
		for(int i=0; i<m; i++) {
		
		}
	}

}

