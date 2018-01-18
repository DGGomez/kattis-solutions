/**
 * 
 */
package nkattis;

import java.util.Scanner;

/**
 * @author Daniel
 *
 */
public class toweringproblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] blocks=new int[6];
		for(int i =0; i<6; i++) {
			blocks[i]=scan.nextInt();
		}
		int height1 = scan.nextInt();
		int height2= scan.nextInt();
		int[]lblocks=new int[3];
		int[]rblocks=new int[3];
		split(lblocks,rblocks,blocks);
		order(lblocks); order(rblocks); join(lblocks,rblocks,blocks);

		while(!checker(lblocks,height1)||!checker(rblocks,height2)) {
			
			reorg(blocks, height1, height2);
			split(lblocks,rblocks,blocks);
			
		}
		System.out.println(blocks[0]+" "+blocks[1]+" "+blocks[2]+" "+blocks[3]+" "+blocks[4]+" "+blocks[5]);
	}
	public static void split(int[]left, int []right, int[]full) {
		for( int i =0; i<3; i++) {
			left[i]=full[i];
		}
		for(int i =0; i<3; i++) {
			right[i]=full[i+3];
		}
	}
	public static void join(int[]left, int []right, int[]full) {
		for( int i =0; i<3; i++) {
			full[i]=left[i];
		}
		for(int i =0; i<3; i++) {
			full[i+3]=right[i];
		}
	}
	public static void order(int[]blocks) {
		int temp;
		while(!(blocks[0]>=blocks[1]) || !(blocks[1]>=blocks[2])){
		for(int i=0; i<2; i++) {
			if(blocks[i]<blocks[i+1]) {
				temp=blocks[i];
				blocks[i]=blocks[i+1];
				blocks[i+1]=temp;
			}
		}}
	}
	public static boolean checker(int [] block,int height) {
		boolean state = false;
		if(block[0]>=block[1] && block[1]>=block[2]) {
			if(height==block[0]+block[1]+block[2]) {
				state=true;
			}
		}
	return state;
	}
	
	public static void reorg(int[]blocks,int height1, int height2) {
		int[]lblocks=new int[3];
		int[]rblocks=new int[3];
		int temp,sum=0,state=0, inner =0;
		while(state!=2) {
		//leftside
		for( int i =5; i>=0; i--) {
			if(state<1) {
			for(int j =5; j>=0; j--) {
			if( state<1) {
				
				for(int k =5; k>=0; k--) {
					
					if(i!=j && j!=k && i!=k) {
						sum=blocks[i]+blocks[j]+blocks[k];
						if(sum==height1) {
						lblocks[0]=blocks[i];
						lblocks[1]=blocks[j];
						lblocks[2]=blocks[k];
						
						state++;
						break;}
					}
				}
				
			}
			}}
		}
		for( int i=0; i<6; i++) {
			if(blocks[i]!=lblocks[0] &&blocks[i]!=lblocks[1] &&blocks[i]!=lblocks[2]) {
				rblocks[inner]=blocks[i];
				inner++;
			}
			if(inner>2) {state++;break;}
		}

		order(lblocks); order(rblocks); join(lblocks,rblocks,blocks);

	}
	}
}
