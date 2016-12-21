package kattis;

import java.util.Scanner;

public class newAlphabet {
public static void main(String[]args){
	Scanner scan = new Scanner(System.in);
	String word =scan.nextLine().toLowerCase();

		word=word.replace("a", "@");
		word=word.replace("b", "8");
		word=word.replace("c", "(");
		word=word.replace("d", "|)");
		word=word.replace("e", "3");	
		word=word.replace("f", "#");
		word=word.replace("g", "6");
		word=word.replace("h", "[-]");
		word=word.replace("i", "|");
		word=word.replace("j", "_|");
		word=word.replace("k", "|<");
		word=word.replace("l", "1");
		word=word.replace("m", "[]\\/[]");	
		word=word.replace("n", "[]\\[]");
		word=word.replace("o", "0");
		word=word.replace("p", "|D");
		word=word.replace("q", "(,)");
		word=word.replace("r", "|Z");
		word=word.replace("s", "$");
		word=word.replace("t", "']['");
		word=word.replace("u", "|_|");	
		word=word.replace("v", "\\/");
		word=word.replace("w", "\\/\\/");
		word=word.replace("x", "}{");
		word=word.replace("y", "`/");
		word=word.replace("z", "2");


System.out.println(word);	
}
}