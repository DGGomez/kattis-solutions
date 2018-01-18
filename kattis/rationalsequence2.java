/**
 * 
 */
package nkattis;

import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class rationalsequence2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    int count = Integer.parseInt(scan.next());
    int k=0;
    
    String[]line;
    while(count!=k) {
    	k = Integer.parseInt(scan.next());
    	line = scan.next().split("/");
    	System.out.println(k+" "+sequence(Integer.parseInt(line[0]),Integer.parseInt(line[1])));
    }
	}
	
	public static int sequence(int p, int q) {
		int n=1;
		String path="";
		if(p==1 && q==1) return n;
		while(p!=1 || q!=1) {
			if(p>q) {
				p-=q;
				path ="r"+path;
			}
			else
			{
			q -= p;
			path = "l" + path;
			}
		}
		
	n=0;
	for (int i = 0; i < path.length(); i++)
		if (path.charAt(i) == 'r')
			n = 2*(n + 1);
		else
			n = 2*n + 1;
	
	return n+1;
}}
