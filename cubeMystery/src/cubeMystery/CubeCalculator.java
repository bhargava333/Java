package cubeMystery;

import java.util.Scanner;

public class CubeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(cubeNumber( num));
		sc.close();
		

	}
	public static int cubeNumber(int num) {
		return num*num*num;
	}

}
