package com.kodnest.arrays.level4;

import java.util.Scanner;

public class ArrayMergeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st array length:");
		int arr1[] = new int[sc.nextInt()];//array1
		System.out.println("enter "+arr1.length+" array elements:");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("enter 2nd array length:");
		int arr2[] = new int[sc.nextInt()];//array2
		System.out.println("enter "+arr2.length+" array elements:");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i] = sc.nextInt();
		}
		System.out.println("Array1");
		for(int i:arr1)
			{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("array2");
		for(int i:arr2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		ArrayMerge arrayMerge = new ArrayMerge();
		int res[]=arrayMerge.merge(arr1, arr2);
		System.out.println("after merging:");
		for(int i:res)
		{
			System.out.print(i+" ");
		}

	}

}
