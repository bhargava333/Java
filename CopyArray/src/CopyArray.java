import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array length:");
		int arr[] = new int[sc.nextInt()];
		System.out.println("enter "+arr.length+" array elements:");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = sc.nextInt();
		}
		//first array
		System.out.println("original array:");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		//second array
		int arr2[] = new int[arr.length];
		int i=0;
		for(int x:arr)
		{
			arr2[i]=x;
			i++;
		}
		System.out.println("copied array");
		for(int x:arr2)
		{
			System.out.print(x+" ");
		}
		

	}

}
