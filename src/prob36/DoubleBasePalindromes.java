package prob36;

public class DoubleBasePalindromes {
	static int sum=0;
	public static void generatePalindromicBinary(String s) {
		if(Integer.parseInt(s,2)>1000000) return;
		String ls=s.substring(0,s.length()/2);
		String rs=s.substring(s.length()/2);
		String s1 = ls+"0"+rs;
		String s1_dec = ""+Integer.parseInt(s1,2);
		if(Integer.parseInt(s1_dec)<1000000 && s1_dec.equals(new StringBuilder(s1_dec).reverse().toString())) sum+=Integer.parseInt(s1_dec);
		
		String s2 = ls+"1"+rs;
		String s2_dec = ""+Integer.parseInt(s2,2);
		if(Integer.parseInt(s2_dec)<1000000 && s2_dec.equals(new StringBuilder(s2_dec).reverse().toString())) sum+=Integer.parseInt(s2_dec);

		String s3 = ls+"00"+rs;
		String s3_dec = ""+Integer.parseInt(s3,2);
		if(Integer.parseInt(s3_dec)<1000000 && s3_dec.equals(new StringBuilder(s3_dec).reverse().toString())) sum+=Integer.parseInt(s3_dec);
		
		String s4 = ls+"11"+rs;
		String s4_dec = ""+Integer.parseInt(s4,2);
		if(Integer.parseInt(s4_dec)<1000000 && s4_dec.equals(new StringBuilder(s4_dec).reverse().toString())) sum+=Integer.parseInt(s4_dec);
		
		generatePalindromicBinary(s3);
		generatePalindromicBinary(s4);
	}
	public static void main(String[] args) {
		generatePalindromicBinary("11");
		System.out.println(sum+4);
	}

}
