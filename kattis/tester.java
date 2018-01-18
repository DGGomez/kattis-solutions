package prct;

public class tester {

	public static void main(String[] args) {
		String [] solution = new String[3];
		createSolution(11,solution);

	}
	public static int createSolution(int target, String []solution) {
 String []selections= {"*","+","-","/"};
 String [] numbers= new String[7];

		for(int i=0; i<selections.length; i++) {
			for(int j=0; j<selections.length; j++) {
				for(int k=0; k<selections.length; k++) {
					solution[0]=selections[i];
					solution[1]=selections[j];
					solution[2]=selections[k];
					numbers[0]="4";
					numbers[1]=solution[0];
					numbers[2]="4";
					numbers[3]=solution[1];
					numbers[4]="4";
					numbers[5]=solution[2];
					numbers[6]="4";
					System.out.println("4 "+solution[0]+" 4 "+solution[1]+" 4 "+solution[2]+" 4 = "+test(target,solution,numbers));

				}
			}
		}
		
	return 0;
	}
	public static int test(int target,String[] solution,String []numbers) {

//all div, all mult, all add, all sub
		int j=0;
while(j<numbers.length) {
	if(numbers[j].equals("/"))
	{
		numbers[j-1]=""+(Integer.parseInt(numbers[j-1])/Integer.parseInt(numbers[j+1]));
		numbers[j]="NULL";
		numbers[j+1]="NULL";
		shrink(numbers);
		j=0;
}
	j++;
}
int k=0;
while(k<numbers.length) {
if(numbers[k].equals("*"))
{
numbers[k-1]=""+(Integer.parseInt(numbers[k-1])*Integer.parseInt(numbers[k+1]));
numbers[k]="NULL";
numbers[k+1]="NULL";
shrink(numbers);
k=0;

}
k++;
}
int m=0;
while(m<numbers.length) {
if(numbers[m].equals("-"))
{
numbers[m-1]=""+(Integer.parseInt(numbers[m-1])-Integer.parseInt(numbers[m+1]));
numbers[m]="NULL";
numbers[m+1]="NULL";
shrink(numbers);
m=0;

}
m++;
}
int l=0;
while(l<numbers.length) {
if(numbers[l].equals("+"))
{
numbers[l-1]=""+(Integer.parseInt(numbers[l-1])+Integer.parseInt(numbers[l+1]));
numbers[l]="NULL";
numbers[l+1]="NULL";
shrink(numbers);
l=0;
}
l++;
}

	return Integer.parseInt(numbers[0]);

	}
	public static void shrink(String []numbers) {
	
		for(int i =0; i<numbers.length;i++) {
			if(numbers[i].equals("NULL")) {
				for(int j=i;j<numbers.length;j++) {
					if(!numbers[j].equals("NULL")) {
						numbers[i]=numbers[j];
						numbers[j]="NULL";
						break;
					}
				}
			}
		}
		
		
	}
}

