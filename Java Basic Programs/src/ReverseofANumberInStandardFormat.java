
public class ReverseofANumberInStandardFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=143;
		
		int rem;
		
		int reverse=0;
		
		int count = 0;
		while(n>0) {
			
			rem=n%10;
			reverse=reverse*10+rem;
			System.out.println("Reverse:"+reverse);
			n=n/10;
			System.out.println("n:"+n);
			count++;
			System.out.println(count+"Count");
			
		}
		
		System.out.println("Reverse Of A Number: "+reverse);
	}

}
