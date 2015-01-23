package prob3;

public class LargestPrimeFactor {
	public static long largestPrimeFactor2(long N) {
		System.out.println(N);
		long i;
		for(i=2;i<N/2;i++) {
			if(N%i==0) break;
		}
		if(i>=N/2) return N;
		return largestPrimeFactor2(N/i);		
	}
	
	public static boolean sieve[] = new boolean[800000];
	public static long largestPrimeFactor(long N) {
		int i;
		int max=0;
		long S = 0;
		for(i=2;(S=i*(long)i)<N;i++) {
			if(N%i==0) {
				if(!sieve[i] && i>max) max=i;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int i,j;
		for(i=2;i<800000;i++) {
			if(sieve[i]) continue;
			for(j=i*2;j<800000;j=j+i) {
				sieve[j] = true;
			}
		}
		System.out.println("Sieve Initialized "+sieve[2]+sieve[3]+sieve[4]+sieve[5]+sieve[6]+sieve[7]);
		System.out.println(largestPrimeFactor2(600851475143L));
	}

}
