import java.util.Scanner;

public class JourneyCalculatorApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double speed = sc.nextDouble();
		double time = sc.nextDouble();
		JourneyCalculator j = new JourneyCalculator();
		System.out.printf("%.2f",j.calculateDistance(speed, time));
		

	}

	}


