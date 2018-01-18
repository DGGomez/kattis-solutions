/**
 * 
 */
package nkattis;

import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class chess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		scan.nextLine();
		String []positions;
		for(int i =0; i<count; i++) {
			positions=scan.nextLine().split(" ");
			pos(positions);
		}
		scan.close();
	}
	static void pos(String [] xy) {
		String [] alphabets= {"A","B","C","D","E","F","G","H"};
		String [] numbers = {"8","7","6","5","4","3","2","1"};
		int [][] table =new int [8][8];
		int [] table1= {1,0,1,0,1,0,1,0};
		int [] table2= {0,1,0,1,0,1,0,1};
		table[0]=table1;
		table[1]=table2;
		table[2]=table1;
		table[3]=table2;
		table[4]=table1;
		table[5]=table2;
		table[6]=table1;
		table[7]=table2;
		int x1=0,y1=0,x2=0,y2=0;
		for( int i =0; i<8; i++) {
			if(alphabets[i].equals(xy[0])) {x1=i;}
			if(alphabets[i].equals(xy[2])) {x2=i;}
			if(numbers[i].equals(xy[1])) {y1=i;}
			if(numbers[i].equals(xy[3])) {y2=i;}
		}
		//check if same spot and if on the same space type 1 or 0
		if(table[x1][y1]!=table[x2][y2]) {
			System.out.println("Impossible");
			return;
		}
		if(x1==x2 && y1==y2) {
			System.out.println(0 +" "+xy[0]+" "+xy[1]);
		}
		if(diagonal(x1,y1,x2,y2)) {
			System.out.println(1+" "+xy[0]+" "+xy[1]+" "+xy[2]+" "+xy[3]);
		}
		//check if on same diagonal
		//four quadrants
		if((x1<x2 && y1<y2)||(x1==x2 && y1<y2 && x1<=4)||(y1==y2 && x1<x2 && y1<=4)) {
		for(int j=0; j<8; j++) {
			if(x1+j>=8 || y1+j>=8) {
				System.out.println("Impossible");
				return;
			}
			if(diagonal(x1+j,y1+j,x2,y2)) {
				System.out.println(2+" "+xy[0]+" "+xy[1]+" "+alphabets[x1+j]+" "+numbers[y1+j]+" "+xy[2]+" "+xy[3]);
				return;
				
			}
		}}
		if((x1>x2 && y1<y2)||(x1==x2 && y1<y2 && x1>4)||(y1==y2 && x1>x2 && y1<=4)) {
			for(int j=0; j<8; j++) {
				if(x1-j<0 || y1+j>=8) {
					System.out.println("Impossible");
					return;
				}
				if(diagonal(x1-j,y1+j,x2,y2)) {
					System.out.println(2+" "+xy[0]+" "+xy[1]+" "+alphabets[x1-j]+" "+numbers[y1+j]+" "+xy[2]+" "+xy[3]);
					return;
					
				}
			}}
		if((x1<x2 && y1>y2)||(x1==x2 && y1>y2 && x1<=4)||(y1==y2 && x1<x2 && y1>4)) {
			for(int j=0; j<8; j++) {
				if(x1+j>=8 || y1-j<0) {
					System.out.println("Impossible");
					return;
				}
				if(diagonal(x1+j,y1-j,x2,y2)) {
					System.out.println(2+" "+xy[0]+" "+xy[1]+" "+alphabets[x1+j]+" "+numbers[y1-j]+" "+xy[2]+" "+xy[3]);
					return;
					
				}	
			}}
		if((x1>x2 && y1>y2)||(x1==x2 && y1>y2 && x1>4)||(y1==y2 && x1>x2 && y1>4)) {
			for(int j=0; j<8; j++) {
				if(x1-j<0 || y1-j<0) {
					System.out.println("Impossible");
					return;
				}
				if(diagonal(x1-j,y1-j,x2,y2)) {
					System.out.println(2+" "+xy[0]+" "+xy[1]+" "+alphabets[x1-j]+" "+numbers[y1-j]+" "+xy[2]+" "+xy[3]);
					return;
					
				}
			}}
		
	}
	static boolean diagonal(int x1, int y1, int x2,int y2) {
		double xD,yD,slope;
			
				xD=Math.abs(x2-x1);
				yD=Math.abs(y2-y1);
				slope=xD/yD;
				if(slope==1 || slope==-1){
					
					return true;
				}
		return false;
	}

}
