import java.util.Scanner;

public class FactApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of N:");
		int N = sc.nextInt();
		int f=1;
		for(int i=1;i<=N;i++) {
			f=f*i;
		}
		System.out.println("factorial is: "+f);

}
	}
