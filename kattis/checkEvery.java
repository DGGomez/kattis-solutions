package kattis;

public class checkEvery {
	public static void main(String[]args){
	Boolean j;
	String[] array = new String[10];
	array[0]="kingston";
	array[1]="toronto";
	array[2]="ottowa";
	array[3]="lisbin";
	array[4]="london";
	array[5]="saskatoon";
	array[6]="krakow";
	array[7]="india";
	array[8]="san diego";
	array[9]="rose";
	String word="toronto";
	j=false;
	for(int i =0; i<array.length;i++){
		if(array[i].equals(word)){
			j=true;
		}
	}
	System.out.println(j);
}
}