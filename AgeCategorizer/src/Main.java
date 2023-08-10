import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age?");
		categorizeAge(sc.nextInt());
		sc.close();

	}
	public static void categorizeAge(int age)
	{
		if(age>0 && age <=12) {
			System.out.println("child");
		}
		else if(age>=13 && age<=19) {
			System.out.println("Teenage");
		}
		else if(age>=20 && age<=59) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior");
		}
	}

}
