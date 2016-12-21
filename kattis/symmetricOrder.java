package kattis;

import java.util.Scanner;

public class symmetricOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int set = 1;
		while(scan.hasNext()){
			
			int numb = Integer.parseInt(scan.next());
			
			if(numb>0){
			System.out.println("SET "+set);
			String[] arr = new String[numb];
			for(int i =0; i<numb; i++){
				arr[i]=scan.next();
			}
			dis1(numb,arr);
		    dis2(numb,arr);
			
			set++;
			}
			
		}
	}
public static void dis1(int numb, String[]arr){
	for(int i=0; i<numb; i++){
		if(i%2==0)System.out.println(arr[i]);
	}
}
public static void dis2(int numb, String[]arr){
	for(int i=numb-1; i>=0; i--){
		if(i%2==1)System.out.println(arr[i]);
	}
}
}
