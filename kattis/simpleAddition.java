package kattis;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class simpleAddition {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String s;
	s=scan.next();
	BigInteger one = new BigInteger(s);
	s=scan.next();
	BigInteger two = new BigInteger(s);
	two=two.add(one);
			System.out.println(two.toString());
	}

}
