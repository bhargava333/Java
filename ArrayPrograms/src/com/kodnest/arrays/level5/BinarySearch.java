package com.kodnest.arrays.level5;
import java.util.*;
public class BinarySearch {
	int search(int arr[],int key)
	{
		int low=0;
		int high=arr.length-1;
		int mid;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(key==arr[mid])
			{
				return mid;
			}
			else if(key>arr[mid])
			{
				low=mid+1;
				//high = high;
			}
			else
			{
				high=mid-1;
				//low=low;
			}
		}
		return -1;
	}

}
