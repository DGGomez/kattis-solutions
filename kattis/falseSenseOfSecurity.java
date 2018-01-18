package kattis;

import java.util.Scanner;

public class falseSenseOfSecurity {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(scan.hasNext()){
		String line = scan.nextLine();
		System.out.println(morseCode(line));
	}

	}
public static String morseCode(String line){
	String result = "";
	String order ="";
	for(int i =0; i<line.length(); i++){
		String dot = line.substring(i,i+1);
		result+=coder(dot);
		order+=coder(dot).length();
	}
	order = reverseOrder(order);
	result = deMorseCode(result,order);
	return result;
}
public static String deMorseCode(String line, String order){
	String result = "";
	int total=0;
	for(int i =0; i<order.length(); i++){
		int numb = Integer.parseInt(order.substring(i,i+1));
		result += decoder(line.substring(total,total+numb));
		total+=numb;
	}
	return result;
}
public static String reverseOrder(String order){
	char[] in = order.toCharArray();
    int begin=0;
    int end=in.length-1;
    char temp;
    while(end>begin){
        temp = in[begin];
        in[begin]=in[end];
        in[end] = temp;
        end--;
        begin++;
    }
    return new String(in);
}
public static String decoder(String dot){
	if(dot.equals(".-"))return "A";
	else if(dot.equals("-..."))return "B";
	else if(dot.equals("-.-."))return "C";
	else if(dot.equals("-.."))return "D";
	else if(dot.equals("."))return "E";
	else if(dot.equals("..-."))return "F";
	else if(dot.equals("--."))return "G";
	else if(dot.equals("...."))return "H";
	else if(dot.equals(".."))return "I";
	else if(dot.equals(".---"))return "J";
	else if(dot.equals("-.-"))return "K";
	else if(dot.equals(".-.."))return "L";
	else if(dot.equals("--"))return "M";
	else if(dot.equals("-."))return "N";
	else if(dot.equals("---"))return "O";
	else if(dot.equals(".--."))return "P";
	else if(dot.equals("--.-"))return "Q";
	else if(dot.equals(".-."))return "R";
	else if(dot.equals("..."))return "S";
	else if(dot.equals("-"))return "T";
	else if(dot.equals("..-"))return "U";
	else if(dot.equals("...-"))return "V";
	else if(dot.equals(".--"))return "W";
	else if(dot.equals("-..-"))return "X";
	else if(dot.equals("-.--"))return "Y";
	else if(dot.equals("--.."))return "Z";
	else if(dot.equals("..--"))return "_";
	else if(dot.equals(".-.-"))return ",";
	else if(dot.equals("---."))return ".";
	else if(dot.equals("----"))return "?";
	else return "";
}
public static String coder(String dot){
	if(dot.equals("A"))return ".-";
	else if(dot.equals("B"))return "-...";
	else if(dot.equals("C"))return "-.-.";
	else if(dot.equals("D"))return "-..";
	else if(dot.equals("E"))return ".";
	else if(dot.equals("F"))return "..-.";
	else if(dot.equals("G"))return "--.";
	else if(dot.equals("H"))return "....";
	else if(dot.equals("I"))return "..";
	else if(dot.equals("J"))return ".---";
	else if(dot.equals("K"))return "-.-";
	else if(dot.equals("L"))return ".-..";
	else if(dot.equals("M"))return "--";
	else if(dot.equals("N"))return "-.";
	else if(dot.equals("O"))return "---";
	else if(dot.equals("P"))return ".--.";
	else if(dot.equals("Q"))return "--.-";
	else if(dot.equals("R"))return ".-.";
	else if(dot.equals("S"))return "...";
	else if(dot.equals("T"))return "-";
	else if(dot.equals("U"))return "..-";
	else if(dot.equals("V"))return "...-";
	else if(dot.equals("W"))return ".--";
	else if(dot.equals("X"))return "-..-";
	else if(dot.equals("Y"))return "-.--";
	else if(dot.equals("Z"))return "--..";
	else if(dot.equals("_"))return "..--";
	else if(dot.equals(","))return ".-.-";
	else if(dot.equals("."))return "---.";
	else if(dot.equals("?"))return "----";
	else return "";
}
}
