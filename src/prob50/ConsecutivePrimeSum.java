package prob50;

import java.util.ArrayList;
import java.util.List;

public class ConsecutivePrimeSum {
	public static boolean sieve[] = new boolean[1000000];
	public static void main(String[] args) {
		int i,j,N=0; // N is the number of primes below 1 million
		int[] primes = new int[80000];
		long[] cumsum = new long[80000];
		List<Integer> primesBelowMillion = new ArrayList<Integer>();
		for(i=2;i<1000000;i++) {
			for(j=i*2;j<1000000;j+=i) {
				sieve[j]=true;
			}
		}
		j=0;
		for(i=2;i<1000000;i++) {
			if(!sieve[i]) {primes[j++]=i;N++;}
		}
		cumsum[0]=primes[0];
		for(i=1;i<N;i++) {
			cumsum[i]=cumsum[i-1]+primes[i];
		}
		int maxseq=0, maxseqpr=0;
		for(i=0;i<N-1;i++) {
			for(j=i+1;j<N;j++) {
				if(cumsum[j]-cumsum[i]<1000000 && !sieve[(int)(cumsum[j]-cumsum[i])] && j-i+1>maxseq) {maxseq=j-i+1;maxseqpr=(int)(cumsum[j]-cumsum[i]);}
			}
		}
		System.out.println(maxseq+" "+maxseqpr);
	}

}
