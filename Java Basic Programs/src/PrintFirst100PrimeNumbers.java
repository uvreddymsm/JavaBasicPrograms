

public class PrintFirst100PrimeNumbers {
	
	public static void main(String args[]) {
		
		//int n=3;
		int i;
		
		for(int j=0;j<100;j++) {
			
			for(i=2;i<j;i++) {
				if(j%i==0)
					break;
			}
			if(i==j) {
				System.out.println(j+":Give Number Is Prime");
			}else {
				//System.out.println(j+":Give Number Is Not A Prime");
			}
		}
		
		
		
	}

}
