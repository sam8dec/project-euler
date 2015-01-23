package prob37;

public class TruncatablePrimes {
	public static boolean sieve[] = new boolean[1000000];
	public static boolean isRightTruncatable(int N) {
		// Check for right truncatable
		while(N>0) {
			if(sieve[N]) return false;
			N/=10;
		}
		return true;
	}
	public static boolean isLeftTruncatable(int N) {
		// Check for left truncatable
		int k=10;
		while(N!=N%k) {
			if(sieve[N%k]) return false;
			k*=10;
		}
		return true;
	}
	public static void main(String[] args) {
		// Fill the sieve
		int i,j;
		sieve[0]=sieve[1]=true;
		for(i=2;i<500000;i++) {
			for(j=i*2;j<1000000;j+=i) {
				sieve[j]=true;
			}
		}
		int s=0;
		for(i=11;i<1000000;i++) {
			if(isLeftTruncatable(i)&&isRightTruncatable(i)) s+=i;
		}
		System.out.println(s);
	}

}
