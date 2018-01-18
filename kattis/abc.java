package prct;
import java.util.Scanner;
public class abc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int first = Integer.parseInt(scan.next());
		int second = Integer.parseInt(scan.next());
		int third = Integer.parseInt(scan.next());
		String order=scan.next();
		int temp,temp2;
		//sort by size of number
	
		
		if(first<= second && second<=third) {}
		else if(first<=third && third<=second) {
			temp = second;
			second=third;
			third = temp;
		}
		else if(second<=third && third<=first) {
			temp = first;
			first = second;
			second = third;
			third = temp;
		}
		else if(second<=first && first<=third) {
			temp = first;
			first = second;
			second = temp;
		}
		else if(third<=first && first<=second) {
			temp = first;
			first = third;
			temp2=second;
			second = temp;
			third=temp2;
		}
		else if(third<=second && second<=first) {
			temp = first;
			first = third;
			third=temp;
		}
		
		switch(order){
			case "ABC": 
				System.out.println(first+" "+second+" "+third);
				break;
			case "ACB": 
				System.out.println(first+" "+third+" "+second);
				break;
			case "BCA":
				System.out.println(second+" "+third+" "+first);
				break;
			case "BAC":
				System.out.println(second+" "+first+" "+third);
				break;
			case "CAB":
				System.out.println(third+" "+first+" "+second);
				break;
			case "CBA":
				System.out.println(third+" "+second+" "+first);
				break;
			default: break;
		}
	}

	private static void Switch(String order) {
		// TODO Auto-generated method stub
		
	}

}
