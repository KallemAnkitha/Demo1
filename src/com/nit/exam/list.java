package com.nit.exam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class list 
{
	public static void main(String[]args)
	{
		List<Product> l=new ArrayList<Product>();
		l.add(new Product(1,"pallavi",5));
		l.add(new Product(2,"lucky",9));
		l.add(new Product(3,"anu",7));
		Comparator<Product> c=new Comparator<Product>() 
		{
			@Override
			public int compare(Product o1, Product o2) 
			{
				return o1.pid-o2.pid;
			}
		};
		Collections.sort(l,c);
		System.out.println("sorting based on id : ");
		l.forEach(System.out::println);
		Comparator<Product> c1=new Comparator<Product>() 
		{
			@Override
			public int compare(Product o1, Product o2) 
			{
				return o1.pname.compareTo(o2.pname);
			}
		};
		Collections.sort(l,c1);
		System.out.println(".................................");
		System.out.println("sortin based on name : ");
		l.forEach(System.out::println);
		Comparator<Product> c2=new Comparator<Product>() 
		{
			@Override
			public int compare(Product o1, Product o2) 
			{
				return o1.gpa-o2.gpa;
			}
		};
		Collections.sort(l,c2);
		System.out.println("..............................");
		l.forEach(System.out::println);
	}
}
