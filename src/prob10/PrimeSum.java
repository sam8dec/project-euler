package prob10;

public class PrimeSum {
	public static boolean sieve[] = new boolean[2000000];
	public static void main(String[] args) {
		int i,j;
		long sum=0;
		for(i=2;i<2000000;i++) {
			if(sieve[i]) continue;
			sum+=i;
			for(j=i*2;j<2000000;j=j+i) {
				sieve[j] = true;
			}
		}
		System.out.println(sum);
	}

}
