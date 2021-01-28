import java.util.Scanner;

public class PrintFirst100FactorialofANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int n=1;
		
		for (int i=n;i<=10;i++) {
			int fact=1;
			for(int j=i;j>=1;j--) {
				fact=fact*j;	
			}
			System.out.println("Fact Of  "+i +"= "+fact);
		}
			
			
		}
		
			
			
}