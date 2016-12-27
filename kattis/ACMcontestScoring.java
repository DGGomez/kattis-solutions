package kattis;

import java.util.Scanner;

public class ACMcontestScoring 
{

public static void main(String[] args) 
{
Scanner scan = new Scanner(System.in);
	
boolean lastState=false;
int score = 0;
int rightAns=0;
	
while(scan.hasNext())
{
	int time = Integer.parseInt(scan.next());
	if(time<0)break;
	
	String letter = scan.next();
	String state = scan.next();
	if(state.substring(0).equals("right"))
	{
		score+=time;
		rightAns++;
		lastState=true;
	}
	else{
		if(lastState)
		{
			score+=20;
		}
		lastState=false;
	}
}
System.out.println(rightAns+" "+score);
	
}
}


