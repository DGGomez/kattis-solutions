package prct;

import java.util.Scanner;

public class tenkindsofppl {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = Integer.parseInt(scan.next());
		int y = Integer.parseInt(scan.next());
		int row=0;
		String line;
		String []splitline;
		int[][]map=new int[x][y];
		// read map 0s for binary 1s for decimal
		while(x>0) {
			line=scan.next();
			splitline=line.split("");
			for(int i =0; i<y;i++) {
				map[row][i]=Integer.parseInt(splitline[i]);
			}
			row++;
			x--;
		}
		// read start and end point
		int cases = Integer.parseInt(scan.next());
	   int r1,c1,r2,c2;
	   int initialV;
		int finalV;
	   while(cases>0) {
		   r1 = Integer.parseInt(scan.next())-1;
		   c1 = Integer.parseInt(scan.next())-1;
		   r2 = Integer.parseInt(scan.next())-1;
		   c2 = Integer.parseInt(scan.next())-1;
		   initialV=map[r1][c1];
		   finalV= map[r2][c2];
		   if(initialV==finalV && r1>=0 && r1<map.length && c1>=0 && c1<map[0].length
				   && r2>=0 && r2<map.length && c2>=0 && c2<map[0].length) {
			   if(mazesolver(r1,c1,r2,c2,map,initialV)==1) {
				   if(initialV==1) System.out.println("decimal");
				   if(initialV==0) System.out.println("binary");
			   }
			   else {
				   System.out.println("neither");
			   }
		   }
		   else {
			   System.out.println("neither");
		   }
		   cases--;	   }
	}
	public static int mazesolver(int r1,int c1,int r2,int c2, int[][]map,int state) {
		
		map[r1][c1]=2;
		if(r1==r2 && c1==c2) return 1;
		if(r1<=map.length-2) {
			if(state==map[r1+1][c1] && mazesolver(r1+1,c1,r2,c2,map,state)==1) {return 1;}}
		if(c1<=map[0].length-2) {
			if(state==map[r1][c1+1] && mazesolver(r1,c1+1,r2,c2,map,state)==1) {return 1;}}
		if(r1>=1) {
			if(state==map[r1-1][c1] && mazesolver(r1-1,c1,r2,c2,map,state)==1) {return 1;}}
		if(c1>=1) {
		if(state==map[r1][c1-1] && mazesolver(r1,c1-1,r2,c2,map,state)==1) {return 1;}}
		
		return 0;
	}
}
