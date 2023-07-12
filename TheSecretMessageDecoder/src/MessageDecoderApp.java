import java.util.Scanner;

public class MessageDecoderApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		MessageDecoder m = new MessageDecoder();
		System.out.println(m.decodeCharacter(c));

	}

}
