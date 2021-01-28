import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * An even number is a number which has a remainder of 0 upon division by 2.
		 * Ex: 2, 4, 6, 8,...
		 * 
		 * An odd number is a number which has a remainder of 1 upon division by 2. Ex:
		 * 1, 3, 5, 7,...
		 */
		

		//int n=10;
		
		System.out.println("Enter any number :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%2==0) {
			System.out.println(n+": Given Number Is Even");
		}else {
			System.out.println(n+": Given Number Is Not A Even");
		}
	}

}
