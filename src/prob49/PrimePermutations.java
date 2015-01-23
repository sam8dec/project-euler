package prob49;

public class PrimePermutations {
	public static boolean sieve[] = new boolean[10000];
	public static boolean isPerm(int i,int j) {
		int[] digitFreqi = new int[10];
		int[] digitFreqj = new int[10];
		while(i>0) {
			digitFreqi[i%10]++;
			i/=10;
		}
		while(j>0) {
			digitFreqj[j%10]++;
			j/=10;
		}
		for(i=0;i<10;i++) if(digitFreqi[i]!=digitFreqj[i]) return false; 
		return true;
	}
	public static void main(String[] args) {
		int i,j,n;
		for(i=2;i<10000;i++) {
			for(j=i*2;j<10000;j+=i) {
				sieve[j]=true;
			}
		}
		for(i=1000;i<9999;i++) {
			if(sieve[i]) continue;
			n=0;
			for(j=i+3330;j<10000;j+=3330) {
				if(!sieve[j] && isPerm(i,j)) {
					n++;
					System.out.print(j+" ");
				}
			}
			if(n>0) System.out.println(i);
		}
	}

}
