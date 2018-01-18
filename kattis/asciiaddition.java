package prct;

import java.util.Scanner;

public class asciiaddition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] lines= new String[7];
		
		for(int i =0; i<7; i++) {
			lines[i]=scan.nextLine();
		}
		changetonum(lines);
	}

	public static void changetonum(String[]lines) {
		int size = lines[0].length();
		int numbers=size/6;
		int i=0;
		String result="";
		String []numb=new String[7];
		while(i<size) {
			for(int j=0; j<7; j++) {
				numb[j]=lines[j].substring(i,i+5);
			}
		result+=identifier(numb);
			i+=6;
			}
		String [] numblist=result.split("\\+");
		int numbf=Integer.parseInt(numblist[0])+Integer.parseInt(numblist[1]);
		printnumber(numbf);
		}

	public static String identifier(String []numb) {
		String result="";
		if(numb[0].equals("xxxxx")) {
			if(numb[1].equals("x...x")) {
				if(numb[2].equals("x...x")) {
					if(numb[3].equals("x...x")) {
						if(numb[4].equals("x...x")) {
							if(numb[5].equals("x...x")) {
								if(numb[6].equals("xxxxx")) {
									result+=0;
								}
							}
						}
					}
					else if(numb[3].equals("xxxxx")) {
						if(numb[4].equals("x...x")) {
							if(numb[5].equals("x...x")) {
								if(numb[6].equals("xxxxx")) {
									result+=8;
								}
							}
						}
						else if(numb[4].equals("....x")) {
							if(numb[5].equals("....x")) {
								if(numb[6].equals("xxxxx")) {
									result+=9;
								}
							}
						}
					}
				}
			}
			else if(numb[1].equals("....x")) {
				if(numb[2].equals("....x")) {
					if(numb[3].equals("xxxxx")) {
						if(numb[4].equals("x....")) {
							if(numb[5].equals("x....")) {
								if(numb[6].equals("xxxxx")) {
									result+=2;
								}
							}
						}
						else if(numb[4].equals("....x")) {
							if(numb[5].equals("....x")) {
								if(numb[6].equals("xxxxx")) {
									result+=3;
								}
							}
						}
					}
					else if(numb[4].equals("....x")) {
						if(numb[5].equals("....x")) {
							if(numb[6].equals("....x")) {
								result+=7;
							}
						}
					}
				}
			}
			else if(numb[1].equals("x....")) {
				if(numb[2].equals("x....")) {
					if(numb[3].equals("xxxxx")) {
						if(numb[4].equals("....x")) {
							if(numb[5].equals("....x")) {
								if(numb[6].equals("xxxxx")) {
									result+=5;
								}
							}
						}
						else if(numb[4].equals("x...x")) {
							if(numb[5].equals("x...x")) {
								if(numb[6].equals("xxxxx")) {
									result+=6;
								}
							}
						}
					}
				}
			}
		}
		else if(numb[0].substring(0).equals("....x")) {
			if(numb[1].substring(0).equals("....x")) {
				if(numb[2].equals("....x")) {
					if(numb[3].equals("....x")) {
						if(numb[4].equals("....x")) {
							if(numb[5].equals("....x")) {
								if(numb[6].equals("....x")) {
									result+=1;
								}
							}
						}
					}
				}
			}
			}
		else if(numb[0].equals("x...x")) {
			if(numb[1].equals("x...x")) {
				if(numb[2].equals("x...x")) {
					if(numb[3].equals("xxxxx")) {
						if(numb[4].equals("....x")) {
							if(numb[5].equals("....x")) {
								if(numb[6].equals("....x")) {
									result+=4;
								}
							}	
						}
					}
				}
			}
		}
		else if(numb[0].equals(".....")) {
			if(numb[1].equals("..x..")) {
				if(numb[2].equals("..x..")) {
					if(numb[3].equals("xxxxx")) {
						if(numb[4].equals("..x..")) {
							if(numb[5].equals("..x..")) {
								if(numb[6].equals(".....")) {
									result+="+";
								}
							}	
						}
					}
				}
			}
		}

		return result;
	}
	public static void printnumber(int numb) {
		String number = ""+numb;
		String [] numbf= new String[7];
		numbf[0]="";
		numbf[1]="";
		numbf[2]="";
		numbf[3]="";
		numbf[4]="";
		numbf[5]="";
		numbf[6]="";
		String [] init=new String[7];
		for(int i =0; i<number.length(); i++) {
			if(number.substring(i, i+1).equals("0")) {
				init[0]="xxxxx";
				init[1]="x...x";
				init[2]="x...x";
				init[3]="x...x";
				init[4]="x...x";
				init[5]="x...x";
				init[6]="xxxxx";
				
			}
			else if(number.substring(i, i+1).equals("1")) {
				init[0]="....x";
				init[1]="....x";
				init[2]="....x";
				init[3]="....x";
				init[4]="....x";
				init[5]="....x";
				init[6]="....x";
			}
else if(number.substring(i, i+1).equals("2")) {
	init[0]="xxxxx";
	init[1]="....x";
	init[2]="....x";
	init[3]="xxxxx";
	init[4]="x....";
	init[5]="x....";
	init[6]="xxxxx";
			}
else if(number.substring(i, i+1).equals("3")) {
	init[0]="xxxxx";
	init[1]="....x";
	init[2]="....x";
	init[3]="xxxxx";
	init[4]="....x";
	init[5]="....x";
	init[6]="xxxxx";
}
else if(number.substring(i, i+1).equals("4")) {
	init[0]="x...x";
	init[1]="x...x";
	init[2]="x...x";
	init[3]="xxxxx";
	init[4]="....x";
	init[5]="....x";
	init[6]="....x";
}
else if(number.substring(i, i+1).equals("5")) {
	init[0]="xxxxx";
	init[1]="x....";
	init[2]="x....";
	init[3]="xxxxx";
	init[4]="....x";
	init[5]="....x";
	init[6]="xxxxx";
}
else if(number.substring(i, i+1).equals("6")) {
	init[0]="xxxxx";
	init[1]="x....";
	init[2]="x....";
	init[3]="xxxxx";
	init[4]="x...x";
	init[5]="x...x";
	init[6]="xxxxx";
}
else if(number.substring(i, i+1).equals("7")) {
	init[0]="xxxxx";
	init[1]="....x";
	init[2]="....x";
	init[3]="....x";
	init[4]="....x";
	init[5]="....x";
	init[6]="....x";
}
else if(number.substring(i, i+1).equals("8")) {
	init[0]="xxxxx";
	init[1]="x...x";
	init[2]="x...x";
	init[3]="xxxxx";
	init[4]="x...x";
	init[5]="x...x";
	init[6]="xxxxx";
}
else if(number.substring(i, i+1).equals("9")) {
	init[0]="xxxxx";
	init[1]="x...x";
	init[2]="x...x";
	init[3]="xxxxx";
	init[4]="....x";
	init[5]="....x";
	init[6]="xxxxx";
}
			numbf[0]+=init[0]+".";
			numbf[1]+=init[1]+".";
			numbf[2]+=init[2]+".";
			numbf[3]+=init[3]+".";
			numbf[4]+=init[4]+".";
			numbf[5]+=init[5]+".";
			numbf[6]+=init[6]+".";
		}
	
	int size=numbf[0].length();
	numbf[0]=numbf[0].substring(0,size-1);
	numbf[1]=numbf[1].substring(0,size-1);
	numbf[2]=numbf[2].substring(0,size-1);
	numbf[3]=numbf[3].substring(0,size-1);
	numbf[4]=numbf[4].substring(0,size-1);
	numbf[5]=numbf[5].substring(0,size-1);
	numbf[6]=numbf[6].substring(0,size-1);
	printarray(numbf);
	}
	public static void printarray(String[]list) {
		for(int i=0; i<7; i++) {
			System.out.println(list[i]);
		}
	}
}
