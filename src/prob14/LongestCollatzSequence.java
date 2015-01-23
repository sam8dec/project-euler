package prob14;

public class LongestCollatzSequence {
	public static int chain_length[] = new int[1000000];
	
	public static int chainLength(long N) {
		//System.out.println(N);
		//if(N==1) System.out.println("----------------------");
		if (N<1000000) {
			int N1 = (int) (N);
			if(chain_length[N1]!=0) {
				return chain_length[N1];
			} else {
				chain_length[N1] = 1 + ((N1%2==0)?chainLength(N1/2):chainLength(3*N1+1));
				return chain_length[N1];
			}
		} else {
			return 1 + ((N%2==0)?chainLength(N/2):chainLength(3*N+1));
		}
	}
	public static void main(String[] args) {
		int i,max=0,N=0;
		chain_length[1]=1;
		for(i=2;i<1000000;i++) {
			System.out.println(i);
			if(chainLength(i)>max) {
				max=chainLength(i);
				N=i;
			}
		}
		System.out.println(N);
	}

}
