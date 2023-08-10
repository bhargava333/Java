package com.kodnest.arrays.level2;

public class PrintArray {
	void printArray(int arr[])
	{
		System.out.println("forward direction:");
		for(int x:arr)
		{
			System.out.print(x+"  ");
		}
		System.out.println();
		System.out.println("backward direction:");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+"  ");
		}
		
	}

}
