
public class ReverseOfAString {
	
	public static void main(String args[]) {
		
		String str="YUVARAJU";
		
		String reverse="";
		
		int lenght=str.length();
		
		for(int i=lenght-1;i>=0;i--) {
			
			 reverse=reverse+str.charAt(i);
			
		}
		System.out.println("Reverse Of The Given String : "+reverse);
	}

}
