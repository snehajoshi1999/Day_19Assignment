package com.brizlabs.rejex;

import java.util.Scanner;

public class Passwordvalidation {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Password");
	        String pass=sc.next();

	String regex="/^(?=.*[a-z].*[a-z])(?=.*[!\"#...\\d].*[!\"#...\\d]).{8,}$/gmi";

	boolean result=pass.matches(regex);

	System.out.println(result);

	if (result==true)
	{
	System.out.println("your phone no is valid");

	}
	else
	{
	System.out.println("your phone no is not valid");
	}
	}

	}


