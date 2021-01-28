
public class LengthOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Program to find the length of a String with out using predefined method.
		
		/*
		 * String str = "Yuvaraju"; int count = 0; for (char c : str.toCharArray()) {
		 * count++; } System.out.println("length: " + count);
		 */
		int n=1947;
		int count=0;
		int reverse = 0;
		int rem;
		
		while(n>0) {
			
			rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
			count++;
			
		}
		System.out.println("Count as:" +count);
			
	}


}