package com.kodnest.arrays.level1;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array length");
		int arr[] = new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter "+i+" th element:");
			arr[i] = sc.nextInt();
		}
		System.out.println("Before Swapping the Array elements are...");
		for(int x:arr)
		{
				System.out.print(x+"  ");
		}
		System.out.println();
		System.out.println("enter indices to swap");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		System.out.println("After Swapping the Array elements are...");
		for(int x:arr)
		{
				System.out.print(x+"  ");
		}
		
		
		

	}

}
