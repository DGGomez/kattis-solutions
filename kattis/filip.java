package prct;

import java.util.Scanner;

public class filip {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String number1 = scan.next();
	String number2 = scan.next();
	int a,b;
	for(int i =3; i>0; i--) {
		a=Integer.parseInt(number1.substring(i-1, i));
		b=Integer.parseInt(number2.substring(i-1, i));
if(a>b) {System.out.println(reverse(number1));break;}
if(b>a) {System.out.println(reverse(number2));break;}
	}
	}

	public static String reverse(String number) {
		String result="";
		for(int i =3; i>0; i--) {
			result+=number.substring(i-1, i);
		}
		return result;
	}
}
