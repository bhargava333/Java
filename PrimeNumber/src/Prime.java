import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n :");
		int n = sc.nextInt();
		int count=0;
		if(n<2) {
			System.out.println("its not a prime");
		}
		else{
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					count=count+1;
				}
			}
			if(count==0) {
				System.out.println("its a prime ");
			}
			else {
				System.out.println("its not a prime");
			}
		}
		

	}

}
