package com.nit.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Evenodd 
{
	public static void main(String[]args)
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements : ");
		for( i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("elements are : ");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
//		List<Integer> l=new ArrayList<Integer>();
//		l.add(arr[i]);
//		l.add(arr[i]);
//		l.add(arr[i]);
//		l.add(arr[i]);
		for(i=0;i<arr.length;i++) {
		if(arr[i]%2==0)
		{
			System.out.println(arr[i]+" number is even : "+" ");
		}
		else
		{
			System.out.println("\n"+arr[i]+" number is odd");
		}
		}
	}
}
