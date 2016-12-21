package kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class secureDoors {
	private static ArrayList<String>list = new ArrayList<String>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
int count = Integer.parseInt(scan.next());
String state, name;
while(count>0){
state= scan.next();
name = scan.next();
//error 1 entry but already on list
if(state.substring(0).equals("entry") && checker(name)){

	System.out.println(name+" entered (ANOMALY)");
}
//error 2 exit but not on list
if(state.substring(0).equals("exit") && !checker(name)){
	
	System.out.println(name+" exited (ANOMALY)");
}
//if not in list and entry add
if(state.substring(0).equals("entry") && !checker(name)){
	list.add(name);
	System.out.println(name+" entered");
}
//if on list and exit remove
if(state.substring(0).equals("exit") && checker(name)){
	list.remove(name);
	System.out.println(name+" exited");
}
	count--;
}
	}
	public static boolean checker(String name){
		for(int i =0; i<list.size();i++){
			if(list.get(i).substring(0).equals(name)){
				return true;
			}
		}
		return false;
	}

}
