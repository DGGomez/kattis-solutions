package kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class modulo {
private static ArrayList<Integer> mods = new ArrayList<Integer>();
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(scan.hasNext()){
		int check = Integer.parseInt(scan.next());
		int mod = check%42;
		checker(mod);
	}
	System.out.println(mods.size());
	}
public static void checker(int mod){
	int found =0;
	for(int i =0; i<mods.size();i++){
		if(mod==mods.get(i)){
			found=1;
		}
	}
	if(found ==0){
		mods.add(mod);
	}
}
}
