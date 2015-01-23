package prob4;

public class LargestPalinProd {
	public static boolean isPalindrome(String S,int i,int j) {
		if(i>=j) return true;
		if(S.charAt(i)==S.charAt(j) && isPalindrome(S,i+1,j-1)) return true;
		return false;
	}
	public static void main(String[] args) {
		int i,j,m=0;
		for(i=100;i<=998;i++) {
			for(j=i+1;j<=999;j++) {
				int p = i*j;
				if(isPalindrome(""+p,0,(""+p).length()-1) && p>m) m=p;
			}
		}
		System.out.println(m);
	}

}
