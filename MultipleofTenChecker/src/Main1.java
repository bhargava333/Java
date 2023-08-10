import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check:");
		checkMultiple(sc.nextInt(),sc.nextInt());
	}
	
	public static void checkMultiple(int n1,int n2) {
		if(n1%n2==0) {
			System.out.println("given number "+n1+" is a multiple of "+n2);
		}
		else {
			System.out.println("given number "+n1+" is not a multiple of "+n2);
		}
	}

	}

