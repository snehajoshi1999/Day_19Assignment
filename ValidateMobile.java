package com.brizlabs.rejex;

import java.util.Scanner;

public class ValidateMobile {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your phone no");
        String phone=sc.next();

String regex="^\\d{10}$";

boolean result=phone.matches(regex);

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
