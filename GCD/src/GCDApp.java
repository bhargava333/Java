import java.util.*;
public class GCDApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 numbers to find gcd :");
		int m = sc.nextInt();
		int n = sc.nextInt();
		//GCD g = new GCD();
		System.out.println("GCD of "+m+" and "+n+" is :"+GCD.findGCD(m, n));
		

	}

}
