import java.util.*;
public class ArmstrongApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		Armstrong armstrong = new Armstrong();
		boolean res = armstrong.armstrongChecker(n);
		if(res) {
			System.out.println("given number "+n+" is armstrong number!");
		}
		else {
			System.out.println("given number "+n+" is not a armstrong number!");
		}
	}

}
