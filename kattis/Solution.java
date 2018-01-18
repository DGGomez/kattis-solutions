/**
 * 
 */
package nkattis;

/**
 * @author Daniel
 *
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static boolean [] visit;
    static int roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities) {
        // Complete this function
        visit=new boolean[n];
        if(c_lib<c_road){
            return n*c_lib;
        }

        //start   
 
        int countR=0, countL=1;
        
        for(int i=1; i<n; i++){
            
            countR= check(cities,n,i,i,countR);
            if(countR!=n-1)c_lib++;
  
        }
        return (countR*c_road+countL*c_lib);
    }
    
    static int check(int [][] cities, int n,int x , int y, int count){
        
        visit[y-1]=true;
        for(int i =0; i<n; i++){
            if(y==cities[i][0]){
                if(!visit[cities[i][1]-1]&& cities[i][1]!=x){
                    count++;
                    y=cities[i][1];
                  
                    
                    count=check(cities,n,x,y,count);
                    break;
                }
            }
            else if(y==cities[i][1]){
                 if(!visit[cities[i][0]-1]&& cities[i][0]!=x){
                    count++;
                    y=cities[i][0];
                    
                     
                     count=check(cities,n,x,y,count);
                    break;
                }
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int c_lib = in.nextInt();
            int c_road = in.nextInt();
            int[][] cities = new int[m][2];
            for(int cities_i = 0; cities_i < m; cities_i++){
                for(int cities_j = 0; cities_j < 2; cities_j++){
                    cities[cities_i][cities_j] = in.nextInt();
                }
            }
            int result = roadsAndLibraries(n, c_lib, c_road, cities);
            System.out.println(result);
        }
        in.close();
    }
}