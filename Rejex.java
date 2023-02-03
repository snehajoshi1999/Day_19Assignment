package com.brizlabs.rejex;

import java.util.regex.*;
import java.util.regex.Matcher;
public class Rejex {
	public static void main(String[] args) {
		String re="java lesson1";
		String tex="java lesson";
		Pattern pt=Pattern.compile(re);
		Matcher mt=pt.matcher(tex);
		boolean result=mt.matches();
		
		System.out.println(result);
		
	}

}
