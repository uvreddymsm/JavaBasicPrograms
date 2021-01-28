
public class TestClass {
	
	public static void main(String args[]) {
		
		int n=3;
		int i;
		
		for(  i = 2;i<n;i++) {
			
			if(n%i==0) {
				break;
				
			}
		}
		if(n==i) {
			System.out.println(n+":This Number Is A Prime Number");
		}else
			System.out.println(n+":This Number Is Not A Prime Number");
			
		
		
	}

}
