package com.kodnest.arrays.level4;
import java.util.*;
public class Program3 {

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
		int res[] = replace(arr1);
		System.out.println("result is:");
		for(int i:res)
		{
			System.out.print(i+" ");
		}

	}
	static int[] replace(int arr1[])//logic
	{
		int arr2[] = new int[arr1.length];
		for(int i=0;i<=arr1.length-1;i++)
		{
			if(arr1[i]<0)
			{
				arr2[i]=0;
			}
			else
			{
				arr2[i] = arr1[i];
			}
		}
		return arr2;
	}

}
