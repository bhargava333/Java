package com.kodnest.arrays.level1;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array length:");
		int arr[] = new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter "+i+" th element of array:");
			arr[i] = sc.nextInt();
		}
		System.out.println("Array contents:");
		//traditinal for-loop
		/*
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		} */
		//for-each or enhanced for-loop
		for (int i : arr) {
			System.out.print(i+" ");
			
		}

	}

}
