
public class PalindromeOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=123;
		int temp=n;
		int rem;
		int reverse=0;
		
		while(n>0) {
			
			rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}
		
		if(temp==reverse) {
			System.out.println(temp +" : Is A Palindrome");
		}else {
			System.out.println(temp +" : Is Not A Palindrome");
		}
		
	}

}
