package prob21;

public class AmicableNumbers {
	public static int sumOfFactors[] = new int[100000];
	public static void main(String[] args) {
		int i,j;
		long amisum=0;
		for(i=1;i<=5000;i++) {
			for(j=i*2;j<10000;j+=i) {
				sumOfFactors[j]+=i;
			}
		}
		for(i=1;i<10000;i++) {
			if(i==sumOfFactors[sumOfFactors[i]] && i!=sumOfFactors[i]) {
				System.out.println(i+" "+sumOfFactors[i]);
				amisum+=i;
			}
		}
		System.out.println(amisum);
	}

}
