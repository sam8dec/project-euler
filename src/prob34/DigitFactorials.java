package prob34;

public class DigitFactorials {
	public static int factorial(int n) {
		if(n==0) return 1; else return n*factorial(n-1);
	}
	public static void main(String[] args) {
		int fact[] = new int[10];
		int sum=0,i,k;
		for(i=0;i<10;i++) fact[i] = factorial(i);
		for(i=10;i<10000000;i++) {
			k=i;
			int dfs=0;
			while(k>0) {
				dfs+=fact[k%10];
				k/=10;
			}
			if(dfs==i) {
				System.out.println(i);
				sum+=dfs;
			}
		}
		System.out.println(sum);
	}

}
