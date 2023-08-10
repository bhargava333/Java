import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check:");
		checkMultipleOfTen(sc.nextInt());
	}
	
	public static void checkMultipleOfTen(int n) {
		if(n%10==0) {
			System.out.println("The number is a multiple of 10");
		}
		else {
			System.out.println("The number is not a multiple of 10");
		}
	}

}
