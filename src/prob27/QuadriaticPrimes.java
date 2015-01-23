package prob27;

public class QuadriaticPrimes {
	public static boolean sieve[] = new boolean[1000];
	public static boolean isPrime(int N) {
		if(N<0) return false;
		if(N<1000) return !sieve[N];
		for(int i=2;i*i<=N;i++) {
			if(N%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int i,j;
		sieve[0]=sieve[1]=true;
		for(i=2;i<1000;i++) {
			if(!sieve[i]) {
				for(j=i*2;j<1000;j+=i) {
					sieve[j]=true;
				}
			}
		}
		int a=0,b=0,mcount=0;
		for(i=0;i<1000;i++) {
			if(!sieve[i]) {
				System.out.println(i);
				for(j=-999;j<=999;j+=2) {
					//System.out.println("-"+j);
					int n=0;
					while(true) {
						if(!isPrime(n*n+j*n+i)) break;
						n++;
					}
					if(n>mcount) {
						mcount=n;
						a=j;
						b=i;
					}
				}
			}
		}
		System.out.println(a+" "+b+" "+mcount+" "+a*b);
	}

}
