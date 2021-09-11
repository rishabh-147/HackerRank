package Hackerrank_DS;

import java.util.Scanner;

public class array_subarray_sum {
	/*
	 * This will find the sum of all the sub-arrays of the given array and print the count of negative sub arrays
	 * 
	 * */

	 public static void main(String[] args) {
	       Scanner sc= new Scanner(System.in);
	        int n=sc.nextInt();
	        int num[]= new int[n];
	        for(int i=0;i<n;i++)
	            {
	            num[i]=sc.nextInt();
	        }
	        int count=0;
	        for(int i=0;i<n;i++)
	            {
	            for(int j=i;j<n;j++)
	                {
	                if(sumNegative(num,i,j))
	                    {
	                    count++;
	                }
	            }
	        }
	        System.out.println(count);
	    }
	    public static boolean sumNegative(int a[],int i, int j)
	        {
	        int sum=0;
	        for(int k=i;k<j+1;k++)
	            {
	            sum+=a[k];
	        }
	     //   System.out.println(Arrays.toString(a)+"i="+i+" j="+j+"  sum="+sum);
	        
	        if(sum<0)
	            {
	            return true;
	        }
	        else
	            {
	            return false;
	        }
	    }
	}
	
