package org.istvanbohm.regularexpression;

import java.util.regex.*;

public class RegularExpressionExample {

	/*
	 * Print matches
	 */
	public static void printMatches(String input,String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
	
	/*
	 * Match a regular expression the given input
	 */
	public static boolean isMatching(String regex,String input) {
		return Pattern.matches(regex, input);

	}
	
	
	public static void test01() {
		String input = " Derek Banas CA 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 411 555-1234";
		printMatches(input,"(\\w)+\\1{1,}");
	}
	
	public static void test02() {
		String input = "(404) 423 33 (38) 4 (1) 5593 (asd)";
		String regex = "\\d+|\\(\\d+\\)";
		printMatches(input,regex);
	}
	
	
	
	/*
	 * Need '\': 
	 * 	.^*+?{}()[]\|
	 * 
	 */
	
	
	public static void main(String[] args) {
		test01();
	}

}
