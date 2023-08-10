package com.kodnest.arrays.level4;

public class ArrayMerge {
	
	int[] merge(int arr1[],int arr2[])
	{
		int arr3[] = new int[(arr1.length+arr2.length)];
		int index=0;
		for(int i:arr1)
		{
			arr3[index]=i;
			index++;
		}
		for(int j:arr2)
		{
			arr3[index]=j;
			index++;
		}
		return arr3;
	}
	

}
