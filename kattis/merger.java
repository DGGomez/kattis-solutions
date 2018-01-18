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

public class merger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        
        MergeSorter ms = new MergeSorter();
        ms.sort(unsorted,0, unsorted.length-1);
        for(String s : unsorted)
            System.out.println(s);
        //bigSort(unsorted);
        
    }
}

class MergeSorter{
    public void merge(String arr[], int lidx, int midx, int ridx){
        int lsize = midx-lidx+1;
        int rsize = ridx-midx;
        
        String[] larr = new String[lsize];
        String[] rarr = new String[rsize];
        
        for(int i = 0; i < lsize; i++)
            larr[i] =  arr[lidx+i];
        for(int j = 0; j < rsize; j++)
            rarr[j] =  arr[midx+j+1];
        
        int i = 0, j = 0;
        int k = lidx;
        StrComparator comp = new StrComparator();
        
        while(i < lsize && j < rsize){
            if(comp.compare(larr[i], rarr[j]) < 0){
                arr[k] = larr[i];
                i++;
            }
            else
            {
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }
        
        while(i < lsize){
            arr[k] = larr[i];
            i++;
            k++;
        }
        
        while(j < rsize){
            arr[k] = rarr[j];
            j++;
            k++;
        }
    }
    
    public void sort(String arr[], int lidx, int ridx){
        if(lidx < ridx){
            int midx = (ridx+lidx)/2;
            
            sort(arr,lidx,midx);
            sort(arr,midx+1,ridx);
            
            merge(arr,lidx,midx,ridx);
        }
    }
}

class StrComparator implements Comparator<String>{
        public int compare(String str1, String str2){
            if(str1.length() == str2.length())
                return str1.compareTo(str2);
            else
                //if return > 0, str1 is the larger number
                return str1.length() - str2.length();
        }
}