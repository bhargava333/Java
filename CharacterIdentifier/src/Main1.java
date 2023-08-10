import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character to identify :");
		char ch = sc.next().charAt(0);
		identifyCharacter(ch);
		sc.close();

	}
	public static void identifyCharacter(char ch)
	{
		if(Character.isDigit(ch))
		{
			System.out.println("Digit");
		}
		else if(!Character.isLetter(ch))
		{
			System.out.println("special character");
		}
		else{
				switch (Character.toLowerCase(ch))
						{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					if(Character.isLowerCase(ch)) {
						System.out.println("lower-case vowel");
					}
					else {
						System.out.println("upper-case vowel");
					}
					break;
				default:
					if(Character.isLowerCase(ch)) {
						System.out.println("lower-case consonent");
					}
					else {
						System.out.println("upper-case consonent");
					}
			}
		}
	}
}

