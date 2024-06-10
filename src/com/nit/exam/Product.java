package com.nit.exam;

import java.util.Comparator;

public class Product implements Comparator<Product>
{
	int pid;
	String pname;
	int gpa;
	public Product(int pid, String pname,int gpa) 
	{
		super();
		this.pid = pid;
		this.pname = pname;
		this.gpa=gpa;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", gpa"+gpa+"]";
	}
	@Override
	public int compare(Product o1, Product o2) 
	{
		return o1.pid-o2.pid;
	}
	
}
