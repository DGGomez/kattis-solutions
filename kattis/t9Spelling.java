package kattis;

import java.util.Scanner;

public class t9Spelling {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int count = Integer.parseInt(scan.nextLine());
	int innerC=0;
	while(count>0){
		innerC++;
		String line = splitLettersToNumbers(scan.nextLine());
		System.out.println("Case #"+innerC+": "+line);
		count--;
	}
	}
	public static String splitLettersToNumbers(String line){
		String result="";
		for(int i =0; i<line.length(); i++){
			switch(line.substring(i,i+1)){
			case "a": result+=21;
					break;
			case "b": result+=22;
				break;
			case "c": result+=23;
			break;
			case "d": result+=31;
			break;
			case "e": result+=32;
			break;
			case "f": result+=33;
			break;
			case "g": result+=41;
			break;
			case "h": result+=42;
			break;
			case "i": result+=43;
			break;
			case "j": result+=51;
			break;
			case "k": result+=52;
			break;
			case "l": result+=53;
			break;
			case "m": result+=61;
			break;
			case "n": result+=62;
			break;
			case "o": result+=63;
			break;
			case "p": result+=71;
			break;
			case "q": result+=72;
			break;
			case "r": result+=73;
			break;
			case "s": result+=74;
			break;
			case "t": result+=81;
			break;
			case "u": result+=82;
			break;
			case "v": result+=83;
			break;
			case "w": result+=91;
			break;
			case "x": result+=92;
			break;
			case "y": result+=93;
			break;
			case "z": result+=94;
			break;
			case " ": result+="01";
			break;
			default: result+="";
				break;
			}
		}
		result = changeTo(result);
		return result;
	}
	public static String changeTo(String line){
		String result="";
		for(int i =0; i<line.length();i+=2){
			if(i>=2&&line.substring(i,i+1).equals(line.substring(i-2,i-1))){
				result+=" ";
			}
			for(int j =0; j<Integer.parseInt(line.substring(i+1,i+2));j++){
				result+=line.substring(i,i+1);
			}
		
		}
		return result;
	}
}
