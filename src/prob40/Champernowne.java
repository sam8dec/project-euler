package prob40;

public class Champernowne {
	
	public static void main(String[] args) {
		StringBuilder NB=new StringBuilder("");
		int i;
		for(i=1;NB.length()<=1000000;i++) {
			NB.append(i);
			System.out.println(i);
		}
		String N=NB.toString();
		int ans = (N.charAt(0)-'0')*(N.charAt(9)-'0')*(N.charAt(99)-'0')*(N.charAt(999)-'0')*(N.charAt(9999)-'0')*(N.charAt(99999)-'0')*(N.charAt(999999)-'0');
		System.out.println(ans);
	}

}
