
public class PalindromeOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="MADAM";
		
		char[] a=str.toCharArray();
		
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			reverse=reverse+str.charAt(i);
			
		}
		
		if(str.equalsIgnoreCase(reverse)) {
			System.out.println(str+" : Is Palindrome");			
		}else {
			System.out.println(str+" : Is Not A Palindrome");
		}

	}

}
