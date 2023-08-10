import java.util.*;
public class ReverseApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value :");
		int n = sc.nextInt();
		Reverse r = new Reverse();
		int rev = r.reverse(n);
		System.out.println("reverse of given number is:  "+rev);
		if(n==rev) {
			System.out.println("given number is palindrome");
		}
		else {
			System.out.println("given number is not palindrome");
		}
		
		

	}

}
