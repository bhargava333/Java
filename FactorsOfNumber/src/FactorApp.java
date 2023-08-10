import java.util.Scanner;

public class FactorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter N");
		int N = sc.nextInt();
		for(int i=1;i<N;i++) {
			if(N%i==0) {
				System.out.println(i+" is a factor of "+N);
			}
		}

	}

}
