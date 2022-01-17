package com.pal;
import java.time.*;
import java.util.*;

public class DateAndMonthAndYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the year");
		int year=scn.nextInt();
		System.out.println("Enter the month");
		int month=scn.nextInt();
		System.out.println("Enter the day");
		int day=scn.nextInt();
	
		        LocalDate pdate = LocalDate.of(year,month, day);
		        LocalDate now = LocalDate.now();
		 
		        Period diff = Period.between(pdate, now);
		 
		     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
		                    diff.getYears(), diff.getMonths(), diff.getDays());
		  }
		


	}


