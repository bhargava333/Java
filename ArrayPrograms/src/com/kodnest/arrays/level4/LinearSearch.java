package com.kodnest.arrays.level4;

public class LinearSearch {
	int search(int arr[],int key)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
				return i;
			}
		}
		return -1;
	}

}
