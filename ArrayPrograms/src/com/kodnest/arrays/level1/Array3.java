package com.kodnest.arrays.level1;
import java.util.*;
public class Array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array length");
		int arr[] = new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter "+i+" th element:");
			arr[i] = sc.nextInt();
			
		}
		System.out.println("Positive Array elements are...");
		//for(int i=0;i<arr.length;i++)
		for(int j:arr)
		{
			if(j>0) 
			{
				System.out.print(j+"  ");
			}
		}
		
		

	}

}
