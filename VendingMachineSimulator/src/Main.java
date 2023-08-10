import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter productcode");
		getProduct(sc.next());
		sc.close();

	}
	public static void getProduct(String productCode) {
		switch(productCode) {
		case "P01":
			System.out.println("coco cola");
			break;
		case "P02":
			System.out.println("pepsi");
			break;
		case "P03":
			System.out.println("mountain dew");
			break;
		case "P04":
			System.out.println("sting");
			break;
		case "P05":
			System.out.println("marza");
			break;
		case "P06":
			System.out.println("thumps up");
			break;
			default:
				System.out.println("enter correct code?");
		}
	}

}
