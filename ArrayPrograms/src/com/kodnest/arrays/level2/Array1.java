package com.kodnest.arrays.level2;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array length");
		int arr[] = new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter "+i+" th element:");
			arr[i] = sc.nextInt();
		}
		PrintArray printArray = new PrintArray();
		printArray.printArray(arr);
		

}
}
