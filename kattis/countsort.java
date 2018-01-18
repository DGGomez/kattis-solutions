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

public class countsort {

    static int[] countingSort(int[] arr) {
        // Complete this function
        int [] A = new int [100];
        int []newArr = new int[arr.length];
        int count,c=0;
        for(int i =0; i<100; i++){
            count=0;
            for(int j=0; j<arr.length;j++){
                if(arr[j]==i)count++;
            }
            A[i]=count;
        }
        for(int k =0;k<100; k++){
            count=A[k];
            for(int x =0; x<count; x++){
                newArr[c]=k;
                c++;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = countingSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
