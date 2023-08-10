package com.kodnest.arrays.level1;
import java.util.*;
public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("before swapping a = "+a+"  b = "+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("after swapping  a = "+a+"  b = "+b);
		

	}

}
