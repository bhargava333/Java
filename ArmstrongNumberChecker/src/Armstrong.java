
public class Armstrong {
	boolean armstrongChecker(int n) {
		int temp1 = n;
		int temp2 = n;
		int sum=0;
		int count=0;
		while(temp1!=0) {
			count++;
			temp1=temp1/10;
		}
		while(n!=0)
		{
			int rem = n%10;
			sum = (int)(sum+Math.pow(rem,count));
			n=n/10;
		}
		if(temp2==sum) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
