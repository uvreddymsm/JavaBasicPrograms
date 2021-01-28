
public class FactorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * It is the product of all positive number which is multiply to itself to it's
		 * decreasing number.
		 * 
		 * Example:
		 * 
		 * 5!=5*4*3*2*1=120
		 */
		
		
		int n=5;
		int fact=1;
		for(int i=n;i>=1;i--) {
			
			fact=fact*i;
		}
		System.out.println(fact);
		
	}

}
