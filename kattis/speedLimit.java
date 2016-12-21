package kattis;

import java.util.Scanner;

public class speedLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count=0,result=0,tick,tt=0, time=0;
		while(count !=-1){
			count=scan.nextInt();
			result=0;
			time=0;
			for(int i =0; i<count;i++){
				tick = scan.nextInt();
				tt=scan.nextInt();
				
				result=result+tick*(tt-time);
				time=tt;
			}
			System.out.println(result+" miles");
		}

	}

}
