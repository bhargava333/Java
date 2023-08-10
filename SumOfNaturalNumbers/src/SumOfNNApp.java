import java.util.Scanner;

public class SumOfNNApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SumOfNN s = new SumOfNN();
		System.out.println("enter the value of N:");
		System.out.println("result is: "+s.sum(sc.nextInt()));

	}

}
