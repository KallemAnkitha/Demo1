package com.nit.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Occurence 
{
	public static void main(String[] args) 
	{
		Stream<String> s=Stream.of("anu","lucky","anu","pallavi","sid","lucky");
		List<Integer> l=s.peek(s1->
		System.out.println(s1.toUpperCase()))
				.map(num->num.length())
				.collect(Collectors.toList());
		System.out.println(l);
	}
}
