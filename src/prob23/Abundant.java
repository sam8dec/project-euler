package prob23;

public class Abundant {
	
	public static void main(String[] args) {
		boolean isAbundant[] = new boolean[28124];
		boolean targetNumber[] = new boolean[28124];
		int i,j;
		int k=0;
		for(i=1;i<=28123;i++) {
			int sum=0;
			for(j=1;j*j<=i;j++) {
				if(i%j==0) {
					sum+=j;
					if(j*j!=i && j!=1) {
						sum+=i/j;
					}
				}
			}
			
			if(sum>i) {
				isAbundant[i]=true;
				k++;
			}
			
		}
		System.out.println(k);
		for(i=1;i<28123;i++) {
			if(!isAbundant[i]) continue;
			for(j=i;j<=28123;j++) {
				if(isAbundant[j] && i+j<=28123) {
					targetNumber[i+j]=true;
				}
			}
		}
		int s=0;
		for(i=1;i<=28123;i++) if(!targetNumber[i]) {System.out.println(i);s+=i;}
		System.out.println(s);
	}

}
