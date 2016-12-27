package kattis;
/**
 * Solution for Kattis problem-id: A different problem
 * https://open.kattis.com/problems/different
 *
 * Author: Daniel Gomez
 */
import java.util.Scanner;
import java.lang.Math;

public class different 
{
public static void main(String[]args)
{
	long a;
	long b;
	long result;
	Scanner scanner = new Scanner(System.in);
	while(scanner.hasNextLong())
	{
	a= scanner.nextLong();
	b=scanner.nextLong();
		
	if(a>b)
	{
		result= Math.abs(a-b);
		System.out.println(result);
	}
	else
	{
		result=Math.abs(b-a);
		System.out.println(result);
	}}
}
}
