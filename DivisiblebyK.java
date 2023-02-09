package zoho.test;

import java.util.Arrays;
import java.util.Scanner;

public class DivisiblebyK {

	public static void main(String[] args) {
		 int count=0;
	        Scanner in = new Scanner(System.in);
	        System.out.print("enter the no of elements:");
	        int n = in.nextInt();
	        System.out.print("enter the k:");
	        int k = in.nextInt();
	        System.out.print("enter the elements:");
	        int a[] = new int[n];
	        for(int i=0; i < n; i++){
	            a[i] = in.nextInt();   //  input
	        }
	        for(int i=0; i < n-1; i++)
	        {
	          for(int j=i+1; j< n; j++)
	          {
	           if( (a[i]+a[j])%k==0)
	               count++;
	               
	        } 
	        }
	        System.out.println(count);
	    }
	}
