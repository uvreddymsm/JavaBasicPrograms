
public class ReverseofANumberInAlternateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=143;
		int rem = 0;
		
		String reverse="";
		while(n>0) {
			
			rem=n%10;
			n=n/10;
			String str=String.valueOf(rem);
			reverse=reverse.concat(str);
			
		}
		System.out.println("Reverse Of A Given Number: "+reverse);

	}

}
