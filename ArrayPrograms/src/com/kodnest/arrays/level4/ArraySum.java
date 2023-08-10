package com.kodnest.arrays.level4;

import java.util.Scanner;

public class ArraySum {

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
		System.out.println("Array elements:");
		int sum=0;
		for(int x:arr)
		{
			System.out.print(x+" ");
			sum+=x;
		}
		System.out.println();
		System.out.println("sum of an array elements is: "+sum);
		

	}

}
