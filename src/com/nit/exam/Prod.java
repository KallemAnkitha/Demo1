package com.nit.exam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
record Prod1(Integer productId, String productName, Integer price)
{	
}
public class Prod 
{
	public static void main(String[] args) 
	{
		List<Prod1> l=new ArrayList<Prod1>();
		l.add(new Prod1(1,"plum",2000));
		l.add(new Prod1(2,"simple",1500));
		l.add(new Prod1(3,"dermaco",2500));
		l.add(new Prod1(4,"dotandkey",2200));
		Comparator<Prod1> c=new Comparator<Prod1>() 
		{
			@Override
			public int compare(Prod1 o1, Prod1 o2) 
			{
				return o1.price()-o2.price();
			}
		};
		Collections.sort(l,c);
		System.out.println("sorting based on id : ");
		l.forEach(System.out::println);
	}
}
