
public class ReverseOfANumber {
	
	public static void main(String args[]) {
		
		int n=1947;
		//7491
		int length = String.valueOf(n).length();
		
		String str=String.valueOf(n);
		
		System.out.println(str);
		
		System.out.println(length);
		String rev="";
		
		for(int i=length-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
			
		}
		System.out.println("******"+rev);
		
		
	}
	

}
