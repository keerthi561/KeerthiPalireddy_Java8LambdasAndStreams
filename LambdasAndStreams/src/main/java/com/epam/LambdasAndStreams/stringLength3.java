package com.epam.LambdasAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class stringLength3 {

	public static void main(String[] args) {
		String [] strArray = {"aBA", "keerthi", "mad", "aaAbs", "ABC", "app"};
		List<String> strList = Arrays.asList(strArray);
		List<String> strings = filterStrings(strList, (String str) -> str.length() == 3 && str.charAt(0) == 'a');
	    System.out.println(strings);
	}

	private static List<String> filterStrings(List<String> list, Predicate<String> predicate) {
		List<String> strings = new ArrayList<>();
	     
		 for (String str : list) {
	       if(predicate.test(str)) {
	    	   strings.add(str);
	       }
	    }
	  return strings;
	}

}
