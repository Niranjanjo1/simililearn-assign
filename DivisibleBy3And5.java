package com.pal;

import java.util.Scanner;
public class DivisibleBy3And5 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the numner");
	int n=s.nextInt();
	B b=new B();
	System.out.println(b.calculateSum(n));
}
}
class B{
	int calculateSum(int n) {
		int b=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0) {
				b+=i;
		}
		}
		return b;
	}
}
