
public class DuplicateOfCharactersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="YUVA RAJUnc nsncdccccccc";
		
		char[] a=str.toCharArray();
		
		for(int i=0;i<=str.length();i++) {
			
			for(int j=i+1;j<str.length();j++) {
				if(a[i]==a[j]) {
					int count=0;
					System.out.println(a[j]);
					break;
				}
			}
			
			
		}

	}

}
