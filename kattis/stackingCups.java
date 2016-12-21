package kattis;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class stackingCups {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
int x = Integer.parseInt(scan.next());
Map <Integer, String> map = new HashMap<Integer, String>();
int [] arr = new int[x];
int i =0;
String s;
while(x>0){
	 s=scan.next();
try { 
	x--;
	
    Integer.parseInt(s); 
   
    arr[i]=Integer.parseInt(s);
    i++;
    String color;
    color= scan.next();
    map.put(Integer.parseInt(s)/2, color);
} catch(NumberFormatException e) { 
	int num = Integer.parseInt(scan.next());
   map.put(num, s);
} catch(NullPointerException e) {
	System.out.println("NAW");
}

}
i=0;
for(Integer name:map.keySet()){
	System.out.println(map.get(name));
}
}
}
