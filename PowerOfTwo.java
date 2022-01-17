package com.pal;

import java.util.Scanner;

public class PowerOfTwo {
	int n;


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		PowerOfTwo p=new PowerOfTwo();
		
		if(p.powerOfTwoGeneral(p.n=scn.nextInt()))
		{
			System.out.println(p.n+" is power of two");
		}
		else {
			System.out.println(p.n+" is not power of two");
		}
		
		
		
		
	}

boolean powerOfTwoGeneral(int n)
 {
 while(n%2==0)
 {
 n=n/2;
 }
 if(n==1)
 {
 return true;
 }
 else
 {
 return false;
 }
 }

}
