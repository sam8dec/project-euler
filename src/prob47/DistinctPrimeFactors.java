package prob47;

public class DistinctPrimeFactors {
	public static int[] factorCount = new int[1000000];
	public static void main(String[] args) {
		int i,j;
		for(i=2;i<1000000;i++) {
			if(factorCount[i]==0) {
				for(j=i*2;j<1000000;j+=i) {
					factorCount[j]++;
				}
			}
			else {
				if(factorCount[i]==4 && factorCount[i+1]==4 && factorCount[i+2]==4 && factorCount[i+3]==4) {
					break;
				}
			}
		}
		System.out.println(i);
	}

}
