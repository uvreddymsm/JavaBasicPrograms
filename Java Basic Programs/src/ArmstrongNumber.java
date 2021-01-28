
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=153;
		int temp=number;
		int rem;
		int sum=0;
		
		while(number>0) {
			rem=number%10;
			System.out.println("Remainder" +rem);
			sum=sum+rem*rem*rem;
			System.out.println("Sum" +sum);
			number=number/10;
			System.out.println("Number" +number);
		}
		
		if(temp==sum) {
			System.out.println("It'a Amstrong Number");
		}else {
			System.out.println("It'a Not A Amstrong Number");
		}
	}

}
