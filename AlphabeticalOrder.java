package com.pal;
import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the a string");
		String wrd=scn.next();
	    if(alphabet(wrd))
	    {
	    	System.out.println("yes");
	    }
	    	else
	    		System.out.println("no");
	    }

	
	
	static boolean alphabet(String wrd)
	{
		
		int n=wrd.length();
		
	   char c[]=new char[n];
	   
	   for(int i=0;i<n;i++) 
	   {
         c[i]=wrd.charAt(i);
	   }
	   
	   Arrays.sort(c);
	   
	   for(int i=0;i<n;i++)
	   
		   if(c[i]!=wrd.charAt(i))
		   
			  return false;
		   
		  
			   return true;
	   

}
}
