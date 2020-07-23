package com.epam.LambdasAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Palindrome {

	public static void main(String[] args) {
		String [] strArray = {"ABA", "keerthi", "madam"};
	    List<String> strList = Arrays.asList(strArray);
		List<String> listWithPalindromes = filterPalindromes(strList, (String str) -> str.equals(reverse(str)));
	    System.out.println(listWithPalindromes);
	}

	private static String reverse(String str) {
		StringBuilder s1 = new StringBuilder(); 
		s1.append(str);
		return new String(s1.reverse());
	}

	private static List<String> filterPalindromes(List<String> list, Predicate<String> predicate) {
		List<String> palindromes = new ArrayList<>();
	     
		 for (String str : list) {
	       if(predicate.test(str)) {
	    	   palindromes.add(str);
	       }
	    }
		 System.out.println(palindromes);
	  return palindromes;
	}

}
