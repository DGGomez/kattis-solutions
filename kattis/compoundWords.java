package kattis;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.List;

public class compoundWords {
private static Collection<String>list = new TreeSet<String>(Collator.getInstance());
	public static void main(String[] args) {
		ArrayList<String>words = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
	while(scan.hasNext()){
		words.add(scan.next());
	}
	for(int i =0; i<words.size(); i++){
		for(int j =0; j<words.size(); j++){
			if(i!=j){
				String concat = words.get(i)+words.get(j);
				if(checker(concat)){
					list.add(concat);
				}
			}
		}
	}
	
	printer();
	}
	 public static int compare(String o1, String o2) {
         if(o1.length()>o2.length()){
             return 1;
         }else{
             return o1.compareTo(o2);
         }
     }
	public static boolean checker(String word){
		for(String words: list){
			if(word.substring(0).equals(words)){
				return false;
			}
		}
		return true;
	}
	public static void sorter(){
		for(int i =0; i<list.size(); i++){
			for(int j =0; j <list.size(); j++){
				
			}
		}
	}
	public static void printer(){
		for(String word : list){
			System.out.println(word);
		}
	}

}
