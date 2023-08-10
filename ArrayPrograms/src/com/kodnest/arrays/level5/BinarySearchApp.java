package com.kodnest.arrays.level5;

import java.util.Scanner;

public class BinarySearchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array length:");
		int arr[] = new int[sc.nextInt()];
		System.out.println("enter "+arr.length+" elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("enter key to search:");
		int key = sc.nextInt();
		BinarySearch binarySearch = new BinarySearch();
		int res = binarySearch.search(arr, key);
		if(res>=0)
		{
			System.out.println("key found at index "+res);
		}
		else
		{
			System.out.println("key not found....");
		}
	}

	}



