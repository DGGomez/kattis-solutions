package prct;
//add counter for decimal places
import java.util.Scanner;

public class alldifferent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int next = Integer.parseInt(scan.nextLine());
		String line;
		String[] splitline;
		double avgx,avgy,avgd;
		double dirx,diry;
		while(next>0) {
			avgx=0; avgy=0;avgd=0;
			double []x = new double[next];
			double []y = new double[next];
			
			for(int i =0; i<next; i++) {
				double []result;
				line= scan.nextLine();
				splitline=line.split(" ");
				dirx=Double.parseDouble(splitline[0]);
				diry=Double.parseDouble(splitline[1]);
				result=path(dirx,diry,splitline);
				x[i]=result[0];
				y[i]=result[1];		
				
			}
			avgx=averger(x);
			avgy=averger(y);
			avgd=biggestDif(avgx,avgy,x,y);
			if(avgx%1==0 && avgy%1==0) {
			System.out.printf((int)avgx+" "+(int)avgy);}
			else if(avgx%1==0) {
				System.out.printf("%d %f",(int)avgx,(float)avgy);
			}
			else if(avgy%1==0) {
				System.out.printf("%f %d",(int)avgy,(float)avgy);
			}
			else {
				System.out.printf("%f %f",(float)avgx,(float)avgy);
			}
			if(avgd%1==0) {
				System.out.printf(" "+(int)avgd);
			}
			else {
				System.out.printf(" %f",(float)avgd);
			}
			System.out.println();
			next = Integer.parseInt(scan.nextLine());
		}
	}
	public static double[] path(double x,double y,String[]list) {
	
		double angle=0;
		double distance=0;
		double valueRadians;
		
		for(int i =2; i<list.length-1; i++) {
			if(list[i].equals("start")) {angle =Double.parseDouble(list[i+1]);}
			if(list[i].equals("walk")) {
				//x+
				if(angle==0) {
					x+=Double.parseDouble(list[i+1]);
					}
				//x+, y+
				if(angle>=1 && angle<=89) {
					distance =Double.parseDouble(list[i+1]);
					valueRadians = Math.toRadians(angle);
					y+=distance*Math.sin(valueRadians);
					x+=distance*Math.cos(valueRadians);
				}
				//y+
				if(angle==90) {
					y+=Double.parseDouble(list[i+1]);
				}
				//x-,y+
				if(angle>=91 && angle<=179) {
					distance =Double.parseDouble(list[i+1]);
					valueRadians = Math.toRadians(angle);
					y+=distance*Math.sin(valueRadians);
					x+=distance*Math.cos(valueRadians);
				}
				//x-
				if(angle==180) {
					x-=Double.parseDouble(list[i+1]);
				}
				//x-,y-
				if(angle>=181 && angle<=269) {
					distance =Double.parseDouble(list[i+1]);
					valueRadians = Math.toRadians(angle);
					y+=distance*Math.sin(valueRadians);
					x+=distance*Math.cos(valueRadians);
				}
				//y-
				if(angle==270) {
					y-=Double.parseDouble(list[i+1]);
				}
				//y-,x+
				if(angle>=271 && angle<=359) {
					distance =Double.parseDouble(list[i+1]);
					valueRadians = Math.toRadians(angle);
					y+=distance*Math.sin(valueRadians);
					x+=distance*Math.cos(valueRadians);
					
				}
				
			}
			if(list[i].equals("turn")) {angle +=Double.parseDouble(list[i+1]);}
			if(angle<0) angle =(angle%360)+360;
			if(angle>=360) angle=(angle%360);
			
		}
		double [] result= new double[2];
		result[0]=x;
		result[1]=y;
		return result;
		
	}
	public static double averger(double[]avg) {
		double result=0;
		for(int i =0; i<avg.length;i++) {
			result+=avg[i];
		}
		result=result/avg.length;
		return result;
	}
	public static double biggestDif(double x, double y,double[]avgx, double[]avgy) {
		double result=0;
		double difference;
		for(int i =0; i<avgx.length;i++) {
			difference=Math.sqrt(Math.pow((x-avgx[i]), 2)+Math.pow((y-avgy[i]), 2));
			if(difference>result)result=difference;
		}
		return result;
	}
}
