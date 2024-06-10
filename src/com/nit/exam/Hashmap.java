package com.nit.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap 
{
	public static void main(String[]args)
	{
		Map<String,String> m=new HashMap<>();
		m.put("101","rahul");
		m.put("102","vijay");
		m.put("103","amith");
		System.out.println(m);
		List<String> li=new ArrayList<String>(m.keySet());
		Collections.sort(li);
		for(String word:li) {
			System.out.println(word +" "+ m.get(word));
		}
		Collections.reverse(li);
	}
}

