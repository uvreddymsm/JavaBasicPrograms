import java.util.Scanner;

public class PrimeNumber {

	public static void main(String args[]) {
		
		/*
		 * This program is used to check wheather give number is Prime Nmber or Not
		 
		 * Prime Number: A number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).
		 
		 */
		
		System.out.println("Please Enter Any Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int i;
		/* int n=10 */;
		
		for(i=2;i<n;i++) {
			
			if(n%i==0)
				break;
		}
		
		if(n==i) {
			System.out.println(n+": Given No Is Prime" );
		}else {
			System.out.println(n+": Given No Is Not A Prime" );
		}
		
	}
}
