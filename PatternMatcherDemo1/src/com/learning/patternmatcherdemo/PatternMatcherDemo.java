package com.learning.patternmatcherdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherDemo {

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("IT");
		Matcher matcher=pattern.matcher("IT");
		if(matcher.matches())
		{
			System.out.println("Match found");
		}
		else
		{
			System.out.println("Not matching");
		}
			

	}

}
