package com.pal;

import java.util.Scanner;

public class JobRegestration {
	
	String username;
	 int password;
    
	 
	 
	
    static boolean Verifying(String username,int password)
	{
		if(username.length()>=12 && username.endsWith("_job"))
		{
			return true;
		}
			else
			{
			return false;
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		JobRegestration j1=new JobRegestration();
		
		
		
		System.out.println("Enter username and password");
		
		if(Verifying(j1.username=scn.next(),j1.password=scn.nextInt()))
		
			System.out.println("yes");
		else
			System.out.println("no");
		

	}

}
