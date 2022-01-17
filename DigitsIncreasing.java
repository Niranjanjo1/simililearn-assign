package com.pal;
import java.util.Scanner;

public class DigitsIncreasing {
	int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		DigitsIncreasing d=new DigitsIncreasing();
		System.out.println("Enter the numbers");
		if(d.checkNumber(d.n=scn.nextInt()))
		{
			System.out.println(d.n+" :increasing");
		}
		else
		{
			System.out.println(d.n+" :not increasing");
		}
		
	}
		
		
		boolean checkNumber(int n) {
		    String check = String.valueOf(n); 
		    int length = check.length();
		    for (int i = 0; i < length-1; i++) {
		        if(check.charAt(i) <= check.charAt(i+1)) {
		            continue;
		        }
		        else return false; 
		    }
		    return true; 
		}

	}


