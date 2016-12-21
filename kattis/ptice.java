package kattis;

import java.util.Scanner;

public class ptice {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int len = Integer.parseInt(scan.next());
	String word = scan.next();
	String adrian ="ABC";
	String bruno = "BABC";
	String goran = "CCAABB";
	adrian = adjust(adrian,len);
	bruno = adjust(bruno,len);
	goran = adjust(goran,len);
	int a=0;
	int b=0;
	int g=0;
	a = checker(word,adrian);
	b = checker (word,bruno);
	g = checker(word,goran);

	 dis(a,b,g);
	
	}
public static String adjust(String word, int len){
	String result="";
	int count =0;
	
	while (count<len){
		for(int i =0; i<word.length();i++){
			result = result + word.substring(i,i+1);
			count++;
			if(count>len-1){
				break;
			}
		}
	}
	return result;
}
public static int checker(String word, String name){
	int result=0;
	for(int i =0; i<word.length();i++){
		if(word.substring(i,i+1).equals(name.substring(i,i+1))){
			result++;
		}
	}
	return result;
}
public static void dis(int a, int b, int g){
	
	if(a==b && b==g){
		System.out.println(a);
		System.out.println("Adrian");
		System.out.println("Bruno");
		System.out.println("Goran");
	}
	else if(a==b && b>g){
		System.out.println(a);
		System.out.println("Adrian");
		System.out.println("Bruno");
	}
	else if(a==g&&a>b){
		System.out.println(a);
		System.out.println("Adrian");
		System.out.println("Goran");
	}
	else if (b==g && b>a){
		System.out.println(b);
		System.out.println("Bruno");
		System.out.println("Goran");
	}
	else if(b>g && b>a){
		System.out.println(b);
		System.out.println("Bruno");
	}
	else if(a>g && a>b){
		System.out.println(a);
		System.out.println("Adrian");
	}
	else {
		System.out.println(g);
		System.out.println("Goran");
	}
}
}
