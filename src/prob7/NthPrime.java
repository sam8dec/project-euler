package prob7;

public class NthPrime {
	public static boolean isPrime(long N) {
		long i;
		for(i=2;i*i<=N;i++) {
			if(N%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int c=0;
		long N=2L,P=0;
		while(true) {
			if(isPrime(N)) {c++;P=N;System.out.println(c+" "+P);}
			if(c==10001) break;
			N++;
		}
		System.out.println(P);
	}

}
