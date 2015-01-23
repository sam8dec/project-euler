package prob41;

public class Pandigital {
	public static boolean sieve[] = new boolean[1000000000];
	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) {
	    	//System.out.println(prefix+" "+sieve[Integer.parseInt(prefix)]);
	    	if(!sieve[Integer.parseInt(prefix)]) System.out.println(prefix);
	    }
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	
	public static void main(String[] args) {
		int i,j,c=0;
		for(i=2;i<1000000000;i++) {
			if(!sieve[i]) {
				for(j=i*2;j<1000000000;j+=i) {
					sieve[j]=true;
				}
			}
		}
		System.out.println("Sieve Generated "+sieve[2143]);
		//permutation("","1234");
		String s="";
		for(i=1;i<10;i++) {
			s=s+i;
			System.out.println(s);
			permutation("",s);
		}
	}

}
