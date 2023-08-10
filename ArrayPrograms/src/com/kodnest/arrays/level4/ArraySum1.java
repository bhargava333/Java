package com.kodnest.arrays.level4;

public class ArraySum1 {
	int[] findSum(int arr1[],int arr2[])
	{
		int arr3[] = new int[arr1.length];
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr3[i]=arr1[i]+arr2[i];
		}
		
		
		return arr3;
	}

}
