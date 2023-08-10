package com.kodnest.arrays.level3;

import java.util.Scanner;

public class LinearSearchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array length:");
		int arr[] = new int[sc.nextInt()];
		System.out.println("enter "+arr.length+" array elements:");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("enter key to search:");
		int key = sc.nextInt();
		Search search = new Search();
		int res = search.linearsearch(arr, key);
		if(res>=0)
		{
			System.out.println("key found at the index "+res);
		}
		else
		{
			System.out.println("key not found");
			
		}
		
//		for(int i=0;i<=arr.length-1;i++)
//		{
//			if(key==arr[i])
//			{
//				System.out.println("key found at index "+i);
//				return;
//			}
//		}
//		System.out.println("key not found");

	}

}
